package com.securenet.sdk.response;

import java.util.List;

public class BatchResponse extends SecureNetResponse {

	public String batchId;
	public List<StoredTransaction> transactions;
}
