package DifferentWaysToPostRequest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class hashmap{
	@Test
	public void hashMap() {
   
		HashMap map= new HashMap();
		Random r = new Random();
		    
		map.put("createdBy","adarsh");
	   map.put("projectName","amazon"+r.nextInt());
		map.put("status", "created");
		map.put("teamSize", 20);
		
		  given()
			
			.body(map)
		     
		    .contentType(ContentType.JSON)
			//actions
			.when()
			.post("http://rmgtestingserver:8084/addProject")
	         
	       .then()
	       .statusCode(201)
	       .log().all();

		
	}
	
}