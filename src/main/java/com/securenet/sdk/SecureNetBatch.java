package com.securenet.sdk;

import java.rmi.RemoteException;

import com.securenet.gateway.API.Contracts.BATCHDATA;
import com.securenet.sdk.response.BatchResponse;

public class SecureNetBatch {

	SecureNet secureNet;
	
	SecureNetBatch(SecureNet secureNet) {
		this.secureNet = secureNet;
	}
	
	BatchResponse getCurrentBatchId() {
		BatchResponse response = new BatchResponse();
		try {
			response.batchId = secureNet.getTransactionProxy().getCurrentBatchID(secureNet.merchantKey);
			response.success = true;
		} catch (RemoteException e) {
			response.success = false;
			response.message = e.getLocalizedMessage();
			response.errorCode = "TODO";
		}
		return response;
	}
	
	BatchResponse closeBatch() {
		BatchResponse response = new BatchResponse();
		try {
			BATCHDATA data = secureNet.getGatewayProxy().closeBatch(secureNet.merchantKey);
			if (data.getBATCHDETAILS() != null && data.getBATCHDETAILS().length > 0) {
				response.batchId = data.getBATCHDETAILS()[0].getBATCHID();
			}
			response.success = true;
		} catch (RemoteException e) {
			response.success = false;
			response.message = e.getLocalizedMessage();
			response.errorCode = "TODO";
		}
		return response;
	}
	
}
