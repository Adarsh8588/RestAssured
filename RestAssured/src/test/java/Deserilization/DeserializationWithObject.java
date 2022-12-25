package Deserilization;




import java.io.File;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassforparsing.empdetailswithobject;

public class DeserializationWithObject{
	 @Test
	public void DeserializationWithObjectTest() throws JsonParseException, JsonMappingException, Throwable {
		 ObjectMapper objm2 = new ObjectMapper();
		empdetailswithobject value1 = objm2.readValue(new File("employeeDetailswithObj.json"),empdetailswithobject.class );
		value1.getEname();
		value1.getEid();
		System.out.println(value1.getEname());
		System.out.println(value1.getEid());
	}
}