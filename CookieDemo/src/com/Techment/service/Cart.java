package com.Techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cart
 */
@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	out.print("<h1>Cart Page</h1>");
	
	Cookie myCookie[] = request.getCookies();
	
	for(int i =0;i<myCookie.length;i++)
		out.print(" "+myCookie[i].getName()+ " "+myCookie[i].getValue()+" ");
	
	}

}
