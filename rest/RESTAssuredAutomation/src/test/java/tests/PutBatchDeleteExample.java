package tests;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutBatchDeleteExample {
	
	@Test
	public void testPut() { 
		
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Kishor");
		request.put("job", "Teacher");
		
		System.out.println(request.toJSONString());
		
		baseURI="https://reqres.in/api";
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("/users/2").
		then().
			statusCode(200)
			.log().all();
			
		
		
	
	}
	
	@Test
	public void testPatch() {
		
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Kishor");
		request.put("job", "Teacher");
		
		System.out.println(request.toJSONString());
		
		baseURI="https://reqres.in";
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(ContentType.JSON).
			body(request.toJSONString()).
		when().
			patch("/api/users/2").
		then().
			statusCode(200)
			.log().all();
			
		
		
	
	}
	
	
	@Test
	public void testDelete() {
		
		baseURI="https://reqres.in";
		
		when().
			delete("/api/users/2").
		then().
			statusCode(204)
			.log().all();
			
		
		
	
	}

}
