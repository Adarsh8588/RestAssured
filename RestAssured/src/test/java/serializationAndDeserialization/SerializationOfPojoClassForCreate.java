package serializationAndDeserialization;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import DiffWaysToPostReq.PojoClassForCreate;
import io.restassured.http.ContentType;

public class SerializationOfPojoClassForCreate {
	@Test
	public void PojoClassForCreate() throws JsonGenerationException, JsonMappingException, Throwable {
		PojoClassForCreate pc=new PojoClassForCreate("adarsh", "amazon", "pending", 56);
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./PojoClassForCreate.json"), pc);
		
		given()
		.body(pc)
		.contentType(ContentType.JSON);
		
		when()
		.post("http://rmgtestingserver:8084/addProject")
		
		.then()
		.assertThat().time(org.hamcrest.Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		.statusCode(201)
		.log().all();
		
	}

}
