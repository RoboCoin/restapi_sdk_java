package com.securenet.sdk;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.securenet.gateway.API.Contracts.ABRESPONSE;
import com.securenet.gateway.API.Contracts.ACCOUNT_VAULT;
import com.securenet.gateway.API.Contracts.CARD;
import com.securenet.gateway.API.Contracts.CHECK;
import com.securenet.gateway.API.Contracts.CUSTOMER_BILL;
import com.securenet.gateway.API.Contracts.CUSTOMER_VAULT;
import com.securenet.gateway.API.Contracts.GATEWAYRESPONSE;
import com.securenet.gateway.API.Contracts.INSTALLMENT;
import com.securenet.gateway.API.Contracts.OPERATIONPARAMETERS;
import com.securenet.gateway.API.Contracts.PAYMENT_AB;
import com.securenet.gateway.API.Contracts.PLAN_AB;
import com.securenet.gateway.API.Contracts.PLAN_AB_EXT;
import com.securenet.gateway.API.Contracts.RECURRING;
import com.securenet.gateway.API.Contracts.TRANSACTION_VAULT;
import com.securenet.gateway.API.Contracts.USERDEFINED;
import com.securenet.sdk.response.AddCustomerResponse;
import com.securenet.sdk.response.AddPaymentMethodResponse;
import com.securenet.sdk.response.GenericCustomerResponse;
import com.securenet.sdk.response.GenericPaymentMethodResponse;
import com.securenet.sdk.response.PaymentCycle;
import com.securenet.sdk.response.PaymentPlanResponse;
import com.securenet.sdk.response.PreVaultResponse;
import com.securenet.sdk.response.ResultType;
import com.securenet.sdk.response.SecureNetResponse;
import com.securenet.sdk.response.StoredCard;
import com.securenet.sdk.response.StoredInstallmentPaymentPlan;
import com.securenet.sdk.response.StoredInstallmentPaymentPlan.PaymentPosition;
import com.securenet.sdk.response.StoredPaymentPlan;
import com.securenet.sdk.response.StoredRecurringPaymentPlan;
import com.securenet.sdk.response.StoredScheduledPayment;
import com.securenet.sdk.response.StoredVariablePaymentPlan;
import com.securenet.sdk.response.UpdateCustomerResponse;
import com.securenet.sdk.response.VaultCustomer;
import com.securenet.sdk.response.VaultPaymentMethod;

class SecureNetVault {

	SecureNet secureNet;
	
	SecureNetVault(SecureNet secureNet) {
		this.secureNet = secureNet;
	}
	
	// Combinations
	
	static VaultToken getVaultToken(String encodedToken) {
		try {
			String[] arr = encodedToken.split(":", 2);
			VaultToken token = new VaultToken();
			token.customerId = arr[0];
			token.paymentMethodId = arr[1];
			return token;
		} catch (Exception e) {
			return null;
		}
	}
	
	static String getEncodedVaultToken(VaultToken token) {
		if (token == null) {
			return null;
		}
		return token.customerId + ":" + token.paymentMethodId;
	}
	
	PreVaultResponse preVault(PreVaultRequest request) {
		TRANSACTION_VAULT tv = new TRANSACTION_VAULT();
		CUSTOMER_VAULT cv = new CUSTOMER_VAULT();
		cv.setCSDI(1);
		cv.setCUSTOMERID("AUTO");
		tv.setMERCHANT_KEY(secureNet.merchantKey);
		tv.setCUSTOMER_VAULT(cv);
		tv.setOPERATIONPARAMETERS(new OPERATIONPARAMETERS(1, 0));
		ACCOUNT_VAULT av = new ACCOUNT_VAULT();
		av.setPAYMENTID("AUTO");
		av.setCUSTOMERID("AUTO");
		av.setMETHOD("CC");
		av.setPRIMARY("TRUE");
		av.setCARD(secureNet.mapper.getCard(request.card));
		tv.setACCOUNT_VAULT(av);
		PreVaultResponse response = new PreVaultResponse();
		response.rawRequest = tv;
		VaultToken token = new VaultToken();
		try {
			GATEWAYRESPONSE gr = secureNet.getGatewayProxy().processCustomerAndAccount(tv);
			secureNet.mapper.setSuccessValues(response, gr);
			if (response.success) {
				response.rawResponse = gr;
				if (gr.getVAULTCUSTOMERRESPONSE() != null) {
					token.customerId = gr.getVAULTCUSTOMERRESPONSE().getCUSTOMERID();
				}
				if (gr.getVAULTACCOUNTRESPONSE() != null) {
					token.paymentMethodId = gr.getVAULTACCOUNTRESPONSE().getPAYMENTID(); 
				}
				response.token = getEncodedVaultToken(token);
			}
		} catch (RemoteException e) {
			setError(response, e);
		}
		return response;
	}
	
