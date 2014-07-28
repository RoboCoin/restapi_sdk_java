package com.securenet.example.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.securenet.sdk.TransactionSearchRequest;
import com.securenet.sdk.response.BatchResponse;
import com.securenet.sdk.response.StoredTransaction;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/batches")
@Api(value = "/batches", description = "Batch Utilities")
@Produces(MediaType.APPLICATION_JSON)
public class BatchService {

	@GET
	@Path("/{batchId}")
	@ApiOperation(value = "Retrieve batch information by ID", response = BatchResponse.class) 
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID specified"), @ApiResponse(code = 404, message = "Batch not found") })
	public BatchResponse batchById(@PathParam("batchId") String batchId) {
		if (batchId == null) {
			throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity("Batch ID is required").build());
		}
		TransactionSearchRequest r = new TransactionSearchRequest();
		r.batchId = batchId;
		List<StoredTransaction> list = Utilities.getSecureNet(hsr).getTransactions(r);
		if (list.isEmpty()) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("Batch ID " + batchId + " not found").build());
		}
		BatchResponse response = new BatchResponse();
		response.success = true;
		response.batchId = list.get(0).settlementData.batchId;
		response.transactions = list;
		return response;
	}
	
	@POST
	@Path("/close")
	@ApiOperation(value = "Retrieve current batch information",response = BatchResponse.class) 
	public BatchResponse currentBatch() {
		return Utilities.getSecureNet(hsr).closeBatch();
	}

    @Context private javax.servlet.http.HttpServletRequest hsr;

}
