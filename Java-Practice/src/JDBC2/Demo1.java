package JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//JDBC - Java Database Connectivity
		
		//Step1: Import the package
		//Step2: Load and Register the Driver
		//Step3: Create Connection
		//Step4: Create Statement
		//Step5: Execute the query
		//Step6: Process the result
		//Step7: Close the connection
		
		//System Requirements
		//MySQL Database
		//XAMPP Server
		
		//Activate the Server
		//Xampp Control Panel --> MySql --> Start Server
		//Go to PHPMYADMIN panel --> Create Database --> Create Table --> Insert Records
		
		String url = "jdbc:mysql://localhost:3306/db1?serverTimeZone=UTC";
		String user = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url,user,password);
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("Select name from students where studentID = 2");
			
			rs.next();
			System.out.println(rs.getString("name"));
			
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
