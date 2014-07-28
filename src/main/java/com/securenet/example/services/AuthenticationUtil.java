package com.securenet.example.services;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.axis.encoding.Base64;

public class AuthenticationUtil {
	
	public static interface Identification {
		public String getUsername();
		public String getPassword();
	}
	
	public static Identification getIdentification(HttpServletRequest hsr) {
		try {
			final String header = hsr.getHeader("Authorization");
			if (header == null) {
				String uri = hsr.getRequestURL().toString();
				final Pattern urlPattern = Pattern.compile("(ftp|sftp)://(\\S+):(\\S+)@([\\S&&[^:]]+)(:(\\d+))?");
				final Matcher m = urlPattern.matcher(uri);
				if(! m.matches()) { 
					return null;			
				}
				final String user = m.group(2);
				final String pass = m.group(3); 
			    return new Identification() {
			    	public String getUsername() { return user; }
			    	public String getPassword() { return pass; }
			    };
			}
			final String encodedUserPassword = header.replaceFirst("Basic ", "");
			return getIdentification(encodedUserPassword);
		} catch (Exception e) {
			return null;
		}
	}
	
	public static Identification getIdentification(String encodedUserPassword) {
		final String usernameAndPassword = new String(Base64.decode(encodedUserPassword));
	    final StringTokenizer tokenizer = new StringTokenizer(usernameAndPassword, ":");
	    final String user = tokenizer.nextToken();
	    final String pass = tokenizer.nextToken();
	    return new Identification() {
	    	public String getUsername() { return user; }
	    	public String getPassword() { return pass; }
	    };
	}
}
