package com;

import java.util.Scanner;
import java.sql.*;

public class Delete{
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the id:");
        
        int id= sc.nextInt();
       
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
        	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/audi_db","root","root");
        	
        	PreparedStatement ps = c.prepareStatement("delete from audi  where id =?");
        	
        	ps.setInt(1, id);
        	
        	
        	ps.executeUpdate();
        	System.out.println("Data Deleted");
        	
        	
        } catch (ClassNotFoundException | SQLException e) {
        	e.printStackTrace();
        }
        

}
}
