package com;

import java.sql.*;

public class FetchAll {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/audi_db", "root", "root");
			
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from audi");
			
			/*System.out.println(rs.next());
			System.out.println(rs.next());*/
			
			while(rs.next()) {
				System.out.println("Id="+rs.getInt(1));
				System.out.println("Name="+rs.getString(2));
				System.out.println("Brand="+rs.getString(3));
				System.out.println("Price="+rs.getDouble(4));
				System.out.println("Quantity="+rs.getInt(5));
				System.out.println("Rating="+rs.getDouble(6));
				System.out.println("Description="+rs.getString(7));
				System.out.println("-----------------------------");
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			
			e.printStackTrace();
		}
	}

}