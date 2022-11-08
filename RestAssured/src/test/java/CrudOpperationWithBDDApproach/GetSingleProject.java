package CrudOpperationWithBDDApproach;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetSingleProject {
@Test
	public void getproject() {
	    
	   given()
		
	  .contentType(ContentType.JSON)
			//actions
	     	.when()
			.get("http://rmgtestingserver:8084/projects/TY_PROJ_4457")
	         //validation
	       .then()
	       .statusCode(200)
	       .log().all();

	
	}
}
