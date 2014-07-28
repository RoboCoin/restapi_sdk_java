package com.securenet.sdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum CheckingTransactionType {

	ACCOUNTS_RECEIVABLE("ARC"),
	BACK_OFFICE_CONVERSION("BOC"),
	CORPORATE_CASH_DISBURSEMENT("CCD"),
	CUSTOMER_INITIATED_ENTRY("CIE"),
	CORPORATE_TRADE_EXCHANGE("CTX"),
	DEATH_NOTIFICATION_ENTRY("DNE"),
	AUTOMATED_ENROLLMENT_ENTRY("ENR"),
	INTERNATIONAL_ACH_TRANSACTION("IAT"),
	POINT_OF_PURCHASE("POP"),
	POINT_OF_SALE("POS"),
	PREARRANGED_PAYMENT_OR_DEPOSIT("PPD"),
	REPRESENTED_CHECK_ENTRY("RCK"),
	TELEPHONE_INITIATED("TEL"),
	WEB_INITIATED("WEB");
	
	List<String> codes = new ArrayList<String>();
	
	CheckingTransactionType(String... codes) {
		this.codes.addAll(Arrays.asList(codes));
	}
	
	public String getCode() {
		return codes.isEmpty() ? null : codes.get(0);
	}
	
	public static CheckingTransactionType getByCode(String code) {
		if (code == null) {
			return null;
		}
		for (CheckingTransactionType type : CheckingTransactionType.values()) {
			if (type.codes.contains(code)) {
				return type;
			}
		}
		return null;
	}
}
