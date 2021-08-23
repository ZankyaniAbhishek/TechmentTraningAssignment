package com.Techment.Service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Comparision
 */
@WebServlet("/Comparision")
public class Comparision extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw =response.getWriter();
		pw.print("<br>=============Largest Among All=======<br>");
		int num1 = Integer.parseInt(request.getParameter("n1"));
		int num2 = Integer.parseInt(request.getParameter("n2"));
		int num3 = Integer.parseInt(request.getParameter("n3"));
		if(num1>num2 && num1>num3)
			pw.print("Largest Among 3 is : "+num1);
		else if(num2>num1 && num2>num3)
			pw.print("Largest Among 3 is : "+num2);
		else
			pw.print("Largest Among 3 is : "+num3);
	}

}
