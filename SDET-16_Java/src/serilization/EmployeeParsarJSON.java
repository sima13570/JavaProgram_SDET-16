package serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.codehaus.jackson.map.ObjectMapper;

public class EmployeeParsarJSON {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Employee emp = new Employee("Bhanu", 10, 15000, 'M');
		
		FileOutputStream file = new FileOutputStream("./emp.json");
		
		ObjectMapper objOut = new ObjectMapper();//parsing 
		
		/**
		 * Same program done in practice project
		 * 
		 * jackson mapper version not working properly in this project
		 */
		
		
		
		
	}
}
