package Dynamic;

import java.util.Scanner;
import java.sql.*;

public class DynamicDelete{
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the mid id:");
        
        int id= sc.nextInt();
       
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
        	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
        	
        	PreparedStatement ps = c.prepareStatement("delete from movie  where mid =?");
        	
        	ps.setInt(1, id);
        	
        	
        	ps.executeUpdate();
        	System.out.println("Data Deleted");
        	
        	
        } catch (ClassNotFoundException | SQLException e) {
        	e.printStackTrace();
        }
        

}
}
