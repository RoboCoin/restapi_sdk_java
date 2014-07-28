package com.securenet.example.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.server.JSONP;

import com.securenet.example.services.AuthenticationUtil.Identification;
import com.securenet.sdk.PreVaultRequest;
import com.securenet.sdk.SecureNet;
import com.securenet.sdk.response.PreVaultResponse;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@Path("/js")
@Api(value = "/js", description = "SecureNet.js Services")
@Produces(MediaType.APPLICATION_JSON)
public class PreVaultService {

	@GET
	@Path("/vaultCardNotPresent")
	@JSONP(queryParam="callback")
	@Produces("application/x-javascript")
	@ApiOperation(value = "Save a card into a temporary vault", response = PreVaultResponse.class) 
	public PreVaultResponse preVaultCardNotPresent(
			@ApiParam(value = "Authenticaion (use NzAwMjE0MzpPc29qTE50MHJqQ1Y)", required = true) @QueryParam("auth") String auth,
			@ApiParam(value = "Card Number", required = true) @QueryParam("card") String number,
			@ApiParam(value = "Verification", required = false) @QueryParam("cvv") String cvv,
			@ApiParam(value = "Expiration", required = false) @QueryParam("expiration") String expiration
		) {
		if (number == null) {
			throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity("Card number is required").build());
		}
		Identification id = AuthenticationUtil.getIdentification(auth + "=");
		if (id == null) {
			Utilities.throwInvalidAuthentication();
		}
		PreVaultRequest request = new PreVaultRequest();
		request.card.setNumber(number);
		request.card.setCvv(cvv);
		if (expiration == null) {
			request.card.expirationMonth = 12;
			request.card.expirationYear = 17;
		} else {
			request.card.setExpirationDate(expiration);
		}
		SecureNet secureNet = new SecureNet(id.getUsername(), id.getPassword());
		PreVaultResponse response = secureNet.preVault(request);
		return response;
	}
	
	@GET
	@Path("/vaultCardPresent")
	@JSONP(queryParam="callback")
	@ApiOperation(value = "Save a card into a temporary vault", response = PreVaultResponse.class) 
	public PreVaultResponse preVaultCardPresent(
			@ApiParam(value = "Authenticaion (use NzAwMjE0MzpPc29qTE50MHJqQ1Y)", required = true) @QueryParam("auth") String auth,
			@ApiParam(value = "Trackdata", required = true) @QueryParam("trackdata") String trackdata
		) {
		if (trackdata == null) {
			throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity("Card number is required").build());
		}
		PreVaultRequest request = new PreVaultRequest();
		Identification id = AuthenticationUtil.getIdentification(auth + "=");
		if (id == null) {
			Utilities.throwInvalidAuthentication();
		}
		request.card.trackData = trackdata;
		SecureNet secureNet = new SecureNet(id.getUsername(), id.getPassword());
		PreVaultResponse response = secureNet.preVault(request);
		return response;
	}
	
    @Context private javax.servlet.http.HttpServletRequest hsr;

}
