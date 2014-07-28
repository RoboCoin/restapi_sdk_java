package com.securenet.sdk.response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum FleetCardType {

	VISA("VIF"), 
	MASTERCARD("MCF"), 
	FUELMAN("GC"), 
	VOYAGER("VY"), 
	WRIGHT_EXPRESS("WX");
	
	List<String> codes = new ArrayList<String>();;
	
	FleetCardType(String... codes) {
		this.codes.addAll(Arrays.asList(codes));
	}
	
	public static FleetCardType getByCode(String code) {
		if (code == null) {
			return null;
		}
		for (FleetCardType type : FleetCardType.values()) {
			if (type.codes.contains(code)) {
				return type;
			}
		}
		return null;
	}

}
