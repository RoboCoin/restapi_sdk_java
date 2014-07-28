package com.securenet.sdk;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.commons.lang.StringUtils;

import com.securenet.gateway.API.Contracts.ABRESPONSE;
import com.securenet.gateway.API.Contracts.ACCOUNT_VAULT;
import com.securenet.gateway.API.Contracts.CARD;
import com.securenet.gateway.API.Contracts.CHECK;
import com.securenet.gateway.API.Contracts.CUSTOMER_BILL;
import com.securenet.gateway.API.Contracts.CUSTOMER_SHIP;
import com.securenet.gateway.API.Contracts.CUSTOMER_VAULT;
import com.securenet.gateway.API.Contracts.GATEWAYRESPONSE;
import com.securenet.gateway.API.Contracts.LEVEL2;
import com.securenet.gateway.API.Contracts.LEVEL3;
import com.securenet.gateway.API.Contracts.LEVEL3PRODUCT;
import com.securenet.gateway.API.Contracts.MPI;
import com.securenet.gateway.API.Contracts.OPERATIONPARAMETERS;
import com.securenet.gateway.API.Contracts.PRODUCT;
import com.securenet.gateway.API.Contracts.SERVICE;
import com.securenet.gateway.API.Contracts.TERMINAL;
import com.securenet.gateway.API.Contracts.TRANSACTION;
import com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE;
import com.securenet.gateway.API.Contracts.TRANSACTION_VAULT;
import com.securenet.gateway.API.Contracts.USERDEFINED;
import com.securenet.gateway.API.Contracts.VAULTACCOUNTRESPONSE;
import com.securenet.gateway.API.Contracts.VAULTCUSTOMERRESPONSE;
import com.securenet.sdk.response.AvsResult;
import com.securenet.sdk.response.CardCodeResult;
import com.securenet.sdk.response.ChargeResponse;
import com.securenet.sdk.response.CreditCardType;
import com.securenet.sdk.response.FleetCardType;
import com.securenet.sdk.response.PaymentType;
import com.securenet.sdk.response.ResultType;
import com.securenet.sdk.response.SecureNetResponse;
import com.securenet.sdk.response.SettlementData;
import com.securenet.sdk.response.StoredTransaction;
import com.securenet.sdk.response.TransactionData;
import com.securenet.sdk.response.VaultData;

/**
 * SdkToWsdlMapper is used purely to convert between Java SDK objects and the odd WSDL objects that they represent. It should only be used by the SecureNet class. It should also not contain any business logic.
 */
class SdkToWsdlMapper {

	protected SdkToWsdlMapper() {
	}

	TRANSACTION getVerificationTransaction(VerificationRequest request) {
		TRANSACTION transaction = new TRANSACTION();
		transaction.setCODE(TransactionCode.VERIFICATION.representation);
		transaction.setAMOUNT(request.amount);
		transaction.setTEST(request.test ? "TRUE" : "FALSE");
		if (request.card != null) {
			setCardDetails(transaction, request.card);
		} else if (request.check != null) {
			setCheckDetails(transaction, request.check);
		}
		return transaction;
	}

	void setCardDetails(TRANSACTION transaction, Card card) {
		transaction.setCARD(getCard(card));
		if (!isBlank(card.ksn)) {
			transaction.setMETHOD("DB");
		} else {
			transaction.setMETHOD("CC");
		}
		if (!isBlank(card.address) || !isBlank(card.email)) {
			transaction.setCUSTOMER_BILL(getBillingAddress(card));
		}
	}

	void setCheckDetails(TRANSACTION transaction, Check check) {
		transaction.setCHECK(getCheck(check));
		transaction.setMETHOD("ECHECK");
		if (!isBlank(check.address) || !isBlank(check.email)) {
			transaction.setCUSTOMER_BILL(getBillingAddress(check));
		}
		switch (check.verification) {
		case CERTEGY:
			transaction.getCHECK().setADDITIONALINFO("01");
			break;
		case ACH_PROVIDER:
			if (TransactionCode.VERIFICATION.representation.equals(transaction.getCODE())) {
				transaction.getCHECK().setADDITIONALINFO("02");
			}
			break;
		case NONE:
		default:
			// no-op
		}
	}
	
