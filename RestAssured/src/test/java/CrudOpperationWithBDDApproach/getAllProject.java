package CrudOpperationWithBDDApproach;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class getAllProject {
	@Test

	public void getallproject() {
		   //precondition
			given()
			  .contentType(ContentType.JSON)
					//actions
			     	.when()
					.get("http://rmgtestingserver:8084/projects")
			       
					//validation
			       .then()
			       .statusCode(200)
			       .log().all();

	}
}
