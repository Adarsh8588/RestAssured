package CrudOpperationWithBDDApproach;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class deleteProject {
	@Test

	public void deleteproject() {
		
		when()
		.delete("http://rmgtestingserver:8084/projects/TY_PROJ_4226")
         .then()
         .assertThat()
         .log().all();

	}
}
