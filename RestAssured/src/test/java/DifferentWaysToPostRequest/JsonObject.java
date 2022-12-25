package DifferentWaysToPostRequest;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.javaUtility;
import io.restassured.http.ContentType;

public class JsonObject {
	@Test
		public  void addprojectTest(){
		javaUtility ran=new javaUtility(); //call the class name of RandomNumber from generic utility
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "adarsh82.835");
		jobj.put("projectName", "amazon82.835"+ran.randomnum()); //call  ref var . methodname
		jobj.put("status", "created");
		jobj.put("teamSize", 64);
// precondition
	    given()
	
		.body(jobj)
	     
	    .contentType(ContentType.JSON)
		//actions
		.when()
		.post("http://rmgtestingserver:8084/addProject")
         //validation
       .then()
       .statusCode(201)
       .log().all();
	}

}
