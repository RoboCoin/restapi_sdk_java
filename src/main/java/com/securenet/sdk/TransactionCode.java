package com.securenet.sdk;

public enum TransactionCode {
	
	AUTH("0000", "0001"), AUTH_CAPTURE("0100", "0101"), PRIOR_AUTH_CAPTURE("0200"), UDPATE("0201"), CAPTURE("0300"), VOID("0400"), PARTIAL_VOID("0401"), REFUND("0500"), FORCE_CREDIT("0600"), VERIFICATION("0700");
	public String representation;
	public String representationWithPartial;
	
	TransactionCode(String representation) {
		this.representation = representation;
		this.representationWithPartial = representation;
	}
	
	TransactionCode(String representation, String partial) {
		this.representationWithPartial = partial;
		this.representation = representation;
	}
	
	static TransactionCode getFromCode(String code) {
		for (TransactionCode candidate : TransactionCode.values()) {
			if (candidate.representation.equals(code) || candidate.representationWithPartial.equals(code)) {
				return candidate;
			}
		}
		return null;
	}
	
	static Boolean allowsPartial(String code) {
		for (TransactionCode candidate : TransactionCode.values()) {
			if (candidate.representationWithPartial.equals(code)) {
				if (candidate.representation.equals(code)) {
					return null;
				}
				return true;
			}
		}
		return false;
	}
	
}