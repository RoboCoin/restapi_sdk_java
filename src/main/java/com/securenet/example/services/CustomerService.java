package com.securenet.example.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.securenet.sdk.AddCustomerRequest;
import com.securenet.sdk.AddInstallmentPaymentPlanRequest;
import com.securenet.sdk.AddPaymentMethodRequest;
import com.securenet.sdk.AddRecurringPaymentPlanRequest;
import com.securenet.sdk.SecureNetRequest;
import com.securenet.sdk.UpdateCustomerRequest;
import com.securenet.sdk.UpdatePaymentMethodRequest;
import com.securenet.sdk.UpdatePaymentMethodResponse;
import com.securenet.sdk.response.AddCustomerResponse;
import com.securenet.sdk.response.AddPaymentMethodResponse;
import com.securenet.sdk.response.PaymentPlanResponse;
import com.securenet.sdk.response.SecureNetResponse;
import com.securenet.sdk.response.StoredPaymentPlan;
import com.securenet.sdk.response.UpdateCustomerResponse;
import com.securenet.sdk.response.VaultCustomer;
import com.securenet.sdk.response.VaultPaymentMethod;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/customers")
@Api(value = "/customers", description = "Customer Utilities")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerService {

	// Customers
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Add a new customer", notes = "Expects a JSON representation of an AddPaymentMethodRequest", response = AddCustomerResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid request supplied"), @ApiResponse(code = 404, message = "AddCustomerRequest is required") })
	public AddCustomerResponse addPaymentMethod(@ApiParam(value = "AddCustomerRequest object", required = true) AddCustomerRequest request) {
		if (request == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("A request object is required").build());
		}
		AddCustomerResponse response = Utilities.getSecureNet(hsr, request).addCustomer(request);
		Utilities.throwErrors(response);
		return response;
	}
	
	@GET
	@Path("/{customerId}")
	@ApiOperation(value = "Retrieve batch information by ID", response = VaultCustomer.class) 
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID specified"), @ApiResponse(code = 404, message = "Customer not found") })
	public VaultCustomer customerById(@PathParam("customerId") String customerId) {
		if (customerId == null) {
			throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity("Customer ID is required").build());
		}
		VaultCustomer customer = Utilities.getSecureNet(hsr).getCustomer(customerId);
		if (customer == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("Customer ID " + customerId + " not found").build());
		}
		return customer;
	}
	
	@PUT
	@Path("/{customerId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Update customer information", notes = "Expects a JSON representation of an UpdateCustomerRequest", response = UpdateCustomerResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid request supplied"), @ApiResponse(code = 404, message = "UpdateCustomerRequest is required") })
	public UpdateCustomerResponse updateCustomer(@PathParam("customerId") String customerId, @ApiParam(value = "UpdateCustomerRequest object", required = true) UpdateCustomerRequest request) {
		if (request == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("A request object is required").build());
		}
		request.id = customerId;
		UpdateCustomerResponse response = Utilities.getSecureNet(hsr, request).updateCustomer(request);
		Utilities.throwErrors(response);
		return response;
	}

	@DELETE
	@Path("/{customerId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Delete customer information")
	public SecureNetResponse deleteCustomer(@PathParam("customerId") String customerId, @ApiParam(value = "UpdateCustomerRequest object", required = true) SecureNetRequest request) {
		SecureNetResponse response =  Utilities.getSecureNet(hsr, request).removeCustomer(customerId);
		return response;
	}
	
	// Payment types
	
	@POST
	@Path("/{customerId}/paymentMethods/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Add a payment method to an existing customer", notes = "Expects a JSON representation of an AddPaymentMethodRequest", response = AddPaymentMethodResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid request supplied"), @ApiResponse(code = 404, message = "AddPaymentMethodRequest is required") })
	public AddPaymentMethodResponse addPaymentMethod(@PathParam("customerId") String customerId, @ApiParam(value = "AddPaymentMethodRequest object", required = true) AddPaymentMethodRequest request) {
		if (request == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("A request object is required").build());
		}
		if (customerId == null) {
			throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity("Customer ID is required").build());
		}
		request.customerId = customerId;
		AddPaymentMethodResponse response = Utilities.getSecureNet(hsr, request).addCustomerPaymentMethod(request);
		Utilities.throwErrors(response);
		return response;
	}
		

	@GET
	@Path("/{customerId}/paymentMethods/{paymentMethodId}")
	@ApiOperation(value = "Retrieve payment method information by ID", response = VaultPaymentMethod.class) 
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID specified"), @ApiResponse(code = 404, message = "ID not found") })
	public VaultPaymentMethod paymentMethodById(@PathParam("customerId") String customerId, @PathParam("paymentMethodId") String paymentMethodId) {
		if (customerId == null) {
			throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity("Customer ID is required").build());
		}
		if (paymentMethodId == null) {
			throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity("Payment Method ID is required").build());
		}
		VaultCustomer customer = Utilities.getSecureNet(hsr).getCustomer(customerId);
		if (customer == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("Customer ID " + customerId + " not found").build());
		}
		for (VaultPaymentMethod vpm : customer.paymentMethods) {
			if (paymentMethodId.equals(vpm.id)) {
				return vpm;
			}
		}
		throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("Payment Method ID " + paymentMethodId + " not found for customer ID " + customerId).build());
	}
	
	@PUT
	@Path("/{customerId}/paymentMethods/{paymentMethodId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Update payment method information", notes = "Expects a JSON representation of an UpdatePaymentMethodRequest", response =  UpdatePaymentMethodResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid request supplied"), @ApiResponse(code = 404, message = "UpdatePaymentMethodRequest is required") })
	public UpdatePaymentMethodResponse updatePaymentMethod(@PathParam("customerId") String customerId, @PathParam("paymentMethodId") String paymentMethodId, @ApiParam(value = "UpdatePaymentMethodRequest object", required = true) UpdatePaymentMethodRequest request) {
		if (request == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("A request object is required").build());
		}
		request.customerId = customerId;
		request.paymentMethodId = paymentMethodId;
		UpdatePaymentMethodResponse response = Utilities.getSecureNet(hsr, request).updateCustomerPaymentMethod(request);
		Utilities.throwErrors(response);
		return response;
	}

	@DELETE
	@Path("/{customerId}/paymentMethods/{paymentMethodId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Delete customer information")
	public SecureNetResponse deletePaymentMethod(@PathParam("customerId") String customerId, @PathParam("paymentMethodId") String paymentMethodId, @ApiParam(value = "UpdatePaymentMethodRequest object", required = true) SecureNetRequest request) {
		SecureNetResponse response =  Utilities.getSecureNet(hsr, request).removeCustomerPaymentMethod(customerId, paymentMethodId);
		return response;
	}
	
