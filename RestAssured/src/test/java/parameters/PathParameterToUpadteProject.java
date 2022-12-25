package parameters;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PathParameterToUpadteProject {
	@Test
public void pathTest() {
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "adarsh8.805");
		jobj.put("projectName", "amazon8.805"); 
		jobj.put("status", "created");
		jobj.put("teamSize", 64);
		
		
		baseURI="http://rmgtestingserver";
		port=8084;
		given().pathParam("pid", "TY_PROJ_5566")
		.body(jobj)
		
		.contentType(ContentType.JSON)
		.when().put("/projects/{pid}")
		.then().assertThat().statusCode(200).log().all();
	}


}
