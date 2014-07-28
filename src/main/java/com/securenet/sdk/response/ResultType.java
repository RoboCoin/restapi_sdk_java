package com.securenet.sdk.response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum ResultType {

		SUCCESS("0000"), 
		COMMUNICATION_ERROR(""),
		AUTHENTICATION_ERROR("0104"), 
		DECLINE, 
		DECLINE_AVS, 
		DECLINE_CVV, 
		UNSUPPORTED_CARD("0142"), 
		INVALID_NAME, 
		INVALID_ADDRESS, 
		INVALID_CARD_NUMBER("01C1", "0140"), 
		INVALID_CVV, 
		INVALID_EXPIRATION, 
		GATEWAY_ERROR;  
		
		List<String> codes = new ArrayList<String>();
		
		ResultType(String... codes) {
			this.codes.addAll(Arrays.asList(codes));
		}
		
		public static ResultType getByCode(String code) {
			if (code == null) {
				return null;
			}
			for (ResultType type : ResultType.values()) {
				if (type.codes.contains(code)) {
					return type;
				}
			}
			return GATEWAY_ERROR;
		}

	

}
