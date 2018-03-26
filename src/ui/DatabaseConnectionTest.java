package ui;

import java.sql.*;

public class DatabaseConnectionTest {

	public static void main(String[] args) throws SQLException {

		try {
			
			String url = "jdbc:mysql://localhost/lendinglibrary";
			
			String uname = "admin";
			String pwd = "1234";
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url,uname,pwd);
			
			Statement stm = conn.createStatement();
			
			ResultSet rs = stm.executeQuery("select * from material");
			
			while(rs.next()){
				System.out.println(rs.getString("title"));
			}
			
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
	}

}
