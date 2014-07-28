package com.securenet.sdk.response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum CheckType {

	ACH("ACH"),
	CHECK("CHECK21");
	
	List<String> codes = new ArrayList<String>();;
	
	CheckType(String... codes) {
		this.codes.addAll(Arrays.asList(codes));
	}
	
	public static CheckType getByCode(String code) {
		if (code == null) {
			return null;
		}
		for (CheckType type : CheckType.values()) {
			if (type.codes.contains(code)) {
				return type;
			}
		}
		return null;
	}
}
