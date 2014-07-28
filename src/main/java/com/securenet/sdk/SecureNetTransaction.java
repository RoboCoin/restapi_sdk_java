package com.securenet.sdk;

import java.awt.image.BufferedImage;
import java.rmi.RemoteException;
import java.util.List;

import com.securenet.gateway.API.Contracts.CARD;
import com.securenet.gateway.API.Contracts.CHECK;
import com.securenet.gateway.API.Contracts.GATEWAYRESPONSE;
import com.securenet.gateway.API.Contracts.IMAGE;
import com.securenet.gateway.API.Contracts.TRANSACTION;
import com.securenet.gateway.API.Contracts.TRANSACTION_VAULT;
import com.securenet.sdk.AuthorizeRequest.Type;
import com.securenet.sdk.Check.VERIFICATION;
import com.securenet.sdk.response.ChargeResponse;
import com.securenet.sdk.response.CreditResponse;
import com.securenet.sdk.response.PaymentType;
import com.securenet.sdk.response.RefundRequest;
import com.securenet.sdk.response.RefundResponse;
import com.securenet.sdk.response.SecureNetResponse;
import com.securenet.sdk.response.StoredTransaction;
import com.securenet.sdk.response.VerificationResponse;


class SecureNetTransaction {

	SecureNet secureNet;
	
	SecureNetTransaction(SecureNet secureNet) {
		this.secureNet = secureNet;
	}
	
	ChargeResponse authorize(AuthorizeRequest request) {
		return charge(request, TransactionCode.AUTH);
	}
	
	CaptureResponse capture(CaptureRequest request) {
		if (request.transactionId == null || request.transactionId.equals(0)) {
			return getErrorCaptureResponse("TODO", "Transaction ID must be present for refund");
		}
		StoredTransaction storedTransaction = getTransactionById(request.transactionId);
		if (storedTransaction == null) {
			return getErrorCaptureResponse("TODO", "Transaction ID " + request.transactionId + " not found");
		}

		TRANSACTION transaction = secureNet.mapper.getCaptureTransaction(request, storedTransaction);
		transaction.setMERCHANT_KEY(secureNet.merchantKey);
		GATEWAYRESPONSE gatewayResponse = null;
		CaptureResponse response = new CaptureResponse();
		try {
			gatewayResponse = secureNet.getGatewayProxy().processTransaction(transaction);
		} catch (RemoteException e) {
			response.success = false;
			response.errorCode = "TODO";
			response.message = e.getLocalizedMessage();
			return response;
		}
		if (request.includeRawObjects) {
			response.rawRequest = transaction;
			response.rawResponse = gatewayResponse;
		}
		secureNet.mapper.setTransactionResponseValues(response, gatewayResponse.getTRANSACTIONRESPONSE());
		response.transactionId = gatewayResponse.getTRANSACTIONRESPONSE().getTRANSACTIONID();
		return response;
	}
	
	ChargeResponse authorizeAndCapture(AuthorizeRequest request) {
		return charge(request, TransactionCode.AUTH_CAPTURE);
	}
	
	CreditResponse credit(CreditRequest request) {
		TRANSACTION transaction = new TRANSACTION();
		transaction.setMERCHANT_KEY(secureNet.merchantKey);
		transaction.setCODE(TransactionCode.FORCE_CREDIT.representation);
		transaction.setAMOUNT(request.amount);
		if (request.getPaymentType() != null) {
			switch (request.getPaymentType()) {
			case CARD:
				secureNet.mapper.setCardDetails(transaction, request.card);
				break;
			case CHECK:
				secureNet.mapper.setCheckDetails(transaction, request.check);
				break;
			default:
				// no-op
			}
		}
		if (request.orderId != null && ! "AUTO".equals(request.orderId.trim())) {
			transaction.setORDERID(request.orderId);
		}
		CreditResponse response = new CreditResponse();
		GATEWAYRESPONSE gatewayResponse = processTransaction(transaction, response);
		response.request = request;
		if (request.includeRawObjects) {
			response.rawRequest = transaction;
			response.rawResponse = gatewayResponse;
		}
		if (gatewayResponse != null) {
			secureNet.mapper.setTransactionResponseValues(response, gatewayResponse.getTRANSACTIONRESPONSE());
			response.transactionId = gatewayResponse.getTRANSACTIONRESPONSE().getTRANSACTIONID();
		}
		return response;
	}
	
