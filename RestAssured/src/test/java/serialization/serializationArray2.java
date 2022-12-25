package serialization;

import java.io.File;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassforparsing.empdetailwitharray2;

public class serializationArray2 {
	@Test
	
	public void employeeDetails() throws JsonGenerationException, JsonMappingException, Throwable {
		empdetailwitharray2 emp = new empdetailwitharray2("ggjs", "xjhjb", "bkjsbx", 1233);
		
		ObjectMapper objm=new ObjectMapper();
		
		objm.writeValue(new File("empdetailwitharray2.jason"), emp);
	}
	}