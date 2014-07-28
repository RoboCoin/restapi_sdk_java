package com.securenet.sdk;

public class MailOrTelephoneOrderData {

	public static enum TransactionType { SINGLE_PURCHASE, RECURRING, INSTALLMENT }
	
	public TransactionType type;
	public int totalNumberOfInstallments;
	public int currentInstallment;
}
