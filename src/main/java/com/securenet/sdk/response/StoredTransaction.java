package com.securenet.sdk.response;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.securenet.sdk.CheckingAccountType;
import com.securenet.sdk.CheckingTransactionType;
import com.securenet.sdk.TransactionCode;

public class StoredTransaction {

	public Integer secureNetId;
	
	public TransactionCode type;
	
	public String orderId;	
	public Integer transactionId;
	public String authorizationCode;	
	
	public BigDecimal authorizedAmount;
	public Boolean allowedPartialCharges;
	
	public String paymentTypeCode;
	public PaymentType paymentTypeResult;

	public Boolean level2Valid;
	public Boolean level3Valid;
	
	public TransactionData transactionData;
	public SettlementData settlementData;
	
	public VaultData vaultData;

	// Checks only
	
	public CheckingAccountType bankAccountType;
	public String bankAccountName;
	public String bankAccount;
	public CheckingTransactionType checkType;
	
	// Credit cards only
	
	public CreditCardType creditCardType;
	public String cardNumber;
	public String avsCode;
	public AvsResult avsResult;
	
	public String cardCodeCode;
	public CardCodeResult cardCodeResult;

	// Debit cards only
	
	public String traceNumber;
	public BigDecimal surchargeAmount;
	public BigDecimal cashbackAmount;
	
	// EBT only
	
	public String fnsNumber;
	public String voucherNumber;

	// Fleet cards only
	
	public FleetCardType fleetCardType;
	public String fleetCardInfo;

	@JsonIgnore
	public String method;
}
