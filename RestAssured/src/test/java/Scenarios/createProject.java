package Scenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoclassforparsing.postTheReqChaning;

public class createProject extends BaseClass {
	@Test
	public void createProjectTest() throws Throwable {
		postTheReqChaning reqD= new postTheReqChaning("vinod", "E-commerce", "On going", 10);
		Response resp= given()
				.body(reqD)
				.contentType(ContentType.JSON)
				.when().post();
		String expData=rlib.getJsonData(resp, "projectId");
		System.out.println(expData);
		String query="select* from project;";
		String actData=dLib.readDataFromDBAndValidate(query, 1, expData);
		Assert.assertEquals(actData,expData);
		System.out.println("TC Pass");
		resp.then().log().all();
		
		
		
	}
	
	
}