package com.securenet.sdk;

import java.util.HashMap;
import java.util.Map;

public class GenericPaymentMethodRequest extends SecureNetRequest {
	
	public String customerId;
	
	public String paymentMethodId;
	
	public Card card;
	public Check check;
		
	public String notes;
	public Map<Integer, String> userDefinedFields = new HashMap<Integer, String>(50);
	
}
