package com.securenet.sdk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Nothing set in this class will change the amount of money transacted.  The more detail that you provide, the lower your rates may be and the more
 * information you'll be able to extract from SecureNet's reporting in the future.
 */
public class ExtendedInformation {

	public GoodsType typeOfGoods;
	public final MailOrTelephoneOrderData mailOrTelephoneOrderData = new MailOrTelephoneOrderData();
	public final ServiceData serviceData = new ServiceData();

	public String invoiceNumber;
	public String invoiceDescription;
	
	public String purchaseOrder;

	public Date orderDate;
	
	public TaxData taxData = new TaxData();
	public VatData vatData = new VatData();
	
	public BigDecimal dutyAmount;
	public BigDecimal freightAmount;
	public BigDecimal discountAmount;
	
	public Address destinationAddress = new Address();
	public Address originAddress = new Address();

	public List<Product> products = new ArrayList<Product>();
	
	public String terminalId;
	public String storeNumber;
	public Integer retailLaneNumber;
	
	public DeveloperApplication developerApplication = new DeveloperApplication();
	
	public String deviceCode;
	public String entrySource;
	
	public boolean cardPresent;
}
