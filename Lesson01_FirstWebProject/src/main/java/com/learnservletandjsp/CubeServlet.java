package com.learnservletandjsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CubeServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//HttpSession session = req.getSession();
		
		// int sum = Integer.parseInt(req.getParameter("sum"));   // URL rewriting
		// int sum = (int) session.getAttribute("sum");			  // Session
		
		
		
		
		int cube = sum*sum*sum;
		
		
		PrintWriter out = res.getWriter();
		out.println("Cube is: " + cube);
		
		
		session.removeAttribute("sum"); // Remove sum from session
	}

}