	// Customers themselves
	
	VaultCustomer getVaultCustomer(String customerId) {
		try {
			VaultCustomer vc = convert(secureNet.getServiceProxy().getVaultCustomers(secureNet.merchantKey, customerId));
			ACCOUNT_VAULT[] arr = secureNet.getServiceProxy().getVaultAccountByCustomer(secureNet.merchantKey, customerId);
			vc.paymentMethods = convert(arr);
			vc.primaryPaymentMethodId = getPrimaryPaymentMethodId(arr);
			PLAN_AB_EXT[] plans = secureNet.getServiceProxy().getABAccounts_Ext(secureNet.merchantKey, customerId, 1);
			vc.installmentPaymentPlans = getInstallmentPlans(plans);
			vc.recurringPaymentPlans = getRecurringPlans(plans);
			vc.variablePaymentPlans = getVariablePlans(plans);
			return vc;
		} catch (RemoteException e) {
			return null;
		}
	}
	
	AddCustomerResponse addVaultCustomer(AddCustomerRequest request) {
		AddCustomerResponse response = new AddCustomerResponse();
		response.request = request;
		addOrUpdateVaultCustomer(request, new OPERATIONPARAMETERS(1, 0), response);
		return response;
	}
	
	UpdateCustomerResponse updateVaultCustomer(UpdateCustomerRequest request) {
		UpdateCustomerResponse response = new UpdateCustomerResponse();
		response.request = request;
		addOrUpdateVaultCustomer(request, new OPERATIONPARAMETERS(2, 0), response);
		if (! response.success) {
			return response;
		}
		if (request.primaryPaymentMethodId != null) {
			try {
				ACCOUNT_VAULT[] arr = secureNet.getServiceProxy().getVaultAccountByCustomer(secureNet.merchantKey, request.id);
				for (ACCOUNT_VAULT av : arr) {
					if (av != null && request.primaryPaymentMethodId.equals(av.getPAYMENTID())) {
						if ("TRUE".equals(av.getPRIMARY())) {
							return response;
						}
						TRANSACTION_VAULT tv = new TRANSACTION_VAULT();
						tv.setMERCHANT_KEY(secureNet.merchantKey);
						tv.setOPERATIONPARAMETERS(new OPERATIONPARAMETERS(2, 0));
						tv.setACCOUNT_VAULT(av);
						av.setPRIMARY("TRUE");
						GenericPaymentMethodResponse g = new GenericPaymentMethodResponse();
						processVaultAccount(tv, g);
						response.errorCode = g.errorCode;
						response.message = g.message;
						response.result = g.result;
						response.success = g.success;
					}
				}
			} catch (RemoteException e) {
				setError(response, e);
			}
		}
		return response;
	}
	
	private void addOrUpdateVaultCustomer(AddCustomerRequest request, OPERATIONPARAMETERS op, GenericCustomerResponse response) {
		TRANSACTION_VAULT tv = new TRANSACTION_VAULT();
		CUSTOMER_VAULT cv = convert(request);
		if (cv.getCUSTOMERID() == null && op.getACTIONCODE() == 1) {
			cv.setCUSTOMERID("AUTO");
		}
		tv.setMERCHANT_KEY(secureNet.merchantKey);
		tv.setCUSTOMER_VAULT(cv);
		tv.setOPERATIONPARAMETERS(op);
		processVaultCustomer(tv, response);
	}
	
