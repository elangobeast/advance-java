package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Authenticator.RequestorType;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class loginServlet extends GenericServlet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		
		out.print("<h1> email = " +email + "</h1>");
		out.print("<h1> password = " +password + "</h1>");
		
		
	}

}
