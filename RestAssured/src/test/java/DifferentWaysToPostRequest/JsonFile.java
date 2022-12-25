package DifferentWaysToPostRequest;

import java.io.File;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class JsonFile {
	@Test
	public void jsonFileTest() {
		String path="C:\\Users\\Smile\\git\\rest\\RestAssured\\src\\test\\java\\DifferentWaysToPostRequest\\JsonObject.java";
		
	
	File fl = new File(path);
	//step 1:precondition
			given()
			.body(fl)
			.contentType(ContentType.JSON)
			//step 2: actions or executions
			.post("http://rmgtestingserver:8084/addProject")
			
			//step3: validation
			.then()
			.statusCode(201)
			.log().all();

	}
}


