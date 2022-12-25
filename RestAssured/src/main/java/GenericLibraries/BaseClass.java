package GenericLibraries;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {

	
	public DataBaseLibrary dLib = new DataBaseLibrary();
	public javaUtility javaUtil = new javaUtility();
	public RestAssuredLibrary rlib = new RestAssuredLibrary();

	@BeforeSuite
	public void bsConfig() throws Throwable {
		
		dLib.connectionToDB();
		baseURI = "http://rmgtestingserver";
		port = 8084;

	}

	@AfterSuite
	public void asConfig() throws Throwable {
		dLib.close();
	}

}
