package parameters;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;



public class PathParameterToGetSingleProject{
	@Test
	
	
	public void pathTest() {
		
		
		baseURI="http://rmgtestingserver";
		port=8084;
		given().pathParam("pid","TY_PROJ_5566" )
		.when().get("/projects/{pid}")
		.then().assertThat().statusCode(200);
	}
}