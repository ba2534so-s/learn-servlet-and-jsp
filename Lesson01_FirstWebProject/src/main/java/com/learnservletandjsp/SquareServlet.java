package com.learnservletandjsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int sum = (int) req.getAttribute("sum");
		int square = sum * sum;
		
		PrintWriter out = res.getWriter();
		out.println("Square is: " + square);
		
	}

}
