package com.securenet.sdk;

import java.awt.Image;

public class Card {

	public String trackData;

	public String number;
	public String cvv;
	public int expirationMonth;
	public int expirationYear;
	
	public String ksn;
	public String pinBlock;
	
	public Address address;
	public String firstName;
	public String lastName;
	public String email;

	public Image signature;
	
	public SecureIndicator secureIndicator;
	
	/**
	 * @param indicator The electronic commerce indicator (ECI) value for a Visa transaction; or the universal cardholder authentication field (UCAF) indicator for MasterCard transaction.
	 * @param value The cardholder authentication verification value (CAVV) for Visa transactions; or accountholder authentication value (AVV)/ universal cardholder authentication field (UCAF) for MasterCard transactions.
	 */
	public Card set3DSecureIndicator(String indicator, String value) {
		this.secureIndicator = new SecureIndicator(indicator, value);
		return this;
	}
	
	/**
	 * @param number The human-readable number on the credit card
	 * @return the Card object for chaining
	 */
	public Card setNumber(String number) {
		if (number == null) {
			this.number = null;
			return this;
		}
		StringBuilder sb = new StringBuilder();
		for (char c : number.toCharArray()) {
			if (Character.isDigit(c)) {
				sb.append(c);
			}
		}
		this.number = sb.toString();
		return this;
	}
	
	/**
	 * @param cvv the 3- or 4-digit verification code used to validate card-not-present transactions
	 * @return the Card object for chaining
	 */
	public Card setCvv(String cvv) {
		this.cvv = cvv;
		return this;
	}

	/**
	 * @param number The month in which this card expires as-written, so January is 1 and December is 12
	 * @return the Card object for chaining
	 */
	public Card setExpirationMonth(int month) {
		if (month < 1 || month > 12) {
			throw new IllegalArgumentException();
		}
		this.expirationMonth = month;
		return this;
	}
	
	/**
	 * @param number The year in which this card expires, with either 2015 or 15 being interpreted as 2015
	 * @return the Card object for chaining
	 */
	public Card setExpirationYear(int year) {
		this.expirationYear = year % 100;
		return this;
	}
	
	/**
	 * @param date The expiration date of the card, in format 'mm/yyyy' or 'mm/yy'
	 * @return the Card object for chaining
	 */
	public Card setExpirationDate(String date) {
		String month = date.substring(0, date.indexOf("/"));
		setExpirationMonth(Integer.parseInt(month, 10));
		String year = date.substring(date.indexOf("/") + 1);
		setExpirationYear(Integer.parseInt(year, 10));
		return this;
	}
}
