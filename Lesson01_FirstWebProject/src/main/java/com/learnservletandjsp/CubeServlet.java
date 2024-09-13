package com.learnservletandjsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CubeServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int sum = 0;
		//HttpSession session = req.getSession();
		Cookie[] cookies = req.getCookies();
		
		for (Cookie cookie : cookies) {							// Cookie
			if (cookie.getName() == "sum") {
				sum = Integer.parseInt(cookie.getValue());
			}
		}
		
		//  sum = Integer.parseInt(req.getParameter("sum"));   // URL rewriting
		//  sum = (int) session.getAttribute("sum");			  // Session
		
		
		
		
		int cube = sum*sum*sum;
		
		
		PrintWriter out = res.getWriter();
		out.println("Cube is: " + cube);
		
		
		//session.removeAttribute("sum"); // Remove sum from session
	}

}
