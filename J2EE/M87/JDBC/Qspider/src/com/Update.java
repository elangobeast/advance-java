package com;
import java.util.*;
import java.sql.*;

public class Update {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the id:");
        
        int sid= sc.nextInt();
        System.out.println("Enter course");
        
        String course = sc.next();
        System.out.println("Enter status");
        String status = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/qspider","root","root");
			
			PreparedStatement ps=c.prepareStatement("update qspider_db set course=?,status=? where sid =?");
			
			ps.setInt(1, sid);
			
			ps.setString(3,course);
			
			ps.setString(5,status);
			
			
			ps.executeUpdate();
			
			System.out.println("Data updated");
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}