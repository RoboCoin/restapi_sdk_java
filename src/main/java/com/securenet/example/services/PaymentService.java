package com.securenet.example.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.securenet.sdk.AuthorizeRequest;
import com.securenet.sdk.CaptureRequest;
import com.securenet.sdk.CaptureResponse;
import com.securenet.sdk.ChargeRequest;
import com.securenet.sdk.CreditRequest;
import com.securenet.sdk.VerificationRequest;
import com.securenet.sdk.response.ChargeResponse;
import com.securenet.sdk.response.CreditResponse;
import com.securenet.sdk.response.RefundRequest;
import com.securenet.sdk.response.RefundResponse;
import com.securenet.sdk.response.VerificationResponse;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/payment")
@Api(value = "/payment", description = "Payment Utilities")
@Produces(MediaType.APPLICATION_JSON)
public class PaymentService {

	@POST
	@Path("/verify")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Verify a check or credit card", notes = "Expects a JSON representation of a VerificationRequest", response = VerificationResponse.class)

	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid charge request supplied"), @ApiResponse(code = 404, message = "ChargeRequest is required") })
	public VerificationResponse verify(@ApiParam(value = "VerificationRequest object", required = true) VerificationRequest request) {
		if (request == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("A VerificationRequest object is required").build());
		}
		VerificationResponse response = Utilities.getSecureNet(hsr, request).verify(request);
		Utilities.throwErrors(response);
		return response;
	}

	@POST
	@Path("/charge")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Make a SecureNet charge request", notes = "Expects a JSON representation of a ChargeRequest", response = ChargeResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid charge request supplied"), @ApiResponse(code = 404, message = "ChargeRequest is required") })
	public ChargeResponse charge(@ApiParam(value = "ChargeRequest object", required = true) ChargeRequest request) {
		if (request == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("A ChargeRequest object is required").build());
		}
		if (request.getIpAddress() == null) {
			request.setIpAddress(Utilities.getIpAddress(hsr));
		}
		ChargeResponse response = Utilities.getSecureNet(hsr, request).authorizeAndCapture(request);
		Utilities.throwErrors(response);
		return response;
	}

	@POST
	@Path("/authorize")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Make a SecureNet authorization request", notes = "Expects a JSON representation of an AuthorizeRequest", response = ChargeResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid authorization request supplied"), @ApiResponse(code = 404, message = "AuthorizeRequest is required") })
	public ChargeResponse authorize(@ApiParam(value = "AuthorizeRequest object", required = true) AuthorizeRequest request) {
		if (request == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("A AuthorizeRequest object is required").build());
		}
		if (request.getIpAddress() == null) {
			request.setIpAddress(Utilities.getIpAddress(hsr));
		}
		ChargeResponse response = Utilities.getSecureNet(hsr, request).authorize(request);
		Utilities.throwErrors(response);
		return response;
	}

	@POST
	@Path("/capture")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Make a SecureNet capture request", notes = "Expects a JSON representation of a CaptureRequest", response = CaptureResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid capture request supplied"), @ApiResponse(code = 404, message = "CaptureRequest is required") })
	public CaptureResponse capture(@ApiParam(value = "CaptureRequest object", required = true) CaptureRequest request) {
		if (request == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("A ChargeRequest object is required").build());
		}
		if (request.ipAddress == null) {
			request.ipAddress = Utilities.getIpAddress(hsr);
		}
		CaptureResponse response = Utilities.getSecureNet(hsr, request).capture(request);
		Utilities.throwErrors(response);
		return response;
	}

	@POST
	@Path("/refund")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Make a SecureNet refund request", notes = "Expects a JSON representation of a RefundRequest", response = RefundResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid charge request supplied"), @ApiResponse(code = 404, message = "RefundRequest is required") })
	public RefundResponse refund(@ApiParam(value = "RefundRequest object", required = true) RefundRequest request) {
		if (request == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("A RefundRequest object is required").build());
		}
		if (request.ipAddress == null) {
			request.ipAddress = Utilities.getIpAddress(hsr);
		}
		RefundResponse response = Utilities.getSecureNet(hsr, request).refund(request);
		Utilities.throwErrors(response);
		return response;
	}

	@POST
	@Path("/void")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Make a SecureNet refund request", notes = "Expects a JSON representation of a VoidRequest", response = RefundResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid void request supplied"), @ApiResponse(code = 404, message = "VoidRequest is required") })
	public RefundResponse voidTransaction(@ApiParam(value = "VoidRequest object", required = true) RefundRequest request) {
		if (request == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("A RefundRequest object is required").build());
		}
		if (request.ipAddress == null) {
			request.ipAddress = Utilities.getIpAddress(hsr);
		}
		RefundResponse response = Utilities.getSecureNet(hsr, request).voidTransaction(request);
		Utilities.throwErrors(response);
		return response;
	}

	@POST
	@Path("/credit")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Make a SecureNet credit request", notes = "Expects a JSON representation of a CreditRequest", response = CreditResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid charge request supplied"), @ApiResponse(code = 404, message = "CreditRequest is required") })
	public CreditResponse credit(@ApiParam(value = "CreditRequest object", required = true) CreditRequest request) {
		if (request == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("A CreditRequest object is required").build());
		}
		if (request.ipAddress == null) {
			request.ipAddress = Utilities.getIpAddress(hsr);
		}
		CreditResponse response = Utilities.getSecureNet(hsr, request).credit(request);
		Utilities.throwErrors(response);
		return response;
	}

	@Context private javax.servlet.http.HttpServletRequest hsr;

}
