package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DiffWaysToPostReq.PojoClassForCreate;
import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class DataProviderr{
	@Test(dataProvider="get data")
	
	public void dataprov(String createdBy, String projectName, String status, int teamSize) {
	JavaUtility jlib = new JavaUtility();
	PojoClassForCreate cp = new PojoClassForCreate(createdBy, projectName+jlib.randomnum(),status,teamSize);
	
	given().body(cp).contentType(ContentType.JSON)
	.when().post("http://rmgtestingserver:8084/addProject")
	.then().assertThat().statusCode(201).log().all();
	}	
	@DataProvider(name="get data")
	
	public Object[][]data(){
		Object[][] data=new Object[3][4];
		data[0][0]="adarsh";
		data[0][1]="TYss";
	    data[0][2]="complete";
		data[0][3]=34;
		
		data[1][0]="abhi";
		data[1][1]="TYss01";
	    data[1][2]="complete";
		data[1][3]=67;
		
		data[2][0]="akarsh";
		data[2][1]="TYss02";
	    data[2][2]="complete";
		data[2][3]=56;
		return data;
		
		
		
	}
}