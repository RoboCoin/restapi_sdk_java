package com.securenet.sdk.response;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class StoredPaymentPlan {

	public int id;
	
	public boolean active;
	public Date startDate;

	public Date nextPaymentDate;
	public int maxRetries;
	
	public String primaryPaymentMethodId;
	public String secondaryPaymentMethodId;
	
	public String notes;
	public Map<Integer, String> userDefinedFields = new HashMap<Integer, String>(50);

}