	TRANSACTION getCaptureTransaction(CaptureRequest request, StoredTransaction prior) {
		TRANSACTION transaction = new TRANSACTION();
		transaction.setCODE(TransactionCode.PRIOR_AUTH_CAPTURE.representation);
		transaction.setAMOUNT(request.amount);
		transaction.setREF_TRANSID("" + request.transactionId);
		transaction.setMETHOD("CC");
		CARD card = new CARD();
		card.setCARDNUMBER(prior.cardNumber.substring(prior.cardNumber.length() - 4));
		transaction.setCARD(card);
		transaction.setAUTHCODE(prior.authorizationCode);
		transaction.setTEST(request.test ? "TRUE" : "FALSE");
		setCustomerIp(transaction, request.ipAddress);
		setExtendedInformation(transaction, request.extendedInformation, null, null);
		return transaction;
	}

	TRANSACTION getChargeTransaction(TransactionCode transactionCode, AuthorizeRequest request) {
		TRANSACTION transaction = new TRANSACTION();
		transaction.setCODE(request.allowPartialCharges ? transactionCode.representationWithPartial : transactionCode.representation);
		transaction.setAMOUNT(request.amount);
		if (request.getPaymentType() != null) {
			switch (request.getPaymentType()) {
			case CARD:
				setCardDetails(transaction, request.card);
				if (StringUtils.isNotBlank(request.card.trackData)) {
					transaction.setINDUSTRYSPECIFICDATA("0"); 
					// This may be overridden by extendedInformation.typeOfGoods later  
				}
				break;
			case EBT:
				transaction.setCARD(getCard(request.electronicBenefitsTransfer));
				transaction.setMETHOD("EBT");
			case CHECK:
				setCheckDetails(transaction, request.check);
				break;
			case TOKEN:
				transaction.setCUSTOMERID(request.paymentVaultToken.customerId);
				transaction.setPAYMENTID(request.paymentVaultToken.paymentMethodId);
				transaction.setTRANSACTION_SERVICE(1);
				transaction.setOVERRIDE_FROM(3);
				if (request.paymentVaultToken.type == null) {
					transaction.setMETHOD("CC");
				} else {
					switch (request.paymentVaultToken.type) {
					case CREDIT_CARD:
						transaction.setMETHOD("CC");
						break;
					case CHECK:
						transaction.setMETHOD("ECHECK");
						break;
					default:
						// TODO - Should always be passed in
						transaction.setMETHOD("CC");
					}
				}
				// TODO why do I need to set method here?
				break;
			case REFERENCE:
				transaction.setREF_TRANSID("" + request.referenceTransactionId);
				// TODO required according to docs but always fails SOAP validation if I pass it in
				// CARD card = );
				// card.setCARDNUMBER(request.referenceTransaction.lastFourDigits));
				// card.setEXPDATE(("%2d%2d", request.referenceTransaction.expirationMonth, request.referenceTransaction.expirationYear))));
				// transaction.setCARD(card));
				transaction.setMETHOD("CC");
			default:
				break;
			}
		}
		transaction.setTEST(request.test ? "TRUE" : "FALSE");
		if (request.orderId != null && !"AUTO".equals(request.orderId.trim())) {
			transaction.setORDERID(request.orderId);
		}
		setCashBack(transaction, request.cashBackAmount);
		setExtendedInformation(transaction, request.extendedInformation, request.card == null ? null : request.card.firstName, request.card == null ? null : request.card.lastName);
		if (request.card != null) {
			setMpi(transaction, request.card.secureIndicator);
		}
		setSoftDescriptor(transaction, request.cardStatementLabel);
		setCustomerIp(transaction, request.ipAddress);
		transaction.setNOTE(request.notes);
		transaction.setUSERDEFINED(getUserDefinedFields(request.userDefinedFields));
		return transaction;
	}

	void setExtendedInformation(TRANSACTION transaction, ExtendedInformation info, String firstName, String lastName) {
		setIndustrySpecificData(transaction, info);
		setMailOrder(transaction, info);
		setLevel2(transaction, info);
		setLevel3(transaction, info);
		setTerminal(transaction, info);
		setRetailLane(transaction, info);
		setDeveloperApplication(transaction, info);
		transaction.setDEVICECODE(info.deviceCode);
		transaction.setENTRYSOURCE(info.entrySource);
		transaction.setINVOICENUM(info.invoiceNumber);
		transaction.setINVOICEDESC(info.invoiceDescription);
		setService(transaction, info);
		if (!isBlank(info.destinationAddress)) {
			transaction.setCUSTOMER_SHIP(getShippingAddress(info.destinationAddress, firstName, lastName));
		}
	}
	
