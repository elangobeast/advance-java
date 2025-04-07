package com;
import java.util.*;
import java.sql.*;

public class Insert {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Id :");
		int sid=s.nextInt();
		System.out.println("Enter Name:");
		String name=s.next();
		System.out.println("Enter course:");
		String course=s.next();
		System.out.println("Enter duration:");
		int duration =s.nextInt();
		System.out.println("Enter status:");
		String status =s.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/qspider","root","root");
			
			PreparedStatement ps=c.prepareStatement("insert into qspider_db values(?,?,?,?,?)");
			
			ps.setInt(1, sid);
			ps.setInt(4,duration);
			ps.setString(2,name);
			ps.setString(3,course);
			ps.setString(5,status);
			
			
			ps.executeUpdate();
			
			System.out.println("Data Saved");
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}