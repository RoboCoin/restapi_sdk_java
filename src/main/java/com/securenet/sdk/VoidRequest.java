package com.securenet.sdk;

import java.math.BigDecimal;

public class VoidRequest extends SecureNetRequest {

	public String orderId;
	public Integer transactionId;
	public BigDecimal amount;
	public String ipAddress;
	public boolean includeRawObjects;
	public boolean holdAuthorization;
	public CheckingTransactionType checkType;
}
