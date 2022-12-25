package Deserilization;

import java.io.File;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassforparsing.employedetails;

public class deserilizationOfEmployeeDetails {
	@Test
	
	public void deserializeEmpDetails() throws JsonParseException, JsonMappingException, Throwable {
		//step1:-create the object for object mapper
		ObjectMapper objm=new ObjectMapper();
		//step2:-write the value to json file
	employedetails	value=objm.readValue(new File("./emplyoeeDetail.json"), employedetails.class);
	value.getEname();
	System.out.println(	value.getEname());
	}
}
