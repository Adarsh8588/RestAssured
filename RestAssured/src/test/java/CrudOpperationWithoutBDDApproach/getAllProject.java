package CrudOpperationWithoutBDDApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class getAllProject {
@Test
public void getallproject() {
	RequestSpecification reqspec = RestAssured.given();
	
	Response response = reqspec.get("http://rmgtestingserver:8084/projects");

	 //vcalidation
	response.getContentType();
	ValidatableResponse valresponse = response.then();
	valresponse.assertThat().contentType(ContentType.JSON);
	valresponse.assertThat().statusCode(200);
	valresponse.log().all();

}

}
