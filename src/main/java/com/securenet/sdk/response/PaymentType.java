package com.securenet.sdk.response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum PaymentType {

	CHECK("ACH", "CHECK21"), 
	DEBIT_CARD("DB", "PD"), 
	EBT("EBT"), 
	CREDIT_CARD("VI", "MC", "AX", "DC", "DS", "JC"),
	FLEET_CARD("GC", "MCF", "VIF", "WX", "VY"),
	STORED_VALUE("SV"), 
	UNKNOWN("UNKNOWN");
	
	List<String> codes = new ArrayList<String>();
	
	PaymentType(String... codes) {
		this.codes.addAll(Arrays.asList(codes));
	}
	
	public static PaymentType getByCode(String code) {
		if (code == null) {
			return null;
		}
		for (PaymentType type : PaymentType.values()) {
			if (type.codes.contains(code)) {
				return type;
			}
		}
		return UNKNOWN;
	}
}