	void setCashBack(TRANSACTION transaction, BigDecimal amount) {
		if (amount == null) {
			return;
		}
		if (amount.equals(BigDecimal.ZERO)) {
			return;
		}
		transaction.setCASHBACK_AMOUNT(amount);
	}
	
	void setCustomerIp(TRANSACTION transaction, String ipAddress) {
		if (isBlank(ipAddress)) {
			return;
		}
		if (ipAddress.contains(":")) { // SecureNet cannot accept IPv6 formatted addresses)
			return;
		}
		transaction.setCUSTOMERIP(ipAddress);
	}
	
	void setIndustrySpecificData(TRANSACTION transaction, ExtendedInformation info) {
		if (info.cardPresent == true) {
			transaction.setINDUSTRYSPECIFICDATA("0");
			return;
		}
		if (info.typeOfGoods == null) {
			return;
		}
		transaction.setINDUSTRYSPECIFICDATA(info.typeOfGoods == GoodsType.DIGITAL ? "D" : "P");
	}
	
	void setSoftDescriptor(TRANSACTION transaction, String label) {
		if (isBlank(label)) {
			return;
		}
		transaction.setSOFTDESCRIPTOR(label);
	}
	
	void setMailOrder(TRANSACTION transaction, ExtendedInformation info) {
		if (info.mailOrTelephoneOrderData == null) {
			return;
		}
		if (info.mailOrTelephoneOrderData.type == null) {
			return;
		}
		switch (info.mailOrTelephoneOrderData.type) {
		case SINGLE_PURCHASE:
			transaction.setINDUSTRYSPECIFICDATA("1");
			return;
		case RECURRING:
			transaction.setINDUSTRYSPECIFICDATA("2");
			return;
		case INSTALLMENT:
			transaction.setINDUSTRYSPECIFICDATA("1");
			transaction.setINSTALLMENT_SEQUENCENUM((short) info.mailOrTelephoneOrderData.currentInstallment);
			transaction.setTOTAL_INSTALLMENTCOUNT((short) info.mailOrTelephoneOrderData.totalNumberOfInstallments);
			return;
		}
	}

	void setRetailLane(TRANSACTION transaction, ExtendedInformation info) {
		if (info.retailLaneNumber == null) {
			return;
		}
		transaction.setRETAIL_LANENUM(info.retailLaneNumber);
	}
	
	void setService(TRANSACTION transaction, ExtendedInformation info) {
		if (info.serviceData == null || (info.serviceData.server == null && (info.serviceData.gratuityAmount == null || info.serviceData.gratuityAmount.equals(0)))) {
			return;
		}
		SERVICE service = new SERVICE();
		if (! isBlank(info.serviceData.server)) {
			service.setSERVERNUM(info.serviceData.server);
		}
		service.setGRATUITY(info.serviceData.gratuityAmount);		
		transaction.setSERVICE(service);
	}

	void setDeveloperApplication(TRANSACTION transaction, ExtendedInformation info) {
		if (info.developerApplication == null) {
			return;
		}
		transaction.setDEVELOPERID(info.developerApplication.developerId);
		transaction.setVERSION(info.developerApplication.version);
	}

