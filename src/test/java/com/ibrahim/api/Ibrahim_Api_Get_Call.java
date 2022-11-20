package com.ibrahim.api;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.osa.format.FormatOsa;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Ibrahim_Api_Get_Call {
	

	public static void main(String[] args) {
		 getCall();
		//getCallZippotam();
	}
//@Test(/*enabled = false*/)
	public static void getCall() {
		
		
		RestAssured.baseURI = "https://osasapi.herokuapp.com";
		//Response response = given().log().all().when().get("customers/60c90eee157e3b0017125366").then().statusCode(200).log().all().extract().response(); //60c90eee157e3b0017125366
		RequestSpecification request= RestAssured.given();
		Response response=request.get("customers/60c90eee157e3b0017125366").then().statusCode(200).log().all().extract().response();
		System.out.println("  response.path(\"userId\")   =    " + response.path("userId"));
		System.out.println("  response.path(\"firstName\")   =    " + response.path("firstName"));
		System.out.println("  response.path(\"lastName\")   =    " + response.path("lastName"));
		System.out.println("  response.path(\"email\")   =    " + response.path("email"));
		System.out.println("  response.path(\"phone\")   =    " + response.path("phone"));
		System.out.println("\n response.contentType()   =  " + response.contentType());
		System.out.println(" response.cookie(\"\")   =  " + response.cookie(""));
		System.out.println(" response.getTime()   =  " + response.getTime());
		
		System.out.println("\n response.getBody().asString()   =  " + response.getBody().asString());
		System.out.println(" response.asString()   =  " + response.asString());
		System.out.println(" response.getSessionId()   =  " + response.getSessionId());
		System.out.println("\n response.getStatusCode()   =  " + response.getStatusCode());
		System.out.println("\n response.getStatusLine()   =  " + response.getStatusLine());
		System.out.println("\n response.prettyPrint()   =  " + response.prettyPrint());
		System.out.println("\n response.andReturn().asString()   =  " + response.andReturn().asString());
		
		System.out.println("\n response.getHeaders()   = \n  " + response.getHeaders());
		
		
		
		Assert.assertEquals("mahfuz", response.path("firstName"));
	//	Response response1 = given().log().all().when().get("customers").then().statusCode(200).log().all().extract().response();
		
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
		System.out.println("  response.path(\"places[3].state\")   =  " + response.path("places[3].state"));
		
		
	}
	
	/**
	 * 
	 *console result after the response getCallZippotam()
	 */
	
	 
	/*{
    "post code": "24848",
    "country": "Germany",
    "country abbreviation": "DE",
    "places": [
        {
            "place name": "Alt Bennebek",
            "longitude": "9.4333",
            "state": "Schleswig-Holstein",
            "state abbreviation": "SH",
            "latitude": "54.3833"
        },
        {
            "place name": "Klein Rheide",
            "longitude": "9.4833",
            "state": "Schleswig-Holstein",
            "state abbreviation": "SH",
            "latitude": "54.45"
        },
        {
            "place name": "Kropp",
            "longitude": "9.5087",
            "state": "Schleswig-Holstein",
            "state abbreviation": "SH",
            "latitude": "54.4111"
        },
        {
            "place name": "Klein Bennebek",
            "longitude": "9.45",
            "state": "Schleswig-Holstein",
            "state abbreviation": "SH",
            "latitude": "54.4"
        }
    ]
}
 response.contentType()   =  application/json
 response.path("'post code'")   =  24848
  response.path("country")   =  Germany
  response.path("'country abbreviation'")   =  DE
 response.path("places")   =  [{latitude=54.3833, state=Schleswig-Holstein, state abbreviation=SH, place name=Alt Bennebek, longitude=9.4333}, {latitude=54.45, state=Schleswig-Holstein, state abbreviation=SH, place name=Klein Rheide, longitude=9.4833}, {latitude=54.4111, state=Schleswig-Holstein, state abbreviation=SH, place name=Kropp, longitude=9.5087}, {latitude=54.4, state=Schleswig-Holstein, state abbreviation=SH, place name=Klein Bennebek, longitude=9.45}]
 response.getBody().jsonPath().getString("places")   = [[latitude:54.3833, state:Schleswig-Holstein, state abbreviation:SH, place name:Alt Bennebek, longitude:9.4333], [latitude:54.45, state:Schleswig-Holstein, state abbreviation:SH, place name:Klein Rheide, longitude:9.4833], [latitude:54.4111, state:Schleswig-Holstein, state abbreviation:SH, place name:Kropp, longitude:9.5087], [latitude:54.4, state:Schleswig-Holstein, state abbreviation:SH, place name:Klein Bennebek, longitude:9.45]]
 response.path("places.'place name'")   =  [Alt Bennebek, Klein Rheide, Kropp, Klein Bennebek]
 response.getBody().jsonPath().getString("places.'place name'")   = [Alt Bennebek, Klein Rheide, Kropp, Klein Bennebek]
 response.path("places[0]")   =  {latitude=54.3833, state=Schleswig-Holstein, state abbreviation=SH, place name=Alt Bennebek, longitude=9.4333}
  response.path("places[0].'place name'")   =  Alt Bennebek
  response.path("places[0].longitude")   =  9.4333
  response.path("places[0].state")   =  Schleswig-Holstein
  response.path("places[0].'state abbreviation'")   =  SH
  response.path("places[3].state")   =  Schleswig-Holstein*/
	
	
	
	
	
	
	/**
	 * This is the response from getCall() with 60c90eee157e3b0017125366 id
	 */
	
	
	/*
HTTP/1.1 200 OK
Server: Cowboy
Connection: keep-alive
X-Powered-By: Express
Access-Control-Allow-Origin: *
Access-Control-Allow-Credentials: true
Content-Type: application/json; charset=utf-8
Content-Length: 123
Etag: W/"7b-jf9AfGvrPuLtgP5sxtuAYlNk2bo"
Date: Sun, 20 Nov 2022 21:17:44 GMT
Via: 1.1 vegur

{
    "userId": "60c90eee157e3b0017125366",
    "firstName": "mahfuz",
    "lastName": "ahmed",
    "email": "mahfuz@gmail.com",
    "phone": "06152021"
}
  response.path("userId")   =    60c90eee157e3b0017125366
  response.path("firstName")   =    mahfuz
  response.path("lastName")   =    ahmed
  response.path("email")   =    mahfuz@gmail.com
  response.path("phone")   =    06152021

 response.contentType()   =  application/json; charset=utf-8
 response.cookie("")   =  null
 response.getTime()   =  1090

 response.getBody().asString()   =  {"userId":"60c90eee157e3b0017125366","firstName":"mahfuz","lastName":"ahmed","email":"mahfuz@gmail.com","phone":"06152021"}
 response.asString()   =  {"userId":"60c90eee157e3b0017125366","firstName":"mahfuz","lastName":"ahmed","email":"mahfuz@gmail.com","phone":"06152021"}
 response.getSessionId()   =  null

 response.getStatusCode()   =  200

 response.getStatusLine()   =  HTTP/1.1 200 OK
{
    "userId": "60c90eee157e3b0017125366",
    "firstName": "mahfuz",
    "lastName": "ahmed",
    "email": "mahfuz@gmail.com",
    "phone": "06152021"
}

 response.prettyPrint()   =  {
    "userId": "60c90eee157e3b0017125366",
    "firstName": "mahfuz",
    "lastName": "ahmed",
    "email": "mahfuz@gmail.com",
    "phone": "06152021"
}

 response.andReturn().asString()   =  {
    "userId": "60c90eee157e3b0017125366",
    "firstName": "mahfuz",
    "lastName": "ahmed",
    "email": "mahfuz@gmail.com",
    "phone": "06152021"
}

 response.getHeaders()   = 
  Server=Cowboy
Connection=keep-alive
X-Powered-By=Express
Access-Control-Allow-Origin=*
Access-Control-Allow-Credentials=true
Content-Type=application/json; charset=utf-8
Content-Length=123
Etag=W/"7b-jf9AfGvrPuLtgP5sxtuAYlNk2bo"
Date=Sun, 20 Nov 2022 21:17:44 GMT
Via=1.1 vegur*/
	
	

}
