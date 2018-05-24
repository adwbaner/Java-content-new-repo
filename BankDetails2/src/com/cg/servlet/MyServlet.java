package com.cg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		out.println("<b>Welcome to capgemini</b>");
		out.println("</body></html>");
		
	}

}
