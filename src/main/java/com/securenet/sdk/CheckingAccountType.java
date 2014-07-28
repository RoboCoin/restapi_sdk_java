package com.securenet.sdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum CheckingAccountType {

	CHECKING("CHECKING"), 
	BUSINESS_CHECKING("BCHECK"), 
	SAVINGS("SAVINGS"), 
	BUSINESS_SAVINGS("BSAVE");

	List<String> codes = new ArrayList<String>();
	
	CheckingAccountType(String... codes) {
		this.codes.addAll(Arrays.asList(codes));
	}
	
	public static CheckingAccountType getByCode(String code) {
		if (code == null) {
			return null;
		}
		for (CheckingAccountType type : CheckingAccountType.values()) {
			if (type.codes.contains(code)) {
				return type;
			}
		}
		return CHECKING;
	}

}
