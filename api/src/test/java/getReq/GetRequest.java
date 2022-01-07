package getReq;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.RestAssured.*;

import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.response.Response;

public class GetRequest {
	
	
	//HTTP get request? 
	
	@Test
	public void getRequestAutomation()
	{
	
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
		
		
		Response response = RestAssured.given().param("page", "2").when().get();
		
		System.out.println(response.getBody().asPrettyString());
		
		System.out.println("status code : " + response.getStatusCode());
		
		System.out.println("Content Type :  "  + response.contentType());
		
		System.out.println("Time : "  + response.getTimeIn(TimeUnit.MILLISECONDS));
		
		System.out.println("Cookies "  + response.getCookies());
		
		System.out.println(response.prettyPrint());
		
//		RestAssured.given().param("page", "2")
//		.when()
//		.get()
//		.then()
//		.assertThat()
//		.log().all()
//		.statusCode(200);
	}
	

}
