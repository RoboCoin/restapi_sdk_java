package com.securenet.sdk.response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum PaymentCycle {

	WEEKLY("W"), 
	MONTHLY("M"), 
	QUARTERLY("Q"), 
	SEMI_ANNUALLY("B"), 
	ANNUALLY("Y");
	
	List<String> codes = new ArrayList<String>();
	
	PaymentCycle(String... codes) {
		this.codes.addAll(Arrays.asList(codes));
	}
	
	public static PaymentCycle getByCode(String code) {
		if (code == null) {
			return null;
		}
		for (PaymentCycle type : PaymentCycle.values()) {
			if (type.codes.contains(code)) {
				return type;
			}
		}
		return null;
	}

	
	public String getCode() {
		return codes.get(0); 
	}
}
