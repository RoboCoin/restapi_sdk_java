package com.securenet.sdk;

public class Address {

	public String line1;
	public String line2;
	public String city;
	public String state;
	public String zip;
	public String country = "US";

	public Address setMain(String in) {
		this.line1 = in;
		return this;
	}

	public Address setExtended(String in) {
		this.line2 = in;
		return this;
	}

	public Address setCity(String in) {
		this.city = in;
		return this;
	}

	public Address setRegion(String in) {
		this.state = in;
		return this;
	}

	public Address setState(String in) {
		this.state = in;
		return this;
	}

	public Address setPostalCode(String in) {
		this.zip = in;
		return this;
	}	

	public Address setZipCode(String in) {
		this.zip = in;
		return this;
	}	

	public Address setCountry(String in) {
		this.country = in;
		return this;
	}

}
