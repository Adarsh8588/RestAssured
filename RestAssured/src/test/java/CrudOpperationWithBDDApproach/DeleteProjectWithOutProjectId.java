package CrudOpperationWithBDDApproach;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class DeleteProjectWithOutProjectId {
	@Test
	
public void deleteprojectwithoutProjectId() {
	
		
		when()
		.delete("http://rmgtestingserver:8084/projects")
         .then()
         .assertThat()
         .log().all();

	}


}
