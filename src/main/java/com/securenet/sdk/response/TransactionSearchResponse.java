package com.securenet.sdk.response;

import java.util.ArrayList;
import java.util.List;


public class TransactionSearchResponse extends SecureNetResponse {

	public List<StoredTransaction> transactions = new ArrayList<StoredTransaction>(); 
}
