package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter count");
		int count = s.nextInt();
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
			
			PreparedStatement  ps = c.prepareStatement("insert into movie values(?,?,?,?,?,?,?) ");
					
			for(int i=1; i<=count ; i++) {
				System.out.println("enter mid");
				int mid = s.nextInt();
				ps.setInt(1, mid);
				
				s.nextLine();
				
				System.out.println("Enter name");
				String name = s.nextLine();
				ps.setString(2, name);
				
				System.out.println("Enter language");
				String language = s.next();
				ps.setString(3, language);
				
				System.out.println("Enter hero");
				String hero = s.next();
			    ps.setString(4, hero);
			    
			    System.out.println("Enter heroine");
			    String heroine = s.next();
			    ps.setString(5, heroine);
			    
			    System.out.println("Enter Director");
			    String director = s.next();
			    ps.setString(6, director);
			    
			    System.out.println("Enter collection");
			    double collection = s.nextDouble();
			    ps.setDouble(7, collection);
			    
			    ps.addBatch();
			}
			
			ps.executeBatch();
			System.out.println("Data inserted");
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
	}

}
}
