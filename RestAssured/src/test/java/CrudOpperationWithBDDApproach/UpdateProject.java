package CrudOpperationWithBDDApproach;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateProject {

		@Test
		
		public void updaterProject() {
			JSONObject jobj=new JSONObject();
			jobj.put("createdBy", "andy96.987");
			jobj.put("projectName", "swigge96.987");
			jobj.put("status", "pending");
			jobj.put("teamSize", 45);
			//precondition
		    given()
			.body(jobj)
		     
		    .contentType(ContentType.JSON)
			//actions
			.when()
			.put("http://rmgtestingserver:8084/projects/TY_PROJ_4457")
	         
	       .then().statusCode(200).log().all();
		
		}	
}
