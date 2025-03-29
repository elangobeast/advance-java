package zoho;

import java.sql.*;

public class emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//!=> load or register Driver
		
		try {
			//1st step=> load or register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2nd step=> Establish Connection
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			
			//3rd step.=> create staTement
			Statement s = c.createStatement();
			
			//4th step => execute query
			s.executeUpdate("INSERT INTO emp VALUES(102,'Aarov','back end',70000)");
			
			System.out.println("Data Saved");
			
			
			System.out.println("connection established");
		} catch (ClassNotFoundException| SQLException e) {
			e.printStackTrace();
		}
		

	}

}
