package CrudOpperationWithoutBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProjectTest {
	@Test
	public void addProjectTest() {
		//as we are using post http method ---->creating the body
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "adarsh138");
		jobj.put("projectName", "amazon138");
		jobj.put("status", "created");
		jobj.put("teamSize", 34);
		
		//precondition
		RequestSpecification reqspec = RestAssured.given();
		reqspec.body(jobj);
		reqspec.contentType(ContentType.JSON);
		//actions
		Response response = reqspec.post("http://rmgtestingserver:8084/addProject");
		//validation
		response.getContentType();
		ValidatableResponse valresponse = response.then();
		valresponse.assertThat().contentType(ContentType.JSON);
		valresponse.assertThat().statusCode(201);
		valresponse.log().all();//log.all method is used to print all the contant
	}
}