	StoredTransaction getStoredTransaction(TRANSACTIONRESPONSE in) {
		StoredTransaction out = new StoredTransaction();
		out.authorizationCode = in.getAUTHCODE();
		out.authorizedAmount = in.getAUTHORIZEDAMOUNT();
		out.avsCode = in.getAVS_RESULT_CODE();
		out.avsResult = AvsResult.getByCode(out.avsCode);
		out.cardCodeCode = in.getCARD_CODE_RESPONSE_CODE();
		out.cardCodeResult = CardCodeResult.getByCode(out.cardCodeCode);
		// TODO card level results
		if (! isBlank(in.getBANK_ACCOUNTTYPE())) {
			out.bankAccountType = CheckingAccountType.getByCode(in.getBANK_ACCOUNTTYPE());
			out.bankAccountName = in.getBANK_ACCOUNTNAME();
			out.bankAccount = in.getLAST4DIGITS();
		}
		out.paymentTypeCode = in.getCARDTYPE();
		out.paymentTypeResult = PaymentType.getByCode(out.paymentTypeCode);
		out.creditCardType = CreditCardType.getByCode(out.paymentTypeCode);
		out.fleetCardType = FleetCardType.getByCode(out.paymentTypeCode);
		out.level2Valid = "TRUE".equals(in.getLEVEL2_VALID()) ? true : null;
		out.level3Valid = "TRUE".equals(in.getLEVEL3_VALID()) ? true : null;
		if (out.creditCardType != null) {
			switch (out.creditCardType) {
			case AMEX:
				out.cardNumber = "XXXX XXXXXX X" + in.getLAST4DIGITS();
				break;
			default:
				out.cardNumber = "XXXX XXXX XXXX " + in.getLAST4DIGITS();
			}
		}
		out.authorizedAmount = in.getAUTHORIZEDAMOUNT();
		out.orderId = in.getORDERID();
		out.transactionId = in.getTRANSACTIONID();
		out.secureNetId = in.getSECURENETID();
		if (in.getTRANSACTIONDATETIME() != null && in.getTRANSACTIONDATETIME() != null) {
			out.transactionData = new TransactionData();
			out.transactionData.amount = in.getTRANSACTIONAMOUNT();
			out.transactionData.date = getDateFromString(in.getTRANSACTIONDATETIME());
		}
		if (in.getSETTLEMENTDATETIME() != null && in.getSETTLEMENTDATETIME() != null) {
			out.settlementData = new SettlementData();
			out.settlementData.amount = in.getSETTLEMENTAMOUNT();
			out.settlementData.date = getDateFromString(in.getSETTLEMENTDATETIME());
			out.settlementData.batchId = in.getBATCHID();
			if (out.settlementData.batchId == null && out.settlementData.date.equals(out.transactionData.date) && out.settlementData.amount.equals(out.transactionData.amount)) {
				out.settlementData = null;
			}
		}
		out.method = in.getMETHOD();
		out.type = TransactionCode.getFromCode(in.getCODE());
		out.allowedPartialCharges = TransactionCode.allowsPartial(in.getCODE());
		if ("EBT".equals(in.getMETHOD())) {
			out.fnsNumber = in.getADDITIONALDATA2();
			out.voucherNumber = in.getADDITIONALDATA3();
		} else if ("DB".equals(in.getMETHOD())) {
			out.traceNumber = in.getADDITIONALDATA2();
			out.surchargeAmount = in.getADDITIONALAMOUNT();
			out.cashbackAmount = in.getCASHBACK_AMOUNT();
		} else if (out.fleetCardType != null) {
			out.fleetCardInfo = in.getADDITIONALDATA2();
		}
		return out;
	}

	TRANSACTION_VAULT getVaultChargeTransaction(TransactionCode transactionCode, AuthorizeRequest request) {

		TRANSACTION_VAULT vaultTransaction = new TRANSACTION_VAULT();

		TRANSACTION transaction = getChargeTransaction(transactionCode, request);
		vaultTransaction.setTRANSACTION(transaction);

		// Initial charge with addToVault

		transaction.setTRANSACTION_SERVICE(3); // Otherwise you get a message 'Invalid TRANSACTION_SERVICE Value. Valid value is only 3'

		OPERATIONPARAMETERS parameters = new OPERATIONPARAMETERS();
		parameters.setACTIONCODE(1);
		parameters.setADD_IF_DECLINED(request.isAddToVaultOnFailure() ? 1 : 0);
		vaultTransaction.setOPERATIONPARAMETERS(parameters);

		CUSTOMER_VAULT customerVault = new CUSTOMER_VAULT();
		ACCOUNT_VAULT accountVault = new ACCOUNT_VAULT();

		CUSTOMER_BILL customerBill = null;
		switch (request.getPaymentType()) {
		case CARD:
			accountVault.setCARD(getCard(request.card));
			customerBill = getBillingAddress(request.card);
			break;
		case CHECK:
			accountVault.setCHECK(getCheck(request.check));
			customerBill = getBillingAddress(request.check);
			break;
		default:
			// TODO
		}

		String customerId = "AUTO";
		String paymentId = "AUTO";

		if (request.newVaultToken != null) {
			customerId = stringDefault(request.newVaultToken.customerId, customerId);
			paymentId = stringDefault(request.newVaultToken.paymentMethodId, paymentId);
		}

		customerVault.setCUSTOMER_BILL(customerBill);
		customerVault.setCUSTOMERID(customerId);
		customerVault.setCSDI(1);
		vaultTransaction.setCUSTOMER_VAULT(customerVault);

		accountVault.setACDI(1);
		accountVault.setCUSTOMER_BILL(customerBill);
		accountVault.setMETHOD(transaction.getMETHOD());
		accountVault.setCUSTOMERID(customerId);
		accountVault.setPAYMENTID(paymentId);
		vaultTransaction.setACCOUNT_VAULT(accountVault);

		return vaultTransaction;
	}

