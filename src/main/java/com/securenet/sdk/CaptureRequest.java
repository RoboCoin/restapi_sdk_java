package com.securenet.sdk;

import java.math.BigDecimal;

public class CaptureRequest extends SecureNetRequest {

	public String ipAddress;
	public boolean includeRawObjects;
	public boolean includeRequest;
	public BigDecimal amount;
	public Integer transactionId;
	public final ExtendedInformation extendedInformation = new ExtendedInformation();
}