	SecureNetResponse removeVaultCustomer(String customerId) {
		TRANSACTION_VAULT tv = new TRANSACTION_VAULT();
		CUSTOMER_VAULT cv = new CUSTOMER_VAULT();
		tv.setMERCHANT_KEY(secureNet.merchantKey);
		tv.setCUSTOMER_VAULT(cv);
		cv.setCUSTOMERID(customerId);
		OPERATIONPARAMETERS op = new OPERATIONPARAMETERS(3, 0);
		tv.setOPERATIONPARAMETERS(op);
		GenericCustomerResponse response = new GenericCustomerResponse();
		processVaultCustomer(tv, response);
		return response;
	}
	
	private void processVaultCustomer(TRANSACTION_VAULT tv, GenericCustomerResponse response) {
		try {
			GATEWAYRESPONSE gr = secureNet.getGatewayProxy().processCustomer(tv);
			secureNet.mapper.setSuccessValues(response, gr);
			if (gr.getVAULTCUSTOMERRESPONSE() != null) {
				response.customerId = gr.getVAULTCUSTOMERRESPONSE().getCUSTOMERID();
			}
		} catch (RemoteException e) {
			setError(response, e);
		}
	}
	
	// Payment methods within a customer
	
	AddPaymentMethodResponse addVaultCustomerPaymentMethod(AddPaymentMethodRequest request) {
		AddPaymentMethodResponse response = new AddPaymentMethodResponse();
		response.request = request;
		addOrUpdateVaultAccount(request, new OPERATIONPARAMETERS(1, 0), response);
		return response;
	}
	
	UpdatePaymentMethodResponse updateVaultCustomerPaymentMethod(UpdatePaymentMethodRequest request) {
		UpdatePaymentMethodResponse response = new UpdatePaymentMethodResponse();
		response.request = request;
		addOrUpdateVaultAccount(request, new OPERATIONPARAMETERS(2, 0), response);
		return response;
	}
	
	SecureNetResponse removeVaultCustomerPaymentMethod(String customerId, String paymentMethodId) {
		TRANSACTION_VAULT tv = new TRANSACTION_VAULT();
		tv.setMERCHANT_KEY(secureNet.merchantKey);
		ACCOUNT_VAULT av = new ACCOUNT_VAULT();
		av.setPAYMENTID(paymentMethodId);
		av.setCUSTOMERID(customerId);
		tv.setACCOUNT_VAULT(av);
		OPERATIONPARAMETERS op = new OPERATIONPARAMETERS(3, 0);
		tv.setOPERATIONPARAMETERS(op);
		GenericPaymentMethodResponse response = new GenericPaymentMethodResponse();
		processVaultAccount(tv, response);
		return response;	
	}
	
	private void addOrUpdateVaultAccount(GenericPaymentMethodRequest in, OPERATIONPARAMETERS op, GenericPaymentMethodResponse response) {
		TRANSACTION_VAULT tv = new TRANSACTION_VAULT();
		tv.setMERCHANT_KEY(secureNet.merchantKey);
		tv.setOPERATIONPARAMETERS(op);
		ACCOUNT_VAULT av = convert(in);
		if (av.getPAYMENTID() == null && op.getACTIONCODE() == 1) {
			av.setPAYMENTID("AUTO");
		}
		tv.setACCOUNT_VAULT(av);
		processVaultAccount(tv, response);
	}
	
	private void processVaultAccount(TRANSACTION_VAULT tv, GenericPaymentMethodResponse response) {
		response.rawRequest = tv;
		try {
			GATEWAYRESPONSE gr = secureNet.getGatewayProxy().processAccount(tv);
			response.rawResponse = gr;
			secureNet.mapper.setSuccessValues(response, gr);
			if (gr.getVAULTACCOUNTRESPONSE() != null) {
				response.paymentMethodId = gr.getVAULTACCOUNTRESPONSE().getPAYMENTID();
				response.customerId = gr.getVAULTACCOUNTRESPONSE().getCUSTOMERID();
			}
		} catch (RemoteException e) {
			setError(response, e);
		}
	}
	
	// Future scheduled payments for a customer
	
