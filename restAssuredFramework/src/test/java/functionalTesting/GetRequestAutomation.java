package functionalTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;

import io.restassured.matcher.RestAssuredMatchers;

public class GetRequestAutomation {

	@Test
	public void getRequestAutomation()
	{
	
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
		
		RestAssured.given().param("page", "2")
		.when()
		.get()
		.then()
		.assertThat()
		.log().all()
		.statusCode(200);
	}
	
}
