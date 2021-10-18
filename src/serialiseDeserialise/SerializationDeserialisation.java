package serialiseDeserialise;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationDeserialisation {

	public static void main(String[] args) throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		Employee e = new Employee();
		
		e.setAge(10);
		e.setName("abc");
		
		String empjson = mapper.writeValueAsString(e);
		System.out.println(empjson);
		
		Employee emp = mapper.readValue(new File("C:\\Users\\OM SAI RAM\\workspace\\ZJavaPractise\\src\\serialiseDeserialise\\emp.json"),Employee.class);
		
		System.out.println(emp);

	}

}