	StoredPaymentPlan getVaultCustomerPaymentPlan(String customerId, Integer planId) {
		PLAN_AB_EXT in = new PLAN_AB_EXT();
		in.setCUSTOMERID(customerId);
		in.setMERCHANT_KEY(secureNet.merchantKey);
		in.setPLANID(planId);
		try {
			PLAN_AB_EXT actual = secureNet.getServiceProxy().getABAccount_Ext(in);
			StoredPaymentPlan out = convert(actual);
			return out;
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}

	PaymentPlanResponse addVaultCustomerPaymentPlan(AddRecurringPaymentPlanRequest request) {
		PLAN_AB plan = convert(request.customerId, request.plan);
		RECURRING recurring = new RECURRING();
		plan.setTYPE("REC");
		plan.setRECURRING(recurring);
		if (request.plan.endDate != null) {
			plan.setENDDATE(getStringFromDate(request.plan.endDate));
			recurring.setNOEND_FLAG(0);
		} else {
			recurring.setNOEND_FLAG(1);
		}
		recurring.setAMOUNT(request.plan.recurringAmount);
		recurring.setCYCLE(request.plan.cycle.getCode());
		recurring.setFREQUENCY(request.plan.frequency);
		if (recurring.getFREQUENCY() == null) {
			recurring.setFREQUENCY(1);
		}
		switch(request.plan.cycle) {
		case ANNUALLY:
		case QUARTERLY:
		case SEMI_ANNUALLY:
			recurring.setMONTH(request.plan.month);
		case MONTHLY:
			recurring.setDAY(request.plan.dayOfTheMonth);
			break;
		case WEEKLY:
			recurring.setWEEKDAY(request.plan.dayOfTheWeek);
		}
		recurring.setFREQUENCY(request.plan.frequency);
		return processPaymentPlan(plan);
	}
	
	PaymentPlanResponse addVaultCustomerPaymentPlan(AddInstallmentPaymentPlanRequest request) {
		PLAN_AB plan = convert(request.customerId, request.plan);
		INSTALLMENT installment = new INSTALLMENT();
		plan.setTYPE("INS");
		plan.setINSTALLMENT(installment);
		installment.setCYCLE(request.plan.cycle.getCode());
		switch(request.plan.cycle) {
		case ANNUALLY:
		case QUARTERLY:
		case SEMI_ANNUALLY:
			installment.setMONTH(request.plan.month);
		case MONTHLY:
			installment.setDAY(request.plan.dayOfTheMonth);
			break;
		case WEEKLY:
			installment.setWEEKDAY(request.plan.dayOfTheWeek);
		}
		installment.setFREQUENCY(request.plan.frequency);
		if (installment.getFREQUENCY() == null) {
			installment.setFREQUENCY(1);
		}
		if (request.plan.remainderAmount != null && request.plan.remainderAmount.longValue() > 0) {
			installment.setAUTOCALC_OPTION("A");
			long amount = new Float(request.plan.remainderAmount.doubleValue() * 100.0).longValue();
			amount += (request.plan.installmentAmount.doubleValue() * 100.0 * request.plan.numberOfPayments);
			installment.setAMOUNT(new BigDecimal(new Double(amount) / 100.0));
			installment.setREMAINDER_OPTION(request.plan.remainderPaymentAddedTo != null && request.plan.remainderPaymentAddedTo == PaymentPosition.FIRST ? 0 : 1);
		} else {
			installment.setAUTOCALC_OPTION("M");
			installment.setAMOUNT(request.plan.installmentAmount);
		}
		if (request.plan.balloonAmount != null && ! request.plan.balloonAmount.equals(BigDecimal.ZERO)) {
			installment.setBALLOON_AMOUNT(request.plan.balloonAmount);
			installment.setBALLOON_OPTION(request.plan.balloonPaymentAddedTo != null && request.plan.balloonPaymentAddedTo == PaymentPosition.FIRST ? 0 : 1);
		}
		installment.setCOUNT(request.plan.numberOfPayments);
		return processPaymentPlan(plan);
	}
	
	SecureNetResponse removeVaultCustomerPaymentPlan(String customerId, Integer planId) {
		PLAN_AB in = new PLAN_AB();
		in.setCUSTOMERID(customerId);
		in.setMERCHANT_KEY(secureNet.merchantKey);
		in.setPLANID(planId);
		in.setACTIVE(0); // We can't remove but we can deactivate
		SecureNetResponse response = new SecureNetResponse();
		try {
			GATEWAYRESPONSE gr = secureNet.getGatewayProxy().updateABSchedule(in);
			secureNet.mapper.setSuccessValues(response, gr);
		} catch (RemoteException e) {
			e.printStackTrace();
			setError(response, e);
		}
		return response;
	}
	
	private PaymentPlanResponse processPaymentPlan(PLAN_AB in) {
		PaymentPlanResponse response = new PaymentPlanResponse();
		try {
			GATEWAYRESPONSE gr = secureNet.getGatewayProxy().addABAccount(in);
			ABRESPONSE ab = gr.getABRESPONSE();
			secureNet.mapper.setSuccessValues(response, gr);
			response.planId = ab.getPLANID();
		} catch (RemoteException e) {
			e.printStackTrace();
			setError(response, e);
		}
		return response;
	}
	
	private PLAN_AB convert(String customerId, StoredPaymentPlan in) {
		PLAN_AB plan = new PLAN_AB();
		plan.setACTIVE(1);
		plan.setCUSTOMERID(customerId);
		plan.setMAXRETRIES(in.maxRetries);
		plan.setMERCHANT_KEY(secureNet.merchantKey);
		plan.setNOTES(in.notes);
		plan.setPAYMENTID(in.primaryPaymentMethodId);
		plan.setPAYMENTID2(in.secondaryPaymentMethodId);
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.DAY_OF_YEAR, 1);
		Date startDate = in.startDate;
		if (startDate == null || startDate.getTime() < cal.getTime().getTime()) {
			startDate = cal.getTime();
		}
		plan.setSTARTDATE(getStringFromDate(startDate));
		return plan;
	}
	

