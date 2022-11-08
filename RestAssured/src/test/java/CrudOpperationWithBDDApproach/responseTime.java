package CrudOpperationWithBDDApproach;
import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class responseTime {
	@Test
	public void responsetime() {
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "adarsh271.83");
		jobj.put("projectName", "amazon271.83");
		jobj.put("status", "created");
		jobj.put("teamSize", 34);
// precondition
	    given()
	
		.body(jobj)
	     
	    .contentType(ContentType.JSON)
		//actions
		.when()
		.post("http://rmgtestingserver:8084/addProject")
         
       .then()
       .assertThat().time(org.hamcrest.Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
       .log().all();
    
		
		
	}

}
