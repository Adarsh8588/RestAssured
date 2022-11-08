package CrudOpperationWithBDDApproach;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class GetSingleProjectWithOutAction {
	@Test
	public void getproject() {
	    
		  
				//actions
		     	when()
				.get("http://rmgtestingserver:8084/projects/TY_PROJ_4457")
		         //validation
		       .then()
		       .statusCode(200)
		       .log().all();
	}
}
//passed