package CrudOpperationWithoutBDDApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class DeleteProject
{
	@Test
	public void deletproject()
	{
	RequestSpecification reqspec = RestAssured.given();
	
	Response response = reqspec.delete("http://rmgtestingserver:8084/projects/TY_PROJ_988");
	
	response.getContentType();
	ValidatableResponse valresponse = response.then();
	valresponse.assertThat().contentType(ContentType.JSON);
	valresponse.assertThat().statusCode(204);
	valresponse.log().all();
}
}
