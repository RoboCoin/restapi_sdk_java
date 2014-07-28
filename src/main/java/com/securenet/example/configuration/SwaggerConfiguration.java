package com.securenet.example.configuration;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import scala.Option;
import scala.collection.immutable.List;
import scala.collection.immutable.Map;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.model.ApiDescription;
import com.wordnik.swagger.model.Model;

@Path("/api-docs")
@Api("/api-docs")
@Produces({ "application/json" })
public class SwaggerConfiguration extends com.wordnik.swagger.model.ApiListing {

	public SwaggerConfiguration(String apiVersion, String swaggerVersion, String basePath, String resourcePath, List<String> produces, List<String> consumes, List<String> protocols, List<String> authorizations, List<ApiDescription> apis,
			Option<Map<String, Model>> models, Option<String> description, int position) {
		super(apiVersion, swaggerVersion, basePath, resourcePath, produces, consumes, protocols, authorizations, apis, models, description, position);
		// TODO Auto-generated constructor stub
	}
}