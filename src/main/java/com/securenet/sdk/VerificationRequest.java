package com.securenet.sdk;

import java.math.BigDecimal;

public class VerificationRequest extends SecureNetRequest {

	public boolean includeRawObjects;

	Card card;
	Check check;
	
	BigDecimal amount;

	public VerificationRequest setCard(Card card) {
		this.check = null;
		this.card = card;
		return this;
	}
	
	public Card getCard() {
		return card;
	}
	
	public VerificationRequest setCheck(Check check) {
		this.card = null;
		this.check = check;
		return this;
	}
	
	public Check getCheck() {
		return check;
	}
	
	public VerificationRequest setAmount(BigDecimal amount) {
		this.amount = amount;
		return this;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	
	public VerificationRequest setTest(boolean test) {
		return this;
	}
}
