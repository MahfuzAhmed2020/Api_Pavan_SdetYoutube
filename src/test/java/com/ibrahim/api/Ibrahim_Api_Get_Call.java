package com.ibrahim.api;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Ibrahim_Api_Get_Call {
	

	public static void main(String[] args) {
		 //getCall();
		getCallZippotam();
	}
//@Test(/*enabled = false*/)
	public static void getCall() {
		RestAssured.baseURI = "https://osasapi.herokuapp.com";
		Response response = given().log().all().when().get("customers/60c90eee157e3b0017125366").then().statusCode(200).log().all().extract().response();
//		RequestSpecification request= RestAssured.given();
//		Response response=request.get("customers/60c90eee157e3b0017125366").then().statusCode(200).log().all().extract().response();
		System.out.println("  response.path(\"userId\")   =    " + response.path("userId"));
		System.out.println("  response.path(\"firstName\")   =    " + response.path("firstName"));
		System.out.println("  response.path(\"lastName\")   =    " + response.path("lastName"));
		System.out.println("  response.path(\"email\")   =    " + response.path("email"));
		System.out.println("  response.path(\"phone\")   =    " + response.path("phone"));
		Assert.assertEquals("mahfuz", response.path("firstName"));
		Response response1 = given().log().all().when().get("customers").then().statusCode(200).log().all().extract().response();
		
	}

	public static void getCallZippotam() {
		RestAssured.baseURI = "http://api.zippopotam.us";

		Response response = given().log().all().when().get("/de/24848").then().statusCode(200).log().all().extract().response();

		System.out.println(" response.contentType()   =  " + response.contentType());
		System.out.println(" response.path(\"'post code'\")   =  " + response.path("'post code'"));
		System.out.println("  response.path(\"country\")   =  " + response.path("country"));
		System.out.println("  response.path(\"'country abbreviation'\")   =  " + response.path("'country abbreviation'"));
		System.out.println(" response.path(\"places\")   =  " + response.path("places"));
		System.out.println(" response.getBody().jsonPath().getString(\"places\")   = "+ response.getBody().jsonPath().getString("places"));
		// For the space use '' (Single quotation) example:- response.path(\"places.'place name'\")
		System.out.println(" response.path(\"places.'place name'\")   =  " + response.path("places.'place name'"));
		System.out.println(" response.getBody().jsonPath().getString(\"places.'place name'\")   = "+ response.getBody().jsonPath().getString("places.'place name'"));
		System.out.println(" response.path(\"places[0]\")   =  " + response.path("places[0]"));
		System.out.println("  response.path(\"places[0].'place name'\")   =  " + response.path("places[0].'place name'"));
		System.out.println("  response.path(\"places[0].longitude\")   =  " + response.path("places[0].longitude"));
		System.out.println("  response.path(\"places[0].state\")   =  " + response.path("places[0].state"));
		System.out.println("  response.path(\"places[0].'state abbreviation'\")   =  " + response.path("places[0].'state abbreviation'"));
		System.out.println("  response.path(\"places[0].latitude\")   =  " + response.path("places[0].latitude"));
		
		
	}

}