	// Internal methods below here
	
	private String getPrimaryPaymentMethodId(ACCOUNT_VAULT[] in) {
		if (in != null) {
			for (ACCOUNT_VAULT av : in) {
				if (av != null && "TRUE".equals(av.getPRIMARY())) {
					return av.getPAYMENTID();
				}
			}
		}
		return null;
	}
	
	private CUSTOMER_VAULT convert(AddCustomerRequest in) {
		CUSTOMER_VAULT out = new CUSTOMER_VAULT();
		out.setCSDI(1);
		out.setCUSTOMERID(in.id);
		out.setNOTES(in.notes);
		out.setUSERDEFINED(secureNet.mapper.getUserDefinedFields(in.userDefinedFields));
		out.setCUSTOMER_BILL(makeCustomerBill(in.address, in.firstName, in.lastName, in.phoneNumber, in.emailAddress, in.sendEmailReceipts));
		return out;
	}
	
	private CUSTOMER_BILL makeCustomerBill(Address address, String firstName, String lastName, String phoneNumber, String emailAddress, boolean sendEmailReceipts) {
		CUSTOMER_BILL cb = new CUSTOMER_BILL();
		secureNet.mapper.setAddress(cb, address);
		cb.setFIRSTNAME(firstName);
		cb.setLASTNAME(lastName);
		cb.setEMAIL(emailAddress);
		cb.setEMAILRECEIPT(sendEmailReceipts ? "TRUE" : "FALSE");
		cb.setPHONE(phoneNumber);
		return cb;
	}
	
	private ACCOUNT_VAULT convert(GenericPaymentMethodRequest in) {
		ACCOUNT_VAULT out = new ACCOUNT_VAULT();
		out.setACDI(1);
		out.setCUSTOMERID(in.customerId);
		out.setPAYMENTID(in.paymentMethodId);
		if (in.card != null) {
			out.setCARD(secureNet.mapper.getCard(in.card));
			out.setCUSTOMER_BILL(makeCustomerBill(in.card.address, in.card.firstName, in.card.lastName, null, in.card.email, false));
			if (! secureNet.mapper.isBlank(in.card.ksn)) {
				out.setMETHOD("DB");
			} else {
				out.setMETHOD("CC");
			}
		} else {
			out.setCHECK(secureNet.mapper.getCheck(in.check));
			out.setCUSTOMER_BILL(makeCustomerBill(in.check.address, null, null, null, in.check.email, false));
			out.setMETHOD("ECHECK");
		}
		return out;
	}
	
