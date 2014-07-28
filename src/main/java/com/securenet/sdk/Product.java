package com.securenet.sdk;

import java.math.BigDecimal;

public class Product {

	public String alternateTaxId;
	public String commodityCode;
	public BigDecimal discountAmount;
	public BigDecimal discountRate;
	public String discountIndicator; // ??? should be an enum ???
	public String grossNetIndicator; // ??? should be an enum ???
	
	public String itemCode;
	public String itemName;
	public String itemDescription;
	public String unit;
	public BigDecimal unitPrice;

	public BigDecimal quantity;
	public BigDecimal totalAmount;
	
	public BigDecimal taxAmount;
	public BigDecimal taxRate;
	public String taxTypeIdentifier; // ??? should be an enum ???
	public String taxTypeApplied; // ??? should be an enum ???
	public boolean taxable;
	
}
