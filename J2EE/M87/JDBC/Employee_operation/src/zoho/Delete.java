package zoho;

import java.sql.*;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//! load or register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. establish connection
			Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			
			//3. create statement
			Statement s = c.createStatement();
			
			//4.execute Query
			s.executeUpdate("DELETE FROM emp WHERE emp_id = 102");
			System.out.println("Data Deleted");
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}

}
