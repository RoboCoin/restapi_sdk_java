package com.securenet.sdk;

import java.util.HashMap;
import java.util.Map;

public class AddCustomerRequest extends SecureNetRequest {

	public String id;
	
	public String firstName;
	public String lastName;
	public String phoneNumber;
	public Address address = new Address();
	
	public String emailAddress;
	public boolean sendEmailReceipts;
		
	public String notes;
	public Map<Integer, String> userDefinedFields = new HashMap<Integer, String>();

}
