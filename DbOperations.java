package techies.minor.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbOperations {
	
		public static void loadDriver(String driver) {
			try {
				Class.forName(driver);
				System.out.println("Driver Created Successfully");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
				System.out.println("Driver not found");
			}
		}

//		Step-2 Establish Connection
		
		public static Connection openConnection(String url , String user , String password) {
			Connection connection=null;
			try {
				DriverManager.getConnection(url, user, password);
				System.out.println("Connection establish successfully");
			} catch (SQLException e) {
				
				e.printStackTrace();
				System.out.println("Error in making connection");
			}
			
			return connection;
		}
		
}
