package com.securenet.sdk;

import java.math.BigDecimal;

public class TaxData {

	public static enum Status { NOT_INCLUDED, INCLUDED, EXEMPT }
	public BigDecimal amount;
	public Status status;

}
