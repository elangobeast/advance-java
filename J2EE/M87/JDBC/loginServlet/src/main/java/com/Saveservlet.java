package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Saveservlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int mid= Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String language = req.getParameter("language");
		String hero = req.getParameter("hero");
		String heroine = req.getParameter("heroine");
		String director = req.getParameter("director");
		double collection = Double.parseDouble(req.getParameter("collection"));
		
		PrintWriter out = res.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
					
			PreparedStatement ps=c.prepareStatement("insert into movie values(?,?,?,?,?,?,?)");
			
			ps.setInt(1, mid);
			ps.setString(2, name);
			ps.setString(3, language);
			ps.setString(4, hero);
			ps.setString(5, heroine);
			ps.setString(6, director);
			ps.setDouble(7, collection);
			
			ps.executeUpdate();
			
			c.close();
			
			out.print("<h1> data saved !!!!!!!!!! </h1>");
			
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
