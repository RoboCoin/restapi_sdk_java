package com.securenet.sdk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TransactionUpdateRequest extends SecureNetRequest {

	public Integer referenceTransactionId;
	
	public String invoiceNumber;
	public String invoiceDescription;
	public String purchaseOrder;

	public Date orderDate;
	
	public final TaxData taxData = new TaxData();
	
	public BigDecimal dutyAmount;
	public BigDecimal freightAmount;
	
	public final Address destinationAddress = new Address();
	public final Address originAddress = new Address();

	public final List<Product> products = new ArrayList<Product>();

	public String signatureImage;
}
