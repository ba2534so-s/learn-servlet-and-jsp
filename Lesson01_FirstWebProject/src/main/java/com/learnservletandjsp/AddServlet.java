package com.learnservletandjsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	/*
	 * public void service(HttpServletRequest req, HttpServletResponse res) throws
	 * IOException {
	 * 
	 * int i = Integer.parseInt(req.getParameter("num1")); int j =
	 * Integer.parseInt(req.getParameter("num2"));
	 * 
	 * int sum = i + j;
	 * 
	 * PrintWriter out = res.getWriter();
	 * 
	 * out.println("Result is: " + sum);
	 * 
	 * }
	 */

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int sum = i + j;
		
		
		/*
		HttpSession session = req.getSession();
		session.setAttribute("sum", sum);
		*/
		
		Cookie cookie = new Cookie("sum", sum + "");
		res.addCookie(cookie); // add cookie to response object
		
		res.sendRedirect("cube");
		
		// res.sendRedirect("cube?sum=" + sum); // URL rewriting
		
		/*
		req.setAttribute("sum", sum);
		RequestDispatcher rd = req.getRequestDispatcher("square");
		rd.forward(req, res);
		*/
	}

}
