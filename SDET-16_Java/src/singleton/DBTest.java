package singleton;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBTest {
	
	public static void main(String[] args) throws SQLException {
		
		//step 1: register the data base
		DriverManager.registerDriver(new Driver()); //Driver Mangger is a singleton
		
		//step 2 : connect to database
		DriverManager.getConnection("url","username","pwd");
		
		//step 3: write db query 
		
		//step 4 : execute query
		
		//step 4 : close connection
		
	}
}
