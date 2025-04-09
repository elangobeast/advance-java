package com;
import java.util.*;
import java.sql.*;

public class Insert {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Id1 :");
		int id=s.nextInt();
		System.out.println("Enter Name2:");
		String name=s.next();
		System.out.println("Enter brand3:");
		String brand=s.next();
		System.out.println("Enter price4:");
		double price=s.nextDouble();
		System.out.println("Enter quantity5:");
		int quantity=s.nextInt();
		System.out.println("Enter rating6:");
		double rating=s.nextDouble();
		System.out.println("Enter description7 :");
	    String descrption=s.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/audi_db","root","root");
			
			PreparedStatement ps=c.prepareStatement("insert into audi values(?,?,?,?,?,?,?)");
			
			ps.setInt(1, id);
			ps.setDouble(4,price);
			ps.setString(2,name);
			ps.setString(3,brand);
			ps.setInt(5,quantity);
			ps.setDouble(6,rating);
			ps.setString(7,description);
			
			ps.executeUpdate();
			
			System.out.println("Data Saved");
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}