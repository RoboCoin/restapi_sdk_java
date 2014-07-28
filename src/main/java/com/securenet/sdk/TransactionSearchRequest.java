package com.securenet.sdk;

import java.math.BigDecimal;
import java.util.Date;

public class TransactionSearchRequest extends SecureNetRequest {

	public Integer transactionId;
	public String orderId;
	public String batchId;
	public String customerId;
	public Date startDate;
	public Date endDate;
	public BigDecimal amount;
}
