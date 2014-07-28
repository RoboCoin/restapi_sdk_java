package com.securenet.sdk.response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum CardCodeResult {
	
	MATCH("M", "Y"), 
	NOT_MATCH("N"), 
	NOT_CHECKED("0", "P", "S", "U");
	
	List<String> codes = new ArrayList<String>();;
	
	CardCodeResult(String... codes) {
		this.codes.addAll(Arrays.asList(codes));
	}
	
	public static CardCodeResult getByCode(String code) {
		if (code == null) {
			return NOT_CHECKED;
		}
		for (CardCodeResult type : CardCodeResult.values()) {
			if (type.codes.contains(code)) {
				return type;
			}
		}
		return NOT_CHECKED;
	}
}
