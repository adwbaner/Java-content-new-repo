package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doPost(request,response);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
 
		//Storing the 'passed' data
 
		ServletContext sc= getServletContext();
		String e = sc.getAttribute("empname").toString();
		String a = sc.getAttribute("empage").toString();
		String add= sc.getAttribute("empaddress").toString();
 
		/*String e = request.getAttribute("empname").toString();
		String a = request.getAttribute("empage").toString();
		String add= request.getAttribute("empaddress").toString();*/
 
		/*HttpSession obj=request.getSession(false);
 
		String e = obj.getAttribute("empname").toString();
		String a = obj.getAttribute("empage").toString();
		String add= obj.getAttribute("empaddress").toString();*/
 
		/*Cookie ck[]=request.getCookies();
		for(Cookie c:ck)
		{
			System.out.println(c.getValue());
 
		}*/
 
		/*Long time= obj.getCreationTime();
	    Long s=obj.getLastAccessedTime();
	    boolean b=obj.isNew();*/
		PrintWriter out=response.getWriter();
		out.println("Employee name= " +e);
		out.println("Employee age= " +a);
		out.println("Employee address=" +add);
		/*System.out.println("Employee session creation time= " +time);
		System.out.println("Employee last access time= " +s);
		System.out.println("Employee new ?= " +b);*/
	}
 
}
 
 
