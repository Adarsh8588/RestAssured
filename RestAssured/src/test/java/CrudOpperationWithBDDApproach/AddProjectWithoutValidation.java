package CrudOpperationWithBDDApproach;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddProjectWithoutValidation {
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
		//actions
		.when()
		.post("http://rmgtestingserver:8084/addProject");
         
	}
}
//passed
