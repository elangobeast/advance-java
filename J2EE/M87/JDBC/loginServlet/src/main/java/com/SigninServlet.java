package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SigninServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String phone = req.getParameter("phpne");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		
		out.print("<h1> id =" +id+ "</h1>");
		out.print("<h1> name =" +name+ "</h1>");
		out.print("<h1> gender =" +gender+ "</h1>");
		out.print("<h1> phone =" +phone+ "</h1>");
		out.print("<h1> email =" +email+ "</h1>");
		out.print("<h1> password =" +password+ "</h1>");
		
		
		
		
		
		
	}

}
