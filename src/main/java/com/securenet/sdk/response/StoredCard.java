package com.securenet.sdk.response;

import com.securenet.sdk.Address;

public class StoredCard {

	public String lastFourDigits;
	public String maskedNumber;
	
	public int expirationMonth;
	public int expirationYear;

	public FleetCardType fleetCardType;
	public CreditCardType creditCardType;

	public Address address;
	public String firstName;
	public String lastName;
	public String email;
}
