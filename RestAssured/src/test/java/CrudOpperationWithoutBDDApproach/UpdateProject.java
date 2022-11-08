package CrudOpperationWithoutBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	@Test
	
	public void updaterProject() {
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "akash13898");
		jobj.put("projectName", "flipkart13898");
		jobj.put("status", "pending");
		jobj.put("teamSize", 94);
		
		//precondition
		RequestSpecification reqspec = RestAssured.given();
		reqspec.body(jobj);
		reqspec.contentType(ContentType.JSON);
		//actions
		Response response = reqspec.put("http://rmgtestingserver:8084/Projects/TY_PROJ_3885");
		//validation
		response.getContentType();
		ValidatableResponse valresponse = response.then();
		valresponse.assertThat().contentType(ContentType.JSON);
		valresponse.assertThat().statusCode(200);
		valresponse.log().all();
	}

}
