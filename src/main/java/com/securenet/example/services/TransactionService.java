package com.securenet.example.services;

import java.math.BigDecimal;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.securenet.sdk.TransactionSearchRequest;
import com.securenet.sdk.TransactionUpdateRequest;
import com.securenet.sdk.response.SecureNetResponse;
import com.securenet.sdk.response.StoredTransaction;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/transactions")
@Api(value = "/transactions", description = "Reporting Utilities")
@Produces(MediaType.APPLICATION_JSON)
public class TransactionService {

	@GET
	@ApiOperation(value = "Search for transactions", response = StoredTransaction.class, responseContainer = "List")
	public List<StoredTransaction> transactionList(
			@ApiParam(value = "Transaction ID", required = false) @QueryParam("transactionId") Integer transactionId,
			@ApiParam(value = "Order ID", required = false) @QueryParam("orderId") String orderId,
			@ApiParam(value = "Batch ID", required = false) @QueryParam("batchId") String batchId,
			@ApiParam(value = "Vault Customer ID", required = false) @QueryParam("customerId") String customerId,
			@ApiParam(value = "Start Date", required = false) @QueryParam("startDate") String startDateString,
			@ApiParam(value = "End Date", required = false) @QueryParam("endDate") String endDateString,
			@ApiParam(value = "Transaction Amount", required = false) @QueryParam("amount") BigDecimal amount
			) {
		TransactionSearchRequest r = new TransactionSearchRequest();
		r.transactionId = transactionId;
		r.orderId = orderId;
		r.batchId = batchId;
		r.customerId = customerId;
		r.startDate = Utilities.getDate(startDateString);
		r.endDate = Utilities.getDate(endDateString);
		r.amount = amount;
		return transactionList(r);
	}
	

	@POST
	@ApiOperation(value = "Search for transactions", response = StoredTransaction.class, responseContainer = "List")
	public List<StoredTransaction> transactionList(@ApiParam(value = "TransactionSearchRequest object", required = true) TransactionSearchRequest request) {
		List<StoredTransaction> list = Utilities.getSecureNet(hsr).getTransactions(request);
		return list;
	}

	@GET
	@Path("/{transactionId}")
	@ApiOperation(value = "Find a transaction by its ID", response = StoredTransaction.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID specified"), @ApiResponse(code = 404, message = "Transaction not found") })
	public StoredTransaction transactionById(@PathParam("transactionId") Integer transactionId) {
		if (transactionId == null) {
			throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity("Transaction ID is required").build());
		}
		TransactionSearchRequest r = new TransactionSearchRequest();
		r.transactionId = transactionId;
		List<StoredTransaction> list = Utilities.getSecureNet(hsr).getTransactions(r);
		if (list.isEmpty()) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("Transaction ID " + transactionId + " not found").build());
		}
		return list.get(0);
	}
	
	@PUT
	@Path("/{transactionId}")
	@ApiOperation(value = "Update a transaction", response = SecureNetResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID specified"), @ApiResponse(code = 404, message = "Transaction not found") })
	public SecureNetResponse updateTransaction(
			@PathParam("transactionId") Integer transactionId,
			@ApiParam(value = "TransactionUpdateRequest object", required = true) TransactionUpdateRequest request
		) {
		if (transactionId == null) {
			throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity("Transaction ID is required").build());
		}
		request.referenceTransactionId = transactionId;
		return Utilities.getSecureNet(hsr).updateTransaction(request);
	}
	
    @Context private javax.servlet.http.HttpServletRequest hsr;
}
