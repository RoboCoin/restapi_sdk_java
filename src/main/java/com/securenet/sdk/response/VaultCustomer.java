package com.securenet.sdk.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.securenet.sdk.Address;

public class VaultCustomer {

	public String id;
	
	public Address address = new Address();
	public String firstName;
	public String lastName;
	public String phoneNumber;
	
	public String emailAddress;
	public boolean sendEmailReceipts;
	
	public String notes;
	public Map<Integer, String> userDefinedFields = new HashMap<Integer, String>(50);
	
	public List<VaultPaymentMethod> paymentMethods = new ArrayList<VaultPaymentMethod>();
	public String primaryPaymentMethodId;
	
	public List<StoredVariablePaymentPlan> variablePaymentPlans = new ArrayList<StoredVariablePaymentPlan>();
	public List<StoredRecurringPaymentPlan> recurringPaymentPlans = new ArrayList<StoredRecurringPaymentPlan>();
	public List<StoredInstallmentPaymentPlan> installmentPaymentPlans = new ArrayList<StoredInstallmentPaymentPlan>();
}
