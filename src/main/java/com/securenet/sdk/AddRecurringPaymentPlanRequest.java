package com.securenet.sdk;

import com.securenet.sdk.response.StoredRecurringPaymentPlan;

public class AddRecurringPaymentPlanRequest extends SecureNetRequest {

	public String customerId;
	public StoredRecurringPaymentPlan plan;
}
