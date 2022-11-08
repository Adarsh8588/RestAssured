package CrudOpperationWithoutBDDApproach;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProjectWithOutBody {
	public void addWithOutBodyProject() {
		RequestSpecification reqspec = RestAssured.given();
	
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
