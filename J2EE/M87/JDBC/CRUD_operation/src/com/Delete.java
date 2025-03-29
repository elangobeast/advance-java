package com;

import java.sql.*;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//! load or register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. establish connection
			Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
			
			//3. create statement
			Statement s = c.createStatement();
			
			//4.execute Query
			s.executeUpdate("DELETE FROM movie WHERE mid = 2");
			System.out.println("Data Deleted");
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}

}