	StoredPaymentPlan getPaymentPlan(String customerId, Integer planId) {
		PLAN_AB_EXT query = new PLAN_AB_EXT();
		query.setMERCHANT_KEY(secureNet.merchantKey);
		query.setCUSTOMERID(customerId);
		query.setPLANID(planId);
		try {
			PLAN_AB_EXT plan = secureNet.getServiceProxy().getABAccount_Ext(query);
			if (plan.getPLANID() == null || ! plan.getPLANID().equals(planId)) {
				return null;
			}
			return convert(plan);
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private List<StoredInstallmentPaymentPlan> getInstallmentPlans(PLAN_AB_EXT[] in) {
		List<StoredInstallmentPaymentPlan> out = new ArrayList<StoredInstallmentPaymentPlan>();
		if (in != null) {
			for (PLAN_AB_EXT plan : in) {
				if ("INS".equals(plan.getTYPE())) {
					out.add((StoredInstallmentPaymentPlan)convert(plan));
				}
			}
		}
		return out;
	}
	
	private List<StoredRecurringPaymentPlan> getRecurringPlans(PLAN_AB_EXT[] in) {
		List<StoredRecurringPaymentPlan> out = new ArrayList<StoredRecurringPaymentPlan>();
		if (in != null) {
			for (PLAN_AB_EXT plan : in) {
				if ("REC".equals(plan.getTYPE())) {
					out.add((StoredRecurringPaymentPlan)convert(plan));
				}
			}
		}
		return out;
	}
	
	private List<StoredVariablePaymentPlan> getVariablePlans(PLAN_AB_EXT[] in) {
		List<StoredVariablePaymentPlan> out = new ArrayList<StoredVariablePaymentPlan>();
		if (in != null) {
			for (PLAN_AB_EXT plan : in) {
				if ("VAR".equals(plan.getTYPE())) {
					out.add((StoredVariablePaymentPlan)convert(plan));
				}
			}
		}
		return out;
	}
	
	private StoredPaymentPlan convert(PLAN_AB_EXT in) {
		if (in == null) {
			return null;
		}
		StoredPaymentPlan out = null;
		if ("REC".equals(in.getTYPE())) {
			out = getStoredRecurringPaymentPlan(in);
		} else if ("INS".equals(in.getTYPE())) {
			out = getStoredInstallmentPaymentPlan(in);
		} else {
			out = getStoredVariablePaymentPlan(in);
		}
		out.active = in.getACTIVE() != 0;
		out.id = in.getPLANID();
		out.maxRetries = in.getMAXRETRIES() == null ? 0 : in.getMAXRETRIES();
		out.nextPaymentDate = getDateFromString(in.getNEXTPAYMENT_DATE());
		out.notes = in.getNOTES();
		out.primaryPaymentMethodId = in.getPAYMENTID();
		out.secondaryPaymentMethodId = in.getPAYMENTID2();
		out.startDate = getDateFromString(in.getSTARTDATE());
		out.userDefinedFields = convert(in.getUSERDEFINED());
		return out;
	}
	
	private StoredRecurringPaymentPlan getStoredRecurringPaymentPlan(PLAN_AB_EXT in) {
		StoredRecurringPaymentPlan out = new StoredRecurringPaymentPlan();
		out.endDate = getDateFromString(in.getENDDATE());
		out.cycle = PaymentCycle.getByCode(in.getRECURRING().getCYCLE());
		out.dayOfTheMonth = in.getRECURRING().getDAY();
		if (Integer.valueOf(0).equals(out.dayOfTheMonth)) {
			out.dayOfTheMonth = null;
		}
		out.dayOfTheWeek = in.getRECURRING().getWEEKDAY();
		if (Integer.valueOf(0).equals(out.dayOfTheWeek)) {
			out.dayOfTheWeek = null;
		}
		out.frequency = in.getRECURRING().getFREQUENCY();
		out.recurringAmount = in.getRECURRING().getAMOUNT();
		return out;
	}
	
	private StoredInstallmentPaymentPlan getStoredInstallmentPaymentPlan(PLAN_AB_EXT in) {
		StoredInstallmentPaymentPlan out = new StoredInstallmentPaymentPlan();
		out.cycle = PaymentCycle.getByCode(in.getINSTALLMENT().getCYCLE());
		out.dayOfTheMonth = in.getINSTALLMENT().getDAY();
		if (Integer.valueOf(0).equals(out.dayOfTheMonth)) {
			out.dayOfTheMonth = null;
		}
		out.dayOfTheWeek = in.getINSTALLMENT().getWEEKDAY();
		if (Integer.valueOf(0).equals(out.dayOfTheWeek)) {
			out.dayOfTheWeek = null;
		}
		out.frequency = in.getINSTALLMENT().getFREQUENCY();
		if (in.getINSTALLMENT().getAUTOCALC_OPTION() != null && in.getINSTALLMENT().getAUTOCALC_OPTION().equals("A")) {
			out.totalAmount = in.getINSTALLMENT().getAMOUNT();
			long actualPaymentInCents = (new Float(in.getINSTALLMENT().getAMOUNT().floatValue() * 100)).longValue() / in.getINSTALLMENT().getCOUNT().longValue(); 
			out.installmentAmount = BigDecimal.valueOf(new Float(actualPaymentInCents) / 100.0);
			long actualPaidAmountInCents = actualPaymentInCents * in.getINSTALLMENT().getCOUNT().longValue();
			out.remainderAmount = new BigDecimal(out.totalAmount.doubleValue() - new Double(actualPaidAmountInCents * 100)); 
			if (out.remainderAmount.equals(BigDecimal.ZERO)) {
				out.remainderAmount = null;
			} else {
				out.remainderPaymentAddedTo = in.getINSTALLMENT().getREMAINDER_OPTION().equals(0) ? PaymentPosition.FIRST : PaymentPosition.LAST;
			}
		} else {
			out.totalAmount = BigDecimal.valueOf(in.getINSTALLMENT().getCOUNT().longValue() * in.getINSTALLMENT().getAMOUNT().longValue());
			out.installmentAmount = in.getINSTALLMENT().getAMOUNT();
		}
		out.numberOfPayments = in.getINSTALLMENT().getCOUNT();
		if (in.getINSTALLMENT().getBALLOON_AMOUNT() != null && in.getINSTALLMENT().getBALLOON_AMOUNT().intValue() > 0) {
			out.balloonAmount = in.getINSTALLMENT().getBALLOON_AMOUNT();
			out.balloonPaymentAddedTo = in.getINSTALLMENT().getBALLOON_OPTION().equals(0) ? PaymentPosition.FIRST : PaymentPosition.LAST;
		}
		if (in.getINSTALLMENT().getREMAINDER_OPTION() != null) {
			out.balloonAmount = in.getINSTALLMENT().getBALLOON_AMOUNT();
			out.balloonPaymentAddedTo = in.getINSTALLMENT().getBALLOON_OPTION().equals(0) ? PaymentPosition.FIRST : PaymentPosition.LAST;
		}
		return out;
	}
	
	private StoredVariablePaymentPlan getStoredVariablePaymentPlan(PLAN_AB_EXT in) {
		StoredVariablePaymentPlan out = new StoredVariablePaymentPlan();
		for (PAYMENT_AB p : in.getSCHEDULE()) {
			StoredScheduledPayment payment = new StoredScheduledPayment();
			payment.amount = p.getAMOUNT();
			payment.paid = p.getPAID() != 0;
			payment.paymentDate = getDateFromString(p.getPAYMENTDATE());
			payment.paymentMethodId = p.getPAYMENTID();
			payment.scheduledDate = getDateFromString(p.getINSTALLMENTDATE());
			out.scheduledPayments.add(p.getINSTALLMENTNUM() - 1, payment);
		}
		return out;
	}
	
	private List<VaultPaymentMethod> convert(ACCOUNT_VAULT[] in) {
		List<VaultPaymentMethod> out = new ArrayList<VaultPaymentMethod>();
		if (in != null) {
			for (ACCOUNT_VAULT av : in) {
				out.add(convert(av));
			}
		}
		while(out.contains(null)) {
			out.remove(null);
		}
		return out;
	}
	
	private VaultPaymentMethod convert(ACCOUNT_VAULT in) {
		if (in == null) {
			return null;
		}
		VaultPaymentMethod out = new VaultPaymentMethod();
		out.id = in.getPAYMENTID();
		out.card = convert(in.getCARD(), in.getCUSTOMER_BILL());
		out.check = convert(in.getCHECK(), in.getCUSTOMER_BILL());
		out.notes = in.getNOTES();
		out.userDefinedFields = convert(in.getUSERDEFINED());
		return out;
	}
	
	private StoredCheck convert(CHECK in, CUSTOMER_BILL cb) {
		if (in == null) {
			return null;
		}
		StoredCheck out = new StoredCheck();
		out.lastFourDigits = in.getACCOUNTNUM();
		out.accountType = CheckingAccountType.getByCode(in.getACCOUNTTYPE());
		out.address = convert(cb);
		out.micrData = in.getMICRDATA();
		out.email = cb.getEMAIL();
		out.name = in.getACCOUNTNAME();
		out.routingNumber = in.getABACODE();
		out.bankName = in.getBANKNAME();
		return out;
	}
	
	private StoredCard convert(CARD in, CUSTOMER_BILL cb) {
		if (in == null) {
			return null;
		}
		StoredCard out = new StoredCard();
		out.address = convert(cb);
		out.lastFourDigits = in.getCARDNUMBER().substring(in.getCARDNUMBER().length() - 4);
		out.email = cb.getEMAIL();
		out.expirationMonth = Integer.valueOf(in.getEXPDATE().substring(0, 2), 10);
		out.expirationYear = Integer.valueOf(in.getEXPDATE().substring(2), 10);
		out.expirationYear += out.expirationYear > 50 ? 1900 : 2000;
		out.firstName = cb.getFIRSTNAME();
		out.lastName = cb.getLASTNAME();
		out.maskedNumber = "XXXX XXXX XXXX " + out.lastFourDigits; // TODO amex?
		return out;
	}
	
	private VaultCustomer convert(CUSTOMER_VAULT in) {
		if (in == null) {
			return null;
		}
		CUSTOMER_BILL bill = in.getCUSTOMER_BILL();
		VaultCustomer out = new VaultCustomer();
		out.id = in.getCUSTOMERID();
		out.address = convert(bill);
		out.firstName = bill.getFIRSTNAME();
		out.lastName = bill.getLASTNAME();
		out.emailAddress = bill.getEMAIL();
		out.sendEmailReceipts = "TRUE".equals(bill.getEMAILRECEIPT());
		out.phoneNumber = bill.getPHONE();
		out.userDefinedFields = convert(in.getUSERDEFINED());
		out.notes = in.getNOTES();
		return out;
	}
	
	private Address convert(CUSTOMER_BILL in) {
		Address out = new Address();
		out.line1 = in.getADDRESS();
		out.line2 = in.getCOMPANY();
		out.city = in.getCITY();
		out.state = in.getSTATE();
		out.zip = in.getZIP();
		out.country = in.getCOUNTRY();
		return out;
	}
	
	Map<Integer, String> convert(USERDEFINED in) {
		Map<Integer, String> out = new HashMap<Integer, String>();
		if (in == null) {
			return out;
		}
		for (int i = 1; i <= 50; ++i) {
			try {
				Method method = USERDEFINED.class.getMethod("getUD" + i);	
				Object obj = method.invoke(in);
				if (obj != null && ! obj.toString().trim().isEmpty()) {
					out.put(i,  obj.toString());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return out;
	}
	
	CUSTOMER_VAULT convert(VaultCustomer in) {
		CUSTOMER_VAULT out = new CUSTOMER_VAULT();
		out.setCSDI(1);
		out.setCUSTOMER_BILL(makeCustomerBill(in.address, in.firstName, in.lastName, in.phoneNumber, in.emailAddress, in.sendEmailReceipts));
		out.setCUSTOMERID(in.id);
		out.setNOTES(in.notes);
		out.setUSERDEFINED(secureNet.mapper.getUserDefinedFields(in.userDefinedFields));
		return out;
	}
	
	void setError(SecureNetResponse response, Exception e) {
		response.success = false;
		response.errorCode = "TODO";
		response.result = ResultType.getByCode(response.errorCode);
		response.message = e.getLocalizedMessage();
	}
	
	private Date getDateFromString(String in) {
		if (in == null) {
			return null;
		}
		try {
			return new SimpleDateFormat("MMddyyyy").parse(in);
		} catch (ParseException e) {
			return null;
		}
	}

	private String getStringFromDate(Date in) {
		if (in == null) {
			return null;
		}
		return new SimpleDateFormat("MMddyyyy").format(in);
	}
}
