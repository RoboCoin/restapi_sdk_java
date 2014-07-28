package com.securenet.sdk;

import java.math.BigDecimal;

import com.securenet.sdk.AuthorizeRequest.Type;

public class CreditRequest extends SecureNetRequest {

	public String orderId;
	public BigDecimal amount;
	public String ipAddress;
	public boolean includeRawObjects;

	Card card;
	Check check;

	public CreditRequest setCard(Card card) {
		resetPayment();
		this.card = card;
		return this;
	}

	public Card getCard() {
		return card;
	}

	public CreditRequest setCheck(Check check) {
		resetPayment();
		this.check = check;
		return this;
	}

	public Check getCheck() {
		return check;
	}

	private void resetPayment() {
		this.card = null;
		this.check = null;
	}

	public Type getPaymentType() {
		if (card != null) {
			return Type.CARD;
		}
		if (check != null) {
			return Type.CHECK;
		}
		return null;
	}
}
