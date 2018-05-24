package com.cg.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExampleServlet")
public class ExampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//System.out.println("Hellooooo hello hellooooooo");
	doPost(request, response);
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		System.out.println("Hiiiiiii");
		String name=request.getParameter("ename");
		String age=request.getParameter("eage");
		String address=request.getParameter("eaddress");
		
 
		//Storing the input data
 
		ServletContext sc = getServletContext();//Provided by the external server
		sc.setAttribute("empname", name);
		sc.setAttribute("empage", age);
		sc.setAttribute("empaddress", address);
 
		/*Cookie ck=new Cookie("empname", "Adi");
		response.addCookie(ck);
		response.sendRedirect("WelcomeServlet");*/
 
		/*HttpSession obj=request.getSession();
		obj.setAttribute("empname", name);
		obj.setAttribute("empage", age);
		obj.setAttribute("empaddress", address);*/
 
		//Inserted afterwards on day2
	/*	request.setAttribute("empname", name);
		request.setAttribute("empage", age);
		request.setAttribute("empaddress", address);*/
 
		//Passing the input data to the processor servlet
		//Passing the values  among and within servlets and html pages
		RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
		rd.forward(request, response);
		//response.sendRedirect("http://www.google.com");
 
	}
 
}