	RefundResponse refund(RefundRequest request) {
		if (request.transactionId == null || request.transactionId.equals(0)) {
			return getErrorRefundResponse("TODO", "Transaction ID must be present for refund");
		}
		StoredTransaction transaction = getTransactionById(request.transactionId);
		if (transaction == null) {
			return getErrorRefundResponse("TODO", "Transaction ID " + request.transactionId + " not found");
		}
		if (transaction.settlementData == null && ! request.holdAuthorization) { 
			if (request.amount == null) {
				RefundResponse response = internalRefund(request, TransactionCode.VOID, transaction); // This will fail if the transaction is not eligible for VOIDing
				if (response.success) {
					return response;
				}
			} else {
				RefundResponse response = internalRefund(request, TransactionCode.PARTIAL_VOID, transaction); // This will fail if the transaction is not eligible for PARTIAL_VOIDing
				if (response.success) {
					return response;
				}
			}
		}
		return internalRefund(request, TransactionCode.REFUND, transaction);
	}
	
	SecureNetResponse update(TransactionUpdateRequest request) {
		SecureNetResponse response = new SecureNetResponse();
		if (request.referenceTransactionId == null || request.referenceTransactionId.equals(0)) {
			response.success = false;
			response.errorCode = "TODO";
			response.message = "Reference Transaction ID must be present for update";
			return response;
		}
		StoredTransaction reference = getTransactionById(request.referenceTransactionId);
		if (reference == null) {
			return getErrorRefundResponse("TODO", "Transaction ID " + request.referenceTransactionId + " not found");
		}

		BufferedImage signature = secureNet.mapper.decodeImageData(request.signatureImage);
		if (signature != null) {
			TRANSACTION transaction = new TRANSACTION();
			transaction.setREF_TRANSID("" + request.referenceTransactionId);
			transaction.setMERCHANT_KEY(secureNet.merchantKey);
			transaction.setCODE(TransactionCode.UDPATE.representation);
			transaction.setIMAGE(new IMAGE(null, request.signatureImage.getBytes()));
			GATEWAYRESPONSE gatewayResponse = processTransaction(transaction, response);
			if (! response.success) {
				return response;
			}
		}
		
		TRANSACTION transaction = new TRANSACTION();
		transaction.setREF_TRANSID("" + request.referenceTransactionId);
		transaction.setMERCHANT_KEY(secureNet.merchantKey);
		transaction.setCODE(TransactionCode.UDPATE.representation);
		transaction.setMETHOD(reference.method);

		ExtendedInformation info = new ExtendedInformation();
		info.purchaseOrder = request.purchaseOrder;
		info.invoiceDescription = request.invoiceDescription;
		info.invoiceNumber = request.invoiceNumber;
		info.orderDate = request.orderDate;
		info.taxData = request.taxData;
		info.dutyAmount = request.dutyAmount;
		info.freightAmount = request.freightAmount;
		info.destinationAddress = request.destinationAddress;
		info.originAddress = request.originAddress;
		info.products = request.products;
		
		secureNet.mapper.setLevel2(transaction, info);
		secureNet.mapper.setLevel3(transaction, info);
		
		GATEWAYRESPONSE gatewayResponse = processTransaction(transaction, response);
		return response;
	}
	
	private StoredTransaction getTransactionById(Integer transactionId) {
		TransactionSearchRequest search = new TransactionSearchRequest();
		search.transactionId = transactionId;
		List<StoredTransaction> list = secureNet.getTransactions(search);
		return list.isEmpty() ? null : list.get(0);
	}
	
