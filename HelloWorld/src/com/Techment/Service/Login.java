package com.Techment.Service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/userlogin")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Hello This is my First Program");
		PrintWriter out = response.getWriter();
		out.print("hello this is my first servlet <br><br>");
		
		String name =  request.getParameter("u");
		String pass = request.getParameter("p");
		int namelength = name.length();
		System.out.println("Your name is "+name +" Your Name Length is "+namelength);
		out.print("Your name is "+name +" Your Name Length is "+namelength);
	}

}
