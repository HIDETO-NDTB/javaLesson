package JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaData_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/db1?serverTimeZone=UTC";
		String user = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url,user,password);
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("Select * from student");
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int columunCount = rsmd.getColumnCount();
			
			for(int i=1;i<=columunCount;i++) {
				System.out.print(rsmd.getColumnName(i)+" ");
				System.out.print(rsmd.getColumnDisplaySize(i)+" ");
				System.out.println(rsmd.getColumnTypeName(i)+" ");
			}
			
			System.out.println();
			
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
