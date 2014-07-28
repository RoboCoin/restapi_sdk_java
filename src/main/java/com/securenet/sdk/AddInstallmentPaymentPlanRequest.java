package com.securenet.sdk;

import com.securenet.sdk.response.StoredInstallmentPaymentPlan;

public class AddInstallmentPaymentPlanRequest extends SecureNetRequest {

	public String customerId;
	public StoredInstallmentPaymentPlan plan;
}
