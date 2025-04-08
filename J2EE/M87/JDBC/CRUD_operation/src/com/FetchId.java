package com;

import java.sql.*;

public class FetchId {
	


	public static void main(String[] args) {
		
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/audi_db", "root", "root");
			
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select id from audi");
			
			while(rs.next()) {
				System.out.println("Enter id:"+rs.getInt(1));
				
				
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}