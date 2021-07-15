package com.osa.format;
import io.restassured.response.Response;

public class RequestHelperOsa {
	static Response res = null;

	public void getResponse(Response resp) {
		res = resp;
	}

	public static String getValueFromResponse(String xpath) {
		String value = "";
		try {
			value = res.getBody().jsonPath().getString(xpath).toString();
		} catch (Exception e) {

		}

		return value;
	}

}
