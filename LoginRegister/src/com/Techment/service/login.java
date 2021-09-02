package com.Techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	
	String username = request.getParameter("username");
	String pass = request.getParameter("password");
	Validate validate = new Validate();
	if(validate.checkUser(username, pass))
	{
		  RequestDispatcher rs = request.getRequestDispatcher("Welcome");
          rs.forward(request, response);
	}
	else
	{
		out.println("Username or Password incorrect Please Register first if not Registered <a href=\"register.html\">For new user Register</a>");
        RequestDispatcher rs = request.getRequestDispatcher("index.html");
        rs.include(request, response);
	}
	}

}
