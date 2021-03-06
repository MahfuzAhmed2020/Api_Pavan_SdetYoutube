package com.osa.format;

import org.json.JSONObject;

import io.restassured.response.Response;

public class FormatOsa {

	public static String prettyPrint(Response res) {
		JSONObject response=new JSONObject(res.asString());
		return response.toString(4);	
	}
	public static String prettyPrint(String value) {
		JSONObject response=new JSONObject(value);
		return response.toString(4);
	}

}