	void setTerminal(TRANSACTION transaction, ExtendedInformation info) {
		if (isBlank(info.storeNumber) && isBlank(info.terminalId)) {
			return;
		}
		TERMINAL terminal = new TERMINAL();
		terminal.setSTORENUMBER(info.storeNumber);
		terminal.setTERMINALID(info.terminalId);
		transaction.setTERMINAL(terminal);
	}

	void setMpi(TRANSACTION transaction, SecureIndicator in) {
		if (in == null || isBlank(in.indicator) || isBlank(in.value)) {
			return;
		}
		MPI mpi = new MPI();
		mpi.setAUTHINDICATOR(in.indicator);
		mpi.setAUTHVALUE(in.value);
		transaction.setMPI(mpi);
	}

	PRODUCT getProduct(Product in) {
		PRODUCT product = new PRODUCT();
		product.setAMOUNT(in.totalAmount);
		product.setCODE(in.itemCode);
		product.setDESCRIPTION(in.itemDescription);
		product.setNAME(in.itemName);
		product.setQUANTITY("" + in.quantity);
		product.setTAX(in.taxAmount);
		product.setTAXABLE(in.taxable ? "Yes" : "No");
		product.setUNIT(in.unit);
		product.setUNITPRICE(in.unitPrice);
		return product;
	}

	void setLevel2(TRANSACTION transaction, ExtendedInformation info) {
		LEVEL2 level2 = new LEVEL2();
		if (info.dutyAmount == null) {
			return;
		}
		level2.setDUTY(info.dutyAmount);
		if (info.freightAmount == null) {
			return;
		}
		level2.setFREIGHT(info.freightAmount);
		if (isBlank(info.purchaseOrder)) {
			return;
		}
		level2.setPONUM(info.purchaseOrder);
		if (info.taxData == null || info.taxData.status == null || info.taxData.amount == null) {
			return;
		}
		level2.setTAX(info.taxData.amount);
		switch (info.taxData.status) {
		case EXEMPT:
			level2.setTAXFLAG("2");
			break;
		case INCLUDED:
			level2.setTAXFLAG("1");
			break;
		case NOT_INCLUDED:
			level2.setTAXFLAG("0");
			break;
		}
		transaction.setLEVEL2(level2);
	}

	void setLevel3(TRANSACTION transaction, ExtendedInformation info) {
		LEVEL3 level3 = new LEVEL3();
		if (info.orderDate == null) {
			return;
		}
		level3.setPURCHASER_ORDER_DATE(getDateTime(info.orderDate));
		if (info.products == null || info.products.isEmpty()) {
			return;
		}
		level3.setLEVEL3PRODUCTS(getLevel3Products(info.products));
		if (info.originAddress == null) {
			return;
		}
		level3.setZIPFROM(info.originAddress.zip);
		if (info.destinationAddress == null) {
			return;
		}
		level3.setZIPTO(info.destinationAddress.zip);
		level3.setCOUNTRYCODETO(info.destinationAddress.country);
		if (info.vatData != null) {
			level3.setMERCHANT_VAT_REGISTRATION_NUM(info.vatData.merchantVatNumber);
			level3.setPURCHASER_VAT_REGISTRATION_NUM(info.vatData.purchaserVatNumber);
			level3.setVATTAX_RATE(info.vatData.taxRate);
		}
		level3.setORDER_DISCOUNT_AMT(info.discountAmount == null ? BigDecimal.ZERO : info.discountAmount);
		transaction.setLEVEL3(level3);
	}

