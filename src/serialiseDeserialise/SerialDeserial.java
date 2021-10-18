package serialiseDeserialise;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerialDeserial {

	public static void main(String[] args) throws IOException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		EmployeeDetails e = new EmployeeDetails();

		EmployeeDetails emp = mapper.readValue(
				new File("C:\\Users\\OM SAI RAM\\workspace\\ZJavaPractise\\src\\serialiseDeserialise\\employee.json"),
				EmployeeDetails.class);
		System.out.println(emp);
		
		String json = mapper.writeValueAsString(emp);
		System.out.println(json);
	}

}
