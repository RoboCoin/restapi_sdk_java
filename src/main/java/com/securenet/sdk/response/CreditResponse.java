package com.securenet.sdk.response;

import com.securenet.sdk.CreditRequest;
import com.securenet.sdk.TransactionCode;

public class CreditResponse extends SecureNetResponse {

	public CreditRequest request;
	public Integer transactionId;
	public TransactionCode type;

}
