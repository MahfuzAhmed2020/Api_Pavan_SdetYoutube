package com.runner.sdet;

import org.junit.Test;

import io.restassured.RestAssured;

import static org.hamcrest.Matcher.*;
import static io.restassured.RestAssured.*;

public class Requests {
public static void main(String[] args) {
	getCall();
}
	public static void getCall() {
		//RestAssured.baseURI="https://osasapi.herokuapp.com";
		given().when().get("https://osasapi.herokuapp.com").then().statusCode(200).statusLine("").assertThat();
	}

	

}
