package com.securenet.sdk;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AuthorizeRequest extends SecureNetRequest {

	String orderId;
	String ipAddress;
	public boolean includeRawObjects;
	public boolean includeRequest;
	
	// Identify the type of request and the specific account information
	
	public static enum Type { CARD, CHECK, EBT, TOKEN, AUTHORIZATION, REFERENCE }

	Card card;
	Check check;
	VaultToken paymentVaultToken;
	Integer referenceTransactionId;
	ElectronicBenefitsTransfer electronicBenefitsTransfer;

	// The charge itself
	
	BigDecimal amount;
	BigDecimal cashBackAmount;

	boolean allowPartialCharges = false; // Used for prepaid cards that might auth[_capture] up to their balance

	String cardStatementLabel;
	String cardStatementPhone;

	public VaultCredentials vaultCredentials = new VaultCredentials();	
	
	// Extended information will not affect the charge itself but is potentially useful and may be required to get the best rates
	
	public final ExtendedInformation extendedInformation = new ExtendedInformation();
	
	// Additional settings
	
	boolean addToVault = false;
	boolean addToVaultOnFailure = false;
	public VaultToken newVaultToken;
	
	public AuthorizeRequest setCard(Card card) {
		resetPayment();
		this.card = card;
		return this;
	}
	
	public Card getCard() {
		return card;
	}
	
	public AuthorizeRequest setCheck(Check check) {
		resetPayment();
		this.check = check;
		return this;
	}
	
	public Check getCheck() {
		return check;
	}
	
	public AuthorizeRequest setPaymentVaultToken(VaultToken token) {
		resetPayment();
		this.paymentVaultToken = token;
		return this;
	}
	
	public VaultToken getPaymentVaultToken() {
		return paymentVaultToken;
	}
	
	public AuthorizeRequest setVaultToken(String customerId, String paymentMethodId) {
		VaultToken token = new VaultToken();
		token.customerId = customerId;
		token.paymentMethodId = paymentMethodId;
		return setPaymentVaultToken(token);
	}
	
	public AuthorizeRequest setPreVaultToken(String preVaultToken) {
		return setPaymentVaultToken(SecureNetVault.getVaultToken(preVaultToken));
	}
	
	public String getPreVaultToken() {
		return SecureNetVault.getEncodedVaultToken(paymentVaultToken);
	}
	
	public AuthorizeRequest setReferenceTransactionId(Integer referenceTransaction) {
		resetPayment();
		this.referenceTransactionId = referenceTransaction;
		return this;
	}
	
	public Integer getReferenceTransactionId() {
		return referenceTransactionId;
	}
	
	public Type getPaymentType() {
		if (card != null) {
			return Type.CARD;
		}
		if (check != null) {
			return Type.CHECK;
		}
		if (paymentVaultToken != null) {
			return Type.TOKEN;
		}
		if (referenceTransactionId != null) {
			return Type.REFERENCE;
		}
		if (electronicBenefitsTransfer != null) {
			return Type.EBT;
		}
		return null;
	}
	
	public AuthorizeRequest setCardStatementLabel(String label, String phone) {
		if (label == null || label.trim().length() == 0 || phone == null || phone.trim().length() == 0) {
			return this;
		}
		int pos = label.trim().indexOf('*');
		if (pos != 3 && pos != 7 && pos != 12) {
			return this;
		}
		this.cardStatementLabel = label.trim();
		this.cardStatementPhone = phone.trim();
		return this;
	}
	
	private void resetPayment() {
		this.card = null;
		this.check = null;
		this.paymentVaultToken = null;
		this.referenceTransactionId = null;
	}

	public String getOrderId() {
		return orderId;
	}
	
	public AuthorizeRequest setTest(boolean test) {
		this.test = test;
		return this;
	}

	public AuthorizeRequest setOrderId(String orderId) {
		this.orderId = orderId;
		return this;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public AuthorizeRequest setAmount(BigDecimal amount) {
		this.amount = amount;
		return this;
	}

	public BigDecimal getCashBackAmount() {
		return cashBackAmount;
	}

	public AuthorizeRequest setCashBackAmount(BigDecimal cashBackAmount) {
		this.cashBackAmount = cashBackAmount;
		return this;
	}

	public boolean isAllowPartialCharges() {
		return allowPartialCharges;
	}

	public AuthorizeRequest setAllowPartialCharges(boolean allowPartialCharges) {
		this.allowPartialCharges = allowPartialCharges;
		return this;
	}

	public String getCardStatementLabel() {
		return cardStatementLabel;
	}

	public AuthorizeRequest setCardStatementLabel(String label) {
		int pos = label.trim().indexOf('*');
		if (pos != 3 && pos != 7 && pos != 12) {
			return this;
		}
		this.cardStatementLabel = label.trim();
		return this;
	}

	public boolean isAddToVault() {
		return addToVault;
	}

	public void setAddToVault(boolean addToVault) {
		this.addToVault = addToVault;
		if (!addToVault) {
			this.addToVaultOnFailure = false;
		}
	}

	public boolean isAddToVaultOnFailure() {
		return addToVaultOnFailure;
	}

	public void setAddToVaultOnFailure(boolean addToVaultOnFailure) {
		this.addToVaultOnFailure = addToVaultOnFailure;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String notes;
	public Map<Integer, String> userDefinedFields = new HashMap<Integer, String>(50);
	
}
