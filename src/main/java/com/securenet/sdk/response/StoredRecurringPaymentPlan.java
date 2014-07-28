package com.securenet.sdk.response;

import java.math.BigDecimal;
import java.util.Date;

public class StoredRecurringPaymentPlan extends StoredPaymentPlan {

	public PaymentCycle cycle;
	public Integer dayOfTheMonth;
	public Integer dayOfTheWeek;
	public Integer month;
	public Integer frequency;
	
	public BigDecimal recurringAmount;

	public Date endDate;
	
}