	/* (non-Javadoc)
	 * @see com.securenet.sdk.SecueNet#voidTransaction(com.securenet.sdk.RefundRequest)
	 */
	RefundResponse voidTransaction(VoidRequest request) {
		StoredTransaction transaction = getTransactionById(request.transactionId);
		if (transaction == null) {
			return getErrorRefundResponse("TODO", "Transaction ID " + request.transactionId + " not found");
		}
		if (request.transactionId == null || request.transactionId.equals(0)) {
			return getErrorRefundResponse("TODO", "Transaction ID must be present for void");
		}
		return internalRefund(request, request.amount == null ? TransactionCode.VOID : TransactionCode.PARTIAL_VOID, transaction);
	}
	
	VerificationResponse verify(VerificationRequest request) {
		VerificationResponse response = new VerificationResponse();
		TRANSACTION transaction = secureNet.mapper.getVerificationTransaction(request);
		transaction.setMERCHANT_KEY(secureNet.merchantKey);
		GATEWAYRESPONSE gatewayResponse = processTransaction(transaction, response);
		gatewayResponse = processTransaction(transaction, response);
		response.request = request;
		if (request.includeRawObjects) {
			response.rawRequest = transaction;
			response.rawResponse = gatewayResponse;
		}
		secureNet.mapper.setTransactionResponseValues(response, gatewayResponse.getTRANSACTIONRESPONSE());
		return response;
	}

	// The following are internal methods only
	
	private RefundResponse internalRefund(VoidRequest request, TransactionCode code, StoredTransaction oldTransaction) {
		TRANSACTION transaction = new TRANSACTION();
		transaction.setMERCHANT_KEY(secureNet.merchantKey);
		if (oldTransaction != null) {
			if (oldTransaction.cardNumber != null && oldTransaction.cardNumber.length() >= 4) {
				transaction.setCARD(new CARD());
				transaction.getCARD().setCARDNUMBER((oldTransaction.cardNumber.substring(oldTransaction.cardNumber.length() - 4)));
			} else if (oldTransaction.bankAccount != null && oldTransaction.bankAccount.length() >= 4) {
				transaction.setCHECK(new CHECK());
				transaction.getCHECK().setACCOUNTTYPE(oldTransaction.bankAccountType == null ? null : oldTransaction.bankAccountType.codes.get(0));
				transaction.getCHECK().setACCOUNTNUM((oldTransaction.bankAccount.substring(oldTransaction.bankAccount.length() - 4)));
				transaction.getCHECK().setACCOUNTNAME(oldTransaction.bankAccountName);
				if (request.checkType != null) {
					transaction.getCHECK().setSECCODE(request.checkType.getCode());
				} else {
					transaction.getCHECK().setSECCODE(oldTransaction.checkType == null ? null : oldTransaction.checkType.getCode());
				}
			}
		}
		transaction.setCODE(code.representation);
		if (request.amount != null) {
			transaction.setAMOUNT(request.amount);
		} else {
//			transaction.setAMOUNT(BigDecimal.ZERO);
			transaction.setAMOUNT(oldTransaction.authorizedAmount); // TODO really???
		}
		if (request.orderId != null && ! "AUTO".equals(request.orderId.trim())) {
			transaction.setORDERID(request.orderId);
		}
		transaction.setMETHOD(oldTransaction.method);
		transaction.setREF_TRANSID("" + request.transactionId);		
		RefundResponse response = new RefundResponse();
		GATEWAYRESPONSE gatewayResponse = processTransaction(transaction, response);
		response.request = request;
		if (request.includeRawObjects) {
			response.rawRequest = transaction;
			response.rawResponse = gatewayResponse;
		}
		secureNet.mapper.setTransactionResponseValues(response, gatewayResponse.getTRANSACTIONRESPONSE());
		response.transactionId = gatewayResponse.getTRANSACTIONRESPONSE().getTRANSACTIONID();
		response.type = code;
		return response;
	}
	
	private GATEWAYRESPONSE processTransaction(TRANSACTION transaction, SecureNetResponse response) {
		try {
			GATEWAYRESPONSE gatewayResponse = secureNet.getGatewayProxy().processTransaction(transaction);
			secureNet.mapper.setSuccessValues(response, gatewayResponse);
			return gatewayResponse;
		} catch (RemoteException e) {
			response.success = false;
			response.errorCode = "TODO";
			response.message = e.getLocalizedMessage();
			response.rawRequest = transaction;
			return null;
		}
	}
	
