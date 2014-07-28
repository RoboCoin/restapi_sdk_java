package com.securenet.sdk.response;

import java.util.HashMap;
import java.util.Map;

import com.securenet.sdk.StoredCheck;

public class VaultPaymentMethod {

	public String id;
	
	public StoredCard card;
	public StoredCheck check;
		
	public String notes;
	public Map<Integer, String> userDefinedFields = new HashMap<Integer, String>(50);

}
