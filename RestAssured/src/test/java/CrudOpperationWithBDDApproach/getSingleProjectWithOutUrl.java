package CrudOpperationWithBDDApproach;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class getSingleProjectWithOutUrl {
	@Test
	
	public void getproject() {
	    
		   given()
			
		  .contentType(ContentType.JSON)
				
		     
		         //validation
		       .then()
		       .statusCode(200)
		       .log().all();
	}
	

}
//falied no such method error