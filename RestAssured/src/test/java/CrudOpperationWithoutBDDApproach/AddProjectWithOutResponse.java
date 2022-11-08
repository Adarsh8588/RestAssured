package CrudOpperationWithoutBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class AddProjectWithOutResponse {
	@Test
	
public void addprojectwithoutresponse() {
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "adarsh138");
	jobj.put("projectName", "amazon138");
	jobj.put("status", "created");
	jobj.put("teamSize", 34);

	RequestSpecification reqspec = RestAssured.given();
	reqspec.body(jobj);
	reqspec.contentType(ContentType.JSON);
	
	
}
}
