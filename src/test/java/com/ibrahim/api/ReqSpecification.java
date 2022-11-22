package com.ibrahim.api;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ReqSpecification {
	RequestSpecification reqSpce;

	@BeforeClass
	public void usindRequestSpecification() {
		String payload = "";

		reqSpce = RestAssured.given();
		reqSpce.baseUri("https://reqres.in");
		reqSpce.basePath("/api/users");
		reqSpce.headers("Content-Type", "application/json");
		reqSpce.body(payload);

	}

	@Test
	public void GETMethodCall() {

		Response response = reqSpce.get().then().assertThat().statusCode(200).log().all().extract().response();
//			reqSpce.given().queryParam("page", "2").header("Content-Type", "application/json").when().get().then().log().all().assertThat().statusCode(200)
//			.assertThat().header("connection", "keep-alive").assertThat().body("page", equalTo(2));
		System.out.println("**************************************************************************");
		System.out.println("\n  response.getBody().jsonPath().getString(\"data\")     =  "
				+ response.getBody().jsonPath().getString("data"));
		System.out.println("\n  response.getBody().jsonPath().getString(\"data[0]\")     =  "
				+ response.getBody().jsonPath().getString("data[0]"));
		System.out.println("\n  response.getBody().jsonPath().getString(\"data[0].email\")     =  "
				+ response.getBody().jsonPath().getString("data[0].email"));
		System.out.println("\n  response.getBody().jsonPath().getString(\"data[2].email\")     =  "
				+ response.getBody().jsonPath().getString("data[2].email"));
		System.out.println("\n  response.getBody().jsonPath().getString(\"data[3].first_name\")     =  "
				+ response.getBody().jsonPath().getString("data[3].first_name"));
		System.out.println("\n  response.getBody().jsonPath().getString(\"support\")     =  "
				+ response.getBody().jsonPath().getString("support"));
		System.out.println("\n  response.getBody().jsonPath().getString(\"support.url\")     =  "
				+ response.getBody().jsonPath().getString("support.url"));
		System.out.println("\n  response.getBody().jsonPath().getString(\"support.text\")     =  "
				+ response.getBody().jsonPath().getString("support.text"));
		System.out.println("\n**************************************************************************");
		response.getBody().jsonPath().getString("total_pages");

	}

	/**
	 * Response from "https://reqres.in"
	 */

	/*
	 * { "page": 1, "per_page": 6, "total": 12, "total_pages": 2, "data": [ { "id":
	 * 1, "email": "george.bluth@reqres.in", "first_name": "George", "last_name":
	 * "Bluth", "avatar": "https://reqres.in/img/faces/1-image.jpg" }, { "id": 2,
	 * "email": "janet.weaver@reqres.in", "first_name": "Janet", "last_name":
	 * "Weaver", "avatar": "https://reqres.in/img/faces/2-image.jpg" }, { "id": 3,
	 * "email": "emma.wong@reqres.in", "first_name": "Emma", "last_name": "Wong",
	 * "avatar": "https://reqres.in/img/faces/3-image.jpg" }, { "id": 4, "email":
	 * "eve.holt@reqres.in", "first_name": "Eve", "last_name": "Holt", "avatar":
	 * "https://reqres.in/img/faces/4-image.jpg" }, { "id": 5, "email":
	 * "charles.morris@reqres.in", "first_name": "Charles", "last_name": "Morris",
	 * "avatar": "https://reqres.in/img/faces/5-image.jpg" }, { "id": 6, "email":
	 * "tracey.ramos@reqres.in", "first_name": "Tracey", "last_name": "Ramos",
	 * "avatar": "https://reqres.in/img/faces/6-image.jpg" } ], "support": { "url":
	 * "https://reqres.in/#support-heading", "text":
	 * "To keep ReqRes free, contributions towards server costs are appreciated!" }
	 * }
	 **************************************************************************
	 * 
	 * response.getBody().jsonPath().getString("data") = [[id:1,
	 * email:george.bluth@reqres.in, first_name:George, last_name:Bluth,
	 * avatar:https://reqres.in/img/faces/1-image.jpg], [id:2,
	 * email:janet.weaver@reqres.in, first_name:Janet, last_name:Weaver,
	 * avatar:https://reqres.in/img/faces/2-image.jpg], [id:3,
	 * email:emma.wong@reqres.in, first_name:Emma, last_name:Wong,
	 * avatar:https://reqres.in/img/faces/3-image.jpg], [id:4,
	 * email:eve.holt@reqres.in, first_name:Eve, last_name:Holt,
	 * avatar:https://reqres.in/img/faces/4-image.jpg], [id:5,
	 * email:charles.morris@reqres.in, first_name:Charles, last_name:Morris,
	 * avatar:https://reqres.in/img/faces/5-image.jpg], [id:6,
	 * email:tracey.ramos@reqres.in, first_name:Tracey, last_name:Ramos,
	 * avatar:https://reqres.in/img/faces/6-image.jpg]]
	 * 
	 * response.getBody().jsonPath().getString("data[0]") = [id:1,
	 * email:george.bluth@reqres.in, first_name:George, last_name:Bluth,
	 * avatar:https://reqres.in/img/faces/1-image.jpg]
	 * 
	 * response.getBody().jsonPath().getString("data[0].email") =
	 * george.bluth@reqres.in
	 * 
	 * response.getBody().jsonPath().getString("data[2].email") =
	 * emma.wong@reqres.in
	 * 
	 * response.getBody().jsonPath().getString("data[3].first_name") = Eve
	 * 
	 * response.getBody().jsonPath().getString("support") =
	 * [url:https://reqres.in/#support-heading, text:To keep ReqRes free,
	 * contributions towards server costs are appreciated!]
	 * 
	 * response.getBody().jsonPath().getString("support.url") =
	 * https://reqres.in/#support-heading
	 * 
	 * response.getBody().jsonPath().getString("support.text") = To keep ReqRes
	 * free, contributions towards server costs are appreciated!
	 * 
	 **************************************************************************/

}
