package CrudOpperationWithBDDApproach;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class AddProjectWithOutBody {
   @Test
	public void addProjectWithOutBody() {
		  
			//actions
			when()
			.post("http://rmgtestingserver:8084/addProject")
	         
	       .then()
	       .statusCode(201)
	       .log().all();

	}
}
//NoSuchMethodError