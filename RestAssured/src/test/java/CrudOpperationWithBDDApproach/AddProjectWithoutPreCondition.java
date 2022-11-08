package CrudOpperationWithBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class AddProjectWithoutPreCondition {
	@Test
	public void  WithoutPreCondition() {
		
	JSONObject jobj=new JSONObject();
		
		jobj.put("createdBy", "adarsh82.835");
		jobj.put("projectName", "amazon82.835");
		jobj.put("status", "created");
		jobj.put("teamSize", 64);

		//actions
		when()
		.post("http://rmgtestingserver:8084/addProject")
         
       .then()
       .statusCode(201)
       .log().all();
	
	}
	

}
//no such method error