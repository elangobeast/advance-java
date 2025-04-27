package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class displaymovie extends GenericServlet {

	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	
	{
		PrintWriter out=res.getWriter();
		String mid = req.getParameter("mid");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver:");
			Connecton c = DriverManager.getConnection("jdbc:mys")
			
		}
		catch(Exception e){
			
		}
	}

}
