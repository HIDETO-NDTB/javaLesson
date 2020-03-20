package JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/db1?serverTimeZone=UTC";
		String user = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url,user,password);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter ID: ");
  		    int id = sc.nextInt();
			
			System.out.println("Enter Name: ");
			String name = sc.next();
			
			System.out.println("Enter Department: ");
			String dept = sc.next();
			
			PreparedStatement stmt = conn.prepareCall("Insert into student values(?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, dept);
			
			int count = stmt.executeUpdate();
			
			if(count == 1) {
				System.out.println("Data Inserted Successfully");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
