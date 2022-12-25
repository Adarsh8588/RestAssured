package parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

public class PathParameterToDeletProject {
	@Test
public void pathTest() {
		
		
		baseURI="http://rmgtestingserver";
		port=8084;
		given().pathParam("pid","TY_PROJ_921" )
		.when().delete("/projects/{pid}")
		.then().assertThat().statusCode(204);
}
}
