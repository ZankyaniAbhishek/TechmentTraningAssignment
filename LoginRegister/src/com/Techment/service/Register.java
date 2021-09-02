package com.Techment.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
		String name=request.getParameter("userName");  
		String password=request.getParameter("userPass");  
		String email=request.getParameter("userEmail");  
		String country=request.getParameter("userCountry");  
		          
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root","@admin123");
		  
		PreparedStatement ps=con.prepareStatement(  
		"insert into register values(?,?,?,?)");  
		  
		ps.setString(1,name);  
		ps.setString(2,password);  
		ps.setString(3,email);  
		ps.setString(4,country);  
		          
		int i=ps.executeUpdate();  
		if(i>0)  
		out.print("You are successfully registered...Go and login <a href='index.html'> Log In</a>");  
		      
		          
		}catch (Exception e2) {System.out.println(e2);}  
		          
		out.close();  
		}  
	}


