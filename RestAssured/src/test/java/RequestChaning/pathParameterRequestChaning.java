package RequestChaning;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

import GenericLibraries.javaUtility;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojoclassforparsing.postTheReqChaning;

public class pathParameterRequestChaning{
	@Test
	
	public void pathpara() {
		javaUtility ran = new javaUtility();
		postTheReqChaning chin = new postTheReqChaning("adarsh", "amazon"+ran.randomnum(), "done", 67);
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		RequestSpecification req = RestAssured.given();
		req.body(chin).contentType(ContentType.JSON);
		Response resp = req.post("/addProject");
		
		
		String proId = resp.jsonPath().get("projectId");
		
		resp.then().assertThat().statusCode(201).log().all();
		given().pathParam("projectId", proId)
		.when().get("/projects/{projectId}")
		.then().assertThat().statusCode(200).log().all();
	}
}