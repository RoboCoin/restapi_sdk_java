package com.securenet.sdk.response;

import com.securenet.sdk.AuthorizeRequest;


public class ChargeResponse extends SecureNetResponse {

	public AuthorizeRequest request;
	
	public StoredTransaction transaction = new StoredTransaction();
}
