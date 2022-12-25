package parameters;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class formParameter {
	@Test
	
	public void formDataTest() {
		baseURI="http://rmgtestingserver"; //it will not work in rmgServer
		port=8084;
		
		given()
		.formParam("CreatedBy","Adarsh")
		.formParam("ProjectName","amazon")
		.formParam("status","done")
		.formParam("teamSize","34")
		.contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).log().all();
		
	}

}