// Schedules
	
	@POST
	@Path("/{customerId}/plans/createInstallment")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Add an installment plan to an existing customer", notes = "Expects a JSON representation of an AddInstallmentPaymentPlanRequest", response = PaymentPlanResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid request supplied"), @ApiResponse(code = 404, message = "AddInstallmentPaymentPlanRequest is required") })
	public PaymentPlanResponse addSchedule(@PathParam("customerId") String customerId, @ApiParam(value = "AddInstallmentPaymentPlanRequest object", required = true) AddInstallmentPaymentPlanRequest request) {
		if (request == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("A request object is required").build());
		}
		if (customerId == null) {
			throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity("Customer ID is required").build());
		}
		request.customerId = customerId;
		PaymentPlanResponse response = Utilities.getSecureNet(hsr).addCustomerPaymentPlan(request);
		Utilities.throwErrors(response);
		return response;
	}
	
	@POST
	@Path("/{customerId}/plans/createRecurring")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Add a recurring plan to an existing customer", notes = "Expects a JSON representation of an AddRecurringPaymentPlanRequest", response = PaymentPlanResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid request supplied"), @ApiResponse(code = 404, message = "AddRecurringPaymentPlanRequest is required") })
	public PaymentPlanResponse addSchedule(@PathParam("customerId") String customerId, @ApiParam(value = "AddRecurringPaymentPlanRequest object", required = true) AddRecurringPaymentPlanRequest request) {
		if (request == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("A request object is required").build());
		}
		if (customerId == null) {
			throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity("Customer ID is required").build());
		}
		request.customerId = customerId;
		PaymentPlanResponse response = Utilities.getSecureNet(hsr).addCustomerPaymentPlan(request);
		Utilities.throwErrors(response);
		return response;
	}

	@GET
	@Path("/{customerId}/plans/{planId}")
	@ApiOperation(value = "Retrieve scheduled payment plan information by ID",response = StoredPaymentPlan.class) 
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID specified"), @ApiResponse(code = 404, message = "ID not found") })
	public StoredPaymentPlan getSchedule(@PathParam("customerId") String customerId, @PathParam("planId") Integer planId) {
		require(customerId, "Customer ID is required");
		require(planId, "Plan ID is required");
		StoredPaymentPlan plan = Utilities.getSecureNet(hsr).getPaymentPlan(customerId, planId);
		if (plan == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("Plan ID " + planId + " not found for Customer ID " + customerId).build());
		}
		return plan;
	}

	@Context private javax.servlet.http.HttpServletRequest hsr;

	void require(Object in, String message) {
		if (in == null) {
			throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity(message).build());
		}
	}
}
