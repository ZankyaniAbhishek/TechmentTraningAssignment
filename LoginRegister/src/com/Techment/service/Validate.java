package com.Techment.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public boolean checkUser(String user,String pass)
	{
		boolean st = false;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root","@admin123");
			PreparedStatement ps = con.prepareStatement("select * from register where username=? and pass=?");
			ps.setString(1, user);
			ps.setString(2, pass);
			ResultSet rs =ps.executeQuery();
			st = rs.next();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			

		}
		return st;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());



	}

}
