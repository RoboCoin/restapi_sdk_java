package com.securenet.sdk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VaultCredentials {

	public Integer secureNetId;
	
	@JsonIgnore
	public String secureNetKey;
	
	@JsonProperty
	public void setSecureNetKey(String key) {
		this.secureNetKey = key;
	}

}
