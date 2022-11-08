package CrudOpperationWithBDDApproach;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class getsingleprojectwithoutvalidation {
	@Test
	public void getproject() {
	    
		   given()
			
		  .contentType(ContentType.JSON)
				//actions
		     	.when()
				.get("http://rmgtestingserver:8084/projects/TY_PROJ_4457");
		         
	}
}
//passed