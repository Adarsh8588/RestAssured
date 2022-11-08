package CrudOpperationWithBDDApproach;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetAllProjectWithoutAction {
	@Test
	public void getallproject() {
		   //precondition
			given()
			  .contentType(ContentType.JSON)
					
			       
					//validation
			       .then()
			       .statusCode(200)
			       .log().all();
	}

}
//no such method error