	private ChargeResponse charge(AuthorizeRequest request, TransactionCode code) {
		ChargeResponse response;
		if (isVaultTransaction(request, code)) {
			response = chargeVaultTransaction(request, code);
		} else {
			response = chargeStandaloneTransaction(request, code);
		}
		if (request.includeRequest) {
			response.request = request;
		}
		return response;
	}
	
	private ChargeResponse chargeStandaloneTransaction(AuthorizeRequest request, TransactionCode code) {
		ChargeResponse response = new ChargeResponse();
		TRANSACTION transaction = secureNet.mapper.getChargeTransaction(code, request);
		if (PaymentType.CHECK.equals(request.getPaymentType()) && ! TransactionCode.VERIFICATION.equals(code) && VERIFICATION.ACH_PROVIDER.equals(request.check.verification)) {
			VerificationRequest vreq = new VerificationRequest();
			vreq.amount = request.amount;
			vreq.check = request.check;
			vreq.test = request.test;
			VerificationResponse vresp = verify(vreq);
			if (! vresp.success) {
				secureNet.mapper.setAll(response, vresp);
				return response;
			}
		}
		transaction.setMERCHANT_KEY(secureNet.merchantKey);
		transaction.setSECONDARY_MERCHANT_KEY(secureNet.secondaryMerchantKey);
		if (Type.EBT.equals(request.getPaymentType())) {
			transaction.getMERCHANT_KEY().setADDITIONALINFO("11" + String.format("%1$-7s", request.electronicBenefitsTransfer.fnsNumber));
		}
		GATEWAYRESPONSE gatewayResponse = null;
		try {
			if (AuthorizeRequest.Type.REFERENCE.equals(request.getPaymentType())) {
				StoredTransaction ref = getTransactionById(request.getReferenceTransactionId());
				transaction.setMETHOD(ref.method);
			}
			gatewayResponse = secureNet.getGatewayProxy().processTransaction(transaction);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (request.includeRawObjects) {
			response.rawRequest = transaction;
			response.rawResponse = gatewayResponse;
		}
		secureNet.mapper.setTransactionResponseValues(response, gatewayResponse.getTRANSACTIONRESPONSE());
		secureNet.mapper.setChargeResponseValues(response, gatewayResponse);
		return response;
	}
	
	private ChargeResponse chargeVaultTransaction(AuthorizeRequest request, TransactionCode code) {
		ChargeResponse response = new ChargeResponse();
		TRANSACTION_VAULT transaction = secureNet.mapper.getVaultChargeTransaction(code, request);
		transaction.setMERCHANT_KEY(secureNet.merchantKey);
		transaction.getTRANSACTION().setSECONDARY_MERCHANT_KEY(secureNet.secondaryMerchantKey);
		GATEWAYRESPONSE gatewayResponse = null;
		try {
			gatewayResponse = secureNet.getGatewayProxy().processVaultTransaction(transaction);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (request.includeRawObjects) {
			response.rawRequest = transaction;
			response.rawResponse = gatewayResponse;
		}
		secureNet.mapper.setTransactionResponseValues(response, gatewayResponse.getTRANSACTIONRESPONSE());
		secureNet.mapper.setVaultResponseValues(response, gatewayResponse);
		return response;
	}
	
	private boolean isVaultTransaction(AuthorizeRequest request, TransactionCode code) {
		if (request.getPaymentType() == null) {
			return false;
		}
		if (request.getPaymentType() == AuthorizeRequest.Type.TOKEN) {
			return false;
		}
		if (request.isAddToVault() && (request.getPaymentType() == Type.CARD || request.getPaymentType() == Type.CHECK)) {
			return true;
		}
		return false;
	}
	
	private CaptureResponse getErrorCaptureResponse(String code, String error) {
		CaptureResponse response = new CaptureResponse();
		response.errorCode = code;
		response.message = error;
		return response;
	}

	private RefundResponse getErrorRefundResponse(String code, String error) {
		RefundResponse response = new RefundResponse();
		response.errorCode = code;
		response.message = error;
		return response;
	}


}
