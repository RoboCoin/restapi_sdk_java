package com.securenet.sdk.response;

import java.math.BigDecimal;

public class StoredInstallmentPaymentPlan extends StoredPaymentPlan {

	public PaymentCycle cycle;
	public Integer dayOfTheMonth;
	public Integer dayOfTheWeek;
	public Integer month;
	public Integer frequency;
	
	public static enum PaymentPosition { FIRST, LAST }
	
	public BigDecimal totalAmount;

	public int numberOfPayments;
	public BigDecimal installmentAmount;
	
	public BigDecimal balloonAmount;
	public PaymentPosition balloonPaymentAddedTo;

	public BigDecimal remainderAmount;
	public PaymentPosition remainderPaymentAddedTo;
}
