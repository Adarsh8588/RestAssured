package parameters;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class QueryStringParameters {
	@Test
	public void queryTest() {  //sience querystring is not supproted in rmgyantra applic we go for reqres
		baseURI="https://reqres.in";
		
		given().queryParam("page", 2) 
		.when().get("/api/users")
		.then().assertThat().statusCode(200).log().all();
		
	
	}

}
