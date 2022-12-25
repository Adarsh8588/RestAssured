package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassforparsing.empdetailswithobject;

public class SerializationOfEmpDetailsWithObject {
	@Test
	
	public   void employeeDetailswithObj() throws JsonGenerationException, JsonMappingException, IOException {
		int [] phoneNo= {1234,98756};
		String[] mailId= {"adhi@gmail", "abhi@gmail"};
		
		empdetailswithobject empp = new empdetailswithobject("adhi", "tys09", mailId,phoneNo, 78);
		ObjectMapper objm=new ObjectMapper();
		
		
		objm.writeValue(new File("employeeDetailswithObj.json") , empp);

	}

}
