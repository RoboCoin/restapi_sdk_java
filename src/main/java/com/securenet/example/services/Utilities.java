package com.securenet.example.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.securenet.example.services.AuthenticationUtil.Identification;
import com.securenet.sdk.ChargeRequest;
import com.securenet.sdk.SecureNet;
import com.securenet.sdk.SecureNetRequest;
import com.securenet.sdk.VaultCredentials;
import com.securenet.sdk.response.ResultType;
import com.securenet.sdk.response.SecureNetResponse;

public class Utilities {

	@SuppressWarnings("deprecation")
	static Date getDate(String in) {
		if (in == null) {
			return null;
		}
		try { return getFormat("yyyy-mm-dd'T'hh:mm:ss'Z'").parse(in); } catch (ParseException e) { }
		try { return new SimpleDateFormat("yyyy-mm-dd'T'hh:mm:ss").parse(in); } catch (ParseException e) { }
		try { return new SimpleDateFormat("yyyy-mm-dd").parse(in); } catch (ParseException e) { }
		try { return new Date(in); } catch (Exception e) { }
		return null;
	}
	
	static SimpleDateFormat getFormat(String in) {
		SimpleDateFormat f = new SimpleDateFormat(in);
		f.setTimeZone(TimeZone.getTimeZone("UTC"));
		return f;
	}

    static String getIpAddress(HttpServletRequest hsr) {
    	return hsr.getRemoteAddr();
    }
		
    static SecureNet getSecureNet(HttpServletRequest hsr) {
    	Identification id = AuthenticationUtil.getIdentification(hsr);
    	if (id == null) {
    		throwInvalidAuthentication();
    	}
    	return new SecureNet(id.getUsername(), id.getPassword());
    }
    
    static SecureNet getSecureNet(HttpServletRequest hsr, final SecureNetRequest request) {
    	Identification id = null;
    	if (request != null && request.secureNetId != null && request.secureNetKey != null) {
    		id = new Identification() {
				public String getUsername() { return "" + request.secureNetId; }
				public String getPassword() { return request.secureNetKey; }
    		};
    	} else if (hsr != null) {
    		id = AuthenticationUtil.getIdentification(hsr);
    	}
    	if (id == null) {
//    		throwInvalidAuthentication();
        	return new SecureNet("7002143", "OsojLNt0rjCV"); // NzAwMjE0MzpPc29qTE50MHJqQ1Y=
    	}
    	VaultCredentials vc = null;
    	if (request != null && request instanceof ChargeRequest) {
    		ChargeRequest cr = (ChargeRequest) request;
    		vc = cr.vaultCredentials;
    		if (vc.secureNetId != null && vc.secureNetKey != null) {
    			return new SecureNet(id.getUsername(), id.getPassword(), "" + vc.secureNetId, vc.secureNetKey);
    		}
    	}
    	return new SecureNet(id.getUsername(), id.getPassword());
    }
    
    static void throwInvalidAuthentication() {
		SecureNetResponse response = new SecureNetResponse();
		response.success = false;
		response.errorCode = "TODO";
		response.message = "SecureNet ID and Key should be passed as Basic authentication tokens";
		response.result = ResultType.AUTHENTICATION_ERROR;
		throw new WebApplicationException(
			Response
				.status(Status.UNAUTHORIZED)
				.entity(response)
				.header("WWW-Authenticate", "BASIC realm=\"SecureNet API\"")
				.build());    	
    }
    
	static void throwErrors(SecureNetResponse response) {
		if (response.success == false) {
			if ("TODO".equals(response.errorCode)) {
				throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity(response).build());
			}
			if (response.result == null) {
				response.result = ResultType.COMMUNICATION_ERROR;
				response.message = "Internal error";
				response.errorCode = "TODO";
			}
			switch(response.result) {
			case SUCCESS:
				return; // Should never happen
			case AUTHENTICATION_ERROR:
				throw new WebApplicationException(Response.status(Status.UNAUTHORIZED).entity(response).build());
			default:
				// Returning 200 OK is all right
			}
		}
	}

}
