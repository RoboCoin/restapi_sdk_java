package com.securenet.sdk;

public class SecureIndicator {

	public String indicator;
	public String value;
	
	/**
	 * @param indicator The electronic commerce indicator (ECI) value for a Visa transaction; or the universal cardholder authentication field (UCAF) indicator for MasterCard transaction.
	 * @param value The cardholder authentication verification value (CAVV) for Visa transactions; or accountholder authentication value (AVV)/ universal cardholder authentication field (UCAF) for MasterCard transactions.
	 */
	public SecureIndicator(String indicator, String value) {
		this.indicator = indicator;
		this.value = value;
	}
	
	public SecureIndicator() {
		// required for json
	}
}
