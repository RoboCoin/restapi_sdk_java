package com.securenet.example.configuration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import javax.ws.rs.Produces;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Provider
@Produces("application/json")
public class JsonConfiguration implements ContextResolver<ObjectMapper> {

	private ObjectMapper objectMapper;

	public JsonConfiguration() throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		this.objectMapper = new ObjectMapper()
			.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true)
			.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true)
			.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
			.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true)
			.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false)
			.configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, false)
			.configure(SerializationFeature.WRITE_ENUMS_USING_INDEX, false)
			.setDateFormat(dateFormat)
			.setSerializationInclusion(Include.NON_EMPTY)
			;
	}

	public ObjectMapper getContext(Class<?> type) {
		return objectMapper;
	}
	
}
