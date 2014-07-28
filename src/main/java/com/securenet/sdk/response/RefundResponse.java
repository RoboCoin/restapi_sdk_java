package com.securenet.sdk.response;

import com.securenet.sdk.TransactionCode;
import com.securenet.sdk.VoidRequest;

public class RefundResponse extends SecureNetResponse {

	public VoidRequest request;
	public Integer transactionId;
	public TransactionCode type;

}
