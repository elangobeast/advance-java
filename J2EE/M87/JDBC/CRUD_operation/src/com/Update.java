package com;

import java.sql.*;

public class Update {

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
			s.executeUpdate("UPDATE movie SET language='english',collection = 200 WHERE mid = 1");
			System.out.println("Data Updated");
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}

}
