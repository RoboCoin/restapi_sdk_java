package com.securenet.sdk.response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum AvsResult {
	
	NOT_CHECKED("0", "B", "C", "E", "G", "I", "P", "R", "S", "U"), 
	ADDRESS_INCORRECT("T", "Z", "W"), 
	ZIP_INCORRECT("A"),
	BOTH_INCORRECT("N"),
	MATCH("D", "M", "X", "Y");
	
	List<String> codes = new ArrayList<String>();;
	
	AvsResult(String... codes) {
		this.codes.addAll(Arrays.asList(codes));
	}
	
	public static AvsResult getByCode(String code) {
		if (code == null) {
			return NOT_CHECKED;
		}
		for (AvsResult type : AvsResult.values()) {
			if (type.codes.contains(code)) {
				return type;
			}
		}
		return NOT_CHECKED;
	}
}
