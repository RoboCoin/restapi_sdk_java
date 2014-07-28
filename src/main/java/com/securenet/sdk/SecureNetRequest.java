package com.securenet.sdk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SecureNetRequest {

	public Integer secureNetId;
	
	@JsonIgnore
	public String secureNetKey;
	
	@JsonProperty
	public void setSecureNetKey(String key) {
		this.secureNetKey = key;
	}

	boolean test;

	public boolean isTest() {
		return test;
	}

	public Object setTest(boolean test) {
		this.test = test;
		return this;
	}

}
