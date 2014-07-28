package com.securenet.sdk.response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum CreditCardType {

	VISA("VI", "VIF"), 
	MASTERCARD("MC", "MCF"), 
	AMEX("AX"), 
	DISCOVER("DS"),
	DINERS_CLUB("DC"), 
	FUELMAN("GC"), 
	JCB("JC"), 
	VOYAGER("VY"), 
	WRIGHT_EXPRESS("WX");
	
	List<String> codes = new ArrayList<String>();;
	
	CreditCardType(String... codes) {
		this.codes.addAll(Arrays.asList(codes));
	}
	
	public static CreditCardType getByCode(String code) {
		if (code == null) {
			return null;
		}
		for (CreditCardType type : CreditCardType.values()) {
			if (type.codes.contains(code)) {
				return type;
			}
		}
		return null;
	}

}
