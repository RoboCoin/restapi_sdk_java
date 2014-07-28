package com.securenet.sdk;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE;
import com.securenet.sdk.response.StoredTransaction;

public class SecureNetReporting {

	SecureNet secureNet;
	
	public SecureNetReporting(SecureNet secureNet) {
		this.secureNet = secureNet;
	}
	
	public List<StoredTransaction> getTransactions(TransactionSearchRequest request) {
		List<StoredTransaction> list = new ArrayList<StoredTransaction>();
		try {
			if (request.transactionId != null) {
				TRANSACTIONRESPONSE r = secureNet.getTransactionProxy().getTransactionByTransactionID(secureNet.merchantKey, "" + request.transactionId);
				list.add(secureNet.mapper.getStoredTransaction(r));
			} else if (! secureNet.mapper.isBlank(request.orderId)) {
				TRANSACTIONRESPONSE r = secureNet.getTransactionProxy().getTransactionByOrderID(secureNet.merchantKey, request.orderId);
				list.add(secureNet.mapper.getStoredTransaction(r));
			} else if (! secureNet.mapper.isBlank(request.batchId)) {
				TRANSACTIONRESPONSE[] a = secureNet.getTransactionProxy().getBatchTransactions(secureNet.merchantKey, request.batchId);
				for (TRANSACTIONRESPONSE r : a) {
					list.add(secureNet.mapper.getStoredTransaction(r));
				}
			} else {
				BigDecimal amount = request.amount == null ? BigDecimal.ZERO : request.amount;
				String startDate = getDateString(request.startDate);
				String endDate = getDateString(request.endDate);
				String excludeDate = (startDate == null && endDate == null ? "1" : "0");				
				TRANSACTIONRESPONSE[] a = secureNet.getTransactionProxy().getTransactions(secureNet.merchantKey, startDate, endDate, excludeDate, request.customerId, amount, null);
				for (TRANSACTIONRESPONSE r : a) {
					if (r.getTRANSACTIONID() != null && ! r.getTRANSACTIONID().equals(0)) {
						list.add(secureNet.mapper.getStoredTransaction(r));
					}
				}
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<StoredTransaction> out = new ArrayList<StoredTransaction>(list.size());
		for (StoredTransaction candidate : list) {
			if (request.amount != null && candidate.transactionData != null && ! request.amount.equals(candidate.transactionData.amount)) {
				continue;
			}
			if (! secureNet.mapper.isBlank(request.batchId) && (candidate.settlementData == null || ! request.batchId.equals(candidate.settlementData.batchId))) {
				continue;
			}
			if (! secureNet.mapper.isBlank(request.customerId)) {
				if (candidate.vaultData == null || candidate.vaultData.token == null) {
					continue;
				}
				if (! request.customerId.equals(candidate.vaultData.token.customerId)) {
					continue;
				}
			}
			if (request.endDate != null && candidate.transactionData != null && candidate.transactionData.date != null) {
				if (request.endDate.before(candidate.transactionData.date)) {
					continue;
				}
			}
			if (! secureNet.mapper.isBlank(request.orderId) && ! request.orderId.equals(candidate.orderId)) {
				continue;
			}
			if (request.startDate != null && candidate.transactionData != null && candidate.transactionData.date != null) {
				if (request.startDate.after(candidate.transactionData.date)) {
					continue;
				}
			}
			if (request.transactionId != null && ! request.transactionId.equals(candidate.transactionId)) {
				continue;
			}
			out.add(candidate);
		}
		return out;
	}
	
	private String getDateString(Date in) {
		if (in == null) {
			return null;
		}
		return new SimpleDateFormat("mm/dd/yyyy").format(in);
	}

	
}
