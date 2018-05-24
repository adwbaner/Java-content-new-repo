package com.cg.servlets.day2.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.SecureCacheResponse;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.cg.servlets.day2.servlet.WebServlet;

@WebServlet("/MyServlet")
public class MyServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

    
	


	
		public void service(ServletRequest request, ServletResponse response)
				throws ServletException, IOException 
		{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<html><body>");
			out.println("<b>Welcome to capgemini</b>");
			out.println("</body></html>");
	 
	 
		}

		
	

	

}
