package com;

import java.sql.*;

public class First_step {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			java.sql.Driver d = new com.mysql.cj.jdbc.Driver ();
			
			DriverManager.registerDriver(d);
			
			System.out.println("Done!!!!!!!!!!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
 
	}

}
