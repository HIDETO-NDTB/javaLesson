package JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/db1?serverTimeZone=UTC";
		String user = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url,user,password);
			
            Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter ID to fetch data: ");
  		    int id = sc.nextInt();
  		    
  		    PreparedStatement stmt = conn.prepareStatement("Select * from student where id = ?");
  		    stmt.setInt(1,  id);
  		    
  		    ResultSet rs = stmt.executeQuery();
  		    while(rs.next()) {
  		    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
  		    }
  		    
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
