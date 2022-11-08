package serializationAndDeserialization;

import java.io.File;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import pojoclassforparsing.employeDetailsWithArray1;

public class serilizationforArray {
	@org.testng.annotations.Test
	public void employeDetailswithArray() throws JsonGenerationException, JsonMappingException, Throwable {
		//int a[]= {12345,234566};
		//employeDetailsWithArray1 empd1 = new employeDetailsWithArray1("adarsh", "asd", "2134", "24576");
   employeDetailsWithArray1 empd1 = new employeDetailsWithArray1("sdf", "asd", 56, 3456);
		
		                     
		ObjectMapper obja = new ObjectMapper();
		obja.writeValue(new File("employeDetailsWithArray1.json"), empd1);
	}

}
