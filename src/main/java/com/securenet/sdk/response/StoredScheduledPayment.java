package com.securenet.sdk.response;

import java.math.BigDecimal;
import java.util.Date;

public class StoredScheduledPayment {

	public Date scheduledDate;
	public BigDecimal amount;
	public int number;
	public boolean paid;
	public String paymentMethodId;
	public Date paymentDate;
}
