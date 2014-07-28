package com.securenet.sdk;


public class Check {

	public CheckingAccountType accountType = CheckingAccountType.CHECKING;
	public CheckingTransactionType checkType; 
	
	public String micrData;

	public String routingNumber;
	public String accountNumber;
	public String name;

	public String checkNumber;
	public Address address;
	public String email;
	
	public String front;
	public String back;
	
	public static enum VERIFICATION { NONE, CERTEGY, ACH_PROVIDER }
	
	public VERIFICATION verification = VERIFICATION.NONE;
}