	LEVEL3PRODUCT[] getLevel3Products(List<Product> in) {
		List<LEVEL3PRODUCT> out = new ArrayList<LEVEL3PRODUCT>(in.size());
		for (Product product : in) {
			out.add(getLevel3Product(product));
		}
		return out.toArray(new LEVEL3PRODUCT[out.size()]);
	}

	LEVEL3PRODUCT getLevel3Product(Product in) {
		LEVEL3PRODUCT product = new LEVEL3PRODUCT();
		product.setALTTAXID(in.alternateTaxId);
		product.setCOMMODITYCODE(in.commodityCode);
		product.setDISCOUNTAMT(in.discountAmount);
		product.setDISCOUNT_INDICATOR(in.discountIndicator); // TODO translate
		product.setDISCOUNTRATE(in.discountRate);
		product.setGROSSNET_INDICATOR(in.grossNetIndicator); // TODO translate
		product.setITEMCODE(in.itemCode);
		product.setITEMNAME(in.itemName);
		product.setITEMTOTALAMT(in.totalAmount);
		product.setQUANTITY(in.quantity);
		product.setTAXAMT(in.taxAmount);
		product.setTAXRATE(in.taxRate);
		product.setTAXTYPE_APPLIED(in.taxTypeApplied); // TODO translate
		product.setUNIT(in.unit);
		product.setUNITPRICE(in.unitPrice);
		return product;
	}

	private CARD getCard(ElectronicBenefitsTransfer in) {
		if (in == null) {
			return null;
		}
		CARD card = new CARD();
		if (!isBlank(in.trackData)) {
			card.setTRACKDATA(in.trackData);
		} else {
			card.setADDITIONALINFO("11" + String.format("%1$-15s", in.voucherNumber));
		}
		return card;
	}

	CARD getCard(Card in) {
		if (in == null) {
			return null;
		}
		CARD card = new CARD();
		if (in.trackData != null && in.trackData.trim().length() > 0) {
			card.setTRACKDATA(in.trackData);
		} else if (in.ksn != null && in.pinBlock != null) {
			card.setKSN(in.ksn);
			card.setPINBLOCK(in.pinBlock);
		} else {
			card.setCARDNUMBER(in.number);
			if (in.expirationMonth != 0 && in.expirationYear != 0) {
				card.setEXPDATE(String.format("%02d%02d", in.expirationMonth, in.expirationYear));
			}
			card.setCARDCODE(in.cvv);
		}
		card.setKSN(in.ksn);
		card.setPINBLOCK(in.pinBlock);
		return card;
	}

	CHECK getCheck(Check in) {
		if (in == null) {
			return null;
		}
		CHECK check = new CHECK();
		if (!isBlank(in.micrData)) {
			check.setMICRDATA(in.micrData);
		} else {
			check.setACCOUNTNUM(in.accountNumber);
			check.setABACODE(in.routingNumber);
		}
		check.setACCOUNTNAME(in.name);
		check.setCHECKNUM(in.checkNumber);
		if (in.accountType == null) {
			check.setACCOUNTTYPE("CHECKING");
		} else {
			check.setACCOUNTTYPE(in.accountType.codes.get(0));
		}
		if (in.checkType != null) {
			check.setSECCODE(in.checkType.getCode());
		}
		return check;
	}

	String encodeImageData(BufferedImage image) {
		try {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			ImageIO.write(image, "bmp", os);
			return org.apache.axis.encoding.Base64.encode(os.toByteArray());
		} catch (IOException e) {
			return null;
		}
	}

