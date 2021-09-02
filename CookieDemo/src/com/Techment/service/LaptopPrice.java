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
 * Servlet implementation class LaptopPrice
 */
@WebServlet("/LaptopPrice")
public class LaptopPrice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int price = 80000;
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		int quantity = Integer.parseInt(request.getParameter("laptop"));
		pw.print("You have selected " + quantity);

		double totalprice = quantity*price;
		pw.print(" Total Price = " + totalprice +"<hr>");

		pw.print("<a href='Cart'>Go to Cart</a>");
		String totalprice1 = String.valueOf(totalprice);
		Cookie cookie = new Cookie("laptopPrice",totalprice1);
		response.addCookie(cookie);

	}

}
