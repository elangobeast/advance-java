package com;

import java.util.Scanner;
import java.sql.*;

public class Update {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the id:");
        
        int id= sc.nextInt();
        System.out.println("Enter quantity");
        
        String quantity = sc.next();
        System.out.println("Enter rating");
        double rating = sc.nextDouble();
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
        	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/audi_db","root","root");
        	
        	PreparedStatement ps = c.prepareStatement("update audi set quantity=?,rating=? where id =?");
        	
        	ps.setInt(3, id);
        	ps.setString(1, quantity);
        	ps.setDouble(2, rating);
        	
        	ps.executeUpdate();
        	System.out.println("Data Updated");
        	
        	
        } catch (ClassNotFoundException | SQLException e) {
        	e.printStackTrace();
        }
        

}
}
