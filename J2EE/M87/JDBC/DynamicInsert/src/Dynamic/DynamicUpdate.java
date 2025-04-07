package Dynamic;

import java.util.Scanner;
import java.sql.*;

public class DynamicUpdate {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the id:");
        
        int id= sc.nextInt();
        System.out.println("Enter language");
        
        String language = sc.next();
        System.out.println("Enter collection");
        double collection = sc.nextDouble();
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
        	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
        	
        	PreparedStatement ps = c.prepareStatement("update movie set language=?,collection=? where mid =?");
        	
        	ps.setInt(3, id);
        	ps.setString(1, language);
        	ps.setDouble(2, collection);
        	
        	ps.executeUpdate();
        	System.out.println("Data Updated");
        	
        	
        } catch (ClassNotFoundException | SQLException e) {
        	e.printStackTrace();
        }
        

}
}
