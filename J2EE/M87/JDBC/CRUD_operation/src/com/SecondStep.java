package com;

import java.sql.*;

public class SecondStep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//!=> load or register Driver
		
		try {
			//1st step=> load or register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2nd step=> Establish Connection
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
			
			//3rd step.=> create staTement
			Statement s = c.createStatement();
			
			//4th step => execute query
			s.executeUpdate("INSERT INTO movie VALUES(2,'Leo','Tamil','Vijay','TRISHA','L K ',10)");
			
			System.out.println("Data Saved");
			
			
			System.out.println("connection established");
		} catch (ClassNotFoundException| SQLException e) {
			e.printStackTrace();
		}
		

	}

}