	BufferedImage decodeImageData(String in) {
		if (isBlank(in)) {
			return null;
		}
		ByteArrayInputStream is = new ByteArrayInputStream(in.getBytes());
		BufferedImage out;
		try {
			out = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return out;
	}

	private boolean isBlank(Address address) {
		if (address == null) {
			return true;
		}
		if (address.line1 == null) {
			return true;
		}
		if (address.line1.trim().length() == 0) {
			return true;
		}
		return false;
	}

	String stringDefault(String in, String defaultValue) {
		return isBlank(in) ? defaultValue : in.trim();
	}

	protected boolean isBlank(String string) {
		return string == null || string.trim().length() == 0;
	}

	void setAddress(CUSTOMER_BILL customerBill, Address address) {
		if (address == null || customerBill == null) {
			return;
		}
		customerBill.setADDRESS(address.line1);
		customerBill.setCOMPANY(address.line2);
		customerBill.setCITY(address.city);
		customerBill.setSTATE(address.state);
		customerBill.setZIP(address.zip);
		customerBill.setCOUNTRY(address.country);
	}

	private CUSTOMER_BILL getBillingAddress(Card card) {
		if (card == null) {
			return null;
		}
		CUSTOMER_BILL address = new CUSTOMER_BILL();
		if (!isBlank(card.email)) {
			address.setEMAIL(card.email);
		}
		Address in = card.address;
		if (in == null) {
			return address;
		}
		setAddress(address, in);
		address.setFIRSTNAME(card.firstName);
		address.setLASTNAME(card.lastName);
		return address;
	}

	private CUSTOMER_BILL getBillingAddress(Check check) {
		if (check == null) {
			return null;
		}
		CUSTOMER_BILL address = new CUSTOMER_BILL();
		if (!isBlank(check.email)) {
			address.setEMAIL(check.email);
		}
		Address in = check.address;
		if (in == null) {
			return address;
		}
		setAddress(address, in);
		return address;
	}

	private CUSTOMER_SHIP getShippingAddress(Address in, String firstName, String lastName) {
		CUSTOMER_SHIP address = new CUSTOMER_SHIP();
		address.setFIRSTNAME(firstName);
		address.setLASTNAME(lastName);
		address.setADDRESS(in.line1);
		address.setCOMPANY(in.line2);
		address.setCITY(in.city);
		address.setSTATE(in.state);
		address.setZIP(in.zip);
		address.setCOUNTRY(in.country);
		return address;
	}

	protected void setTransactionResponseValues(SecureNetResponse response, TRANSACTIONRESPONSE transactionResponse) {
		response.success = transactionResponse.getRESPONSE_CODE().equalsIgnoreCase("1");
		response.message = transactionResponse.getRESPONSE_REASON_TEXT();
		if (!response.success) {
			response.errorCode = transactionResponse.getRESPONSE_REASON_CODE();
		}
		response.result = ResultType.getByCode(transactionResponse.getRESPONSE_REASON_CODE());
		if (!response.success && response.result == null) {
			response.result = ResultType.COMMUNICATION_ERROR;
		}
	}

	protected void setChargeResponseValues(ChargeResponse response, GATEWAYRESPONSE gatewayResponse) {
		TRANSACTIONRESPONSE transactionResponse = gatewayResponse.getTRANSACTIONRESPONSE();
		StoredTransaction transaction = getStoredTransaction(transactionResponse);
		response.transaction = transaction;
	}

	void setVaultResponseValues(ChargeResponse response, GATEWAYRESPONSE gatewayResponse) {
		setVaultResponseValues((SecureNetResponse) response, gatewayResponse);
		if (!response.success) {
			return;
		}
		setVaultTransactionResponseVaules(response, gatewayResponse);
	}

	void setVaultResponseValues(SecureNetResponse response, GATEWAYRESPONSE gatewayResponse) {
		VAULTCUSTOMERRESPONSE customerResponse = gatewayResponse.getVAULTCUSTOMERRESPONSE();
		setTransactionResponseValues(response, gatewayResponse.getTRANSACTIONRESPONSE());
		if (!response.success) {
			if (customerResponse != null) {
				if (isBlank(response.errorCode)) {
					response.message = customerResponse.getRESPONSE_REASON_TEXT();
					response.errorCode = customerResponse.getRESPONSE_REASON_CODE();
				}
			}
			return;
		}
	}

	void setVaultTransactionResponseVaules(ChargeResponse response, GATEWAYRESPONSE gatewayResponse) {
		setChargeResponseValues(response, gatewayResponse);
		VAULTCUSTOMERRESPONSE customerResponse = gatewayResponse.getVAULTCUSTOMERRESPONSE();
		VAULTACCOUNTRESPONSE accountResponse = gatewayResponse.getVAULTACCOUNTRESPONSE();
		if (customerResponse == null || accountResponse == null) {
			return;
		}
		response.transaction.vaultData = new VaultData();
		response.transaction.vaultData.token = new VaultToken();
		response.transaction.vaultData.token.customerId = customerResponse.getCUSTOMERID();
		response.transaction.vaultData.token.paymentMethodId = accountResponse.getPAYMENTID();
		response.transaction.vaultData.company = customerResponse.getCOMPANY();
		response.transaction.vaultData.firstName = customerResponse.getFIRSTNAME();
		response.transaction.vaultData.lastName = customerResponse.getLASTNAME();
		if (accountResponse.getACCOUNTTYPE() != null) {
			response.transaction.vaultData.token.type = PaymentType.CHECK;
		}
		// accountResponse.getLAST4DIGITS();
		// accountResponse.getMETHOD();
		// accountResponse.getCARDTYPE();
	}

	public USERDEFINED getUserDefinedFields(Map<Integer, String> in) {
		USERDEFINED out = new USERDEFINED();
		if (in != null) {
			for (Integer key : in.keySet()) {
				try {
					Method method = USERDEFINED.class.getMethod("setUD" + key, String.class);				
					method.invoke(out, in.get(key));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return out;
	}
	

	
	private String getDateTime(Date in) {
		return in == null ? null : new SimpleDateFormat("MMddyyyyhhmmss").format(in);
	}

	private Date getDateFromString(String in) {
		if (isBlank(in)) {
			return null;
		}
		try {
			if (in.contains("-")) {
				if (in.contains(".")) {
					return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.sss").parse(in);
				} else {
					return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(in);
				}
			}
			return new SimpleDateFormat("MMddyyyyhhMMss").parse(in);
		} catch (ParseException e) {
			return null;
		}
	}

	void setAll(SecureNetResponse in, SecureNetResponse that) {
		in.success = that.success;
		in.result = that.result;
		in.errorCode = that.errorCode;
		in.message = that.message;
		in.rawRequest = that.rawRequest;
		in.rawResponse = that.rawResponse;
	}

	void setSuccessValues(SecureNetResponse response, GATEWAYRESPONSE gatewayResponse) {
		VAULTCUSTOMERRESPONSE customerResponse = gatewayResponse.getVAULTCUSTOMERRESPONSE();
		if (customerResponse != null) {
			response.success = customerResponse.getRESPONSE_CODE().equalsIgnoreCase("1");
			if (!response.success) {
				response.message = customerResponse.getRESPONSE_REASON_TEXT();
				response.errorCode = customerResponse.getRESPONSE_REASON_CODE();
				response.result = ResultType.getByCode(response.errorCode);
				return;
			}
		}
		VAULTACCOUNTRESPONSE accountResponse = gatewayResponse.getVAULTACCOUNTRESPONSE();
		if (accountResponse != null) {
			response.success = accountResponse.getRESPONSE_CODE().equalsIgnoreCase("1");
			if (!response.success) {
				response.message = accountResponse.getRESPONSE_REASON_TEXT();
				response.errorCode = accountResponse.getRESPONSE_REASON_CODE();
				response.result = ResultType.getByCode(response.errorCode);
				return;
			}
		}
		ABRESPONSE abResponse = gatewayResponse.getABRESPONSE();
		if (abResponse != null) {
			response.success = abResponse.getRESPONSE_CODE().equalsIgnoreCase("1");
			if (!response.success) {
				response.message = abResponse.getRESPONSE_REASON_TEXT();
				response.errorCode = abResponse.getRESPONSE_REASON_CODE();
				response.result = ResultType.getByCode(response.errorCode);
				return;
			}
		}
		TRANSACTIONRESPONSE transactionResponse = gatewayResponse.getTRANSACTIONRESPONSE();
		if (transactionResponse != null) {
			response.success = transactionResponse.getRESPONSE_CODE().equalsIgnoreCase("1");
			if (!response.success) {
				response.message = transactionResponse.getRESPONSE_REASON_TEXT();
				response.errorCode = transactionResponse.getRESPONSE_REASON_CODE();
				response.result = ResultType.getByCode(response.errorCode);
				return;
			}
		}
		if (!response.success) {
			response.result = ResultType.getByCode(response.errorCode);
		}
	}

}
