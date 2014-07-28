package com.securenet.sdk.response;

import java.util.ArrayList;
import java.util.List;

public class StoredVariablePaymentPlan extends StoredPaymentPlan {

	public List<StoredScheduledPayment> scheduledPayments = new ArrayList<StoredScheduledPayment>();
}
