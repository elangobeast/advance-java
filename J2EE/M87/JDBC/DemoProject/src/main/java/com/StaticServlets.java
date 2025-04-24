package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class StaticServlets extends GenericServlet{

	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException,ServletException {
		
		  PrintWriter out = res.getWriter();
		  
		  String html="<html>"
				    +"<body>"
				    +"<h1>Hi this is static servlet</h1>"
                    +"</body>"
				    +"</html>";
		  
		  out.print(html);
		  
	}

	   
}
