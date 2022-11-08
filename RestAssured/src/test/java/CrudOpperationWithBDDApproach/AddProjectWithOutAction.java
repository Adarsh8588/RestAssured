package CrudOpperationWithBDDApproach;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class AddProjectWithOutAction {
	@Test

	public  void addproject(){
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "adarsh82.835");
		jobj.put("projectName", "amazon82.835");
		jobj.put("status", "created");
		jobj.put("teamSize", 64);
// precondition
	    given()
	
		.body(jobj)
	     
	    .contentType(ContentType.JSON)
		
         //validation
       .then()
       .statusCode(201)
       .log().all();
	}
}
//no such method error