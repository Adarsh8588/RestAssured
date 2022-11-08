package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassforparsing.employedetails;

public class serializationOfEmployeDetailsYTest{
	//step:- declare all the variable
	@Test
	
	public   void employeeDetails() throws Throwable, JsonMappingException, IOException{
		//step1:-create object for the pojo class
		employedetails empd = new employedetails("adarsh", "ase", 345678, "sery", "fgh", "svf");
		//step2:-create the object for object mapper
	ObjectMapper objm=new ObjectMapper();
	//step3:-write the value  to json file
	
	objm.writeValue(new File("emplyoeeDetail.json") , empd);
		
	}
	
}