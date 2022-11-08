package CrudOpperationWithBDDApproach;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetAllProjectWithoutValidation {
	@Test
	public void getallprojectwithoutvalidation() {
		   //precondition
			given()
			  .contentType(ContentType.JSON)
					//actions
			     	.when()
					.get("http://rmgtestingserver:8084/projects");
	}
			       
			

}
//passed:getallprojectwithoutvalidation