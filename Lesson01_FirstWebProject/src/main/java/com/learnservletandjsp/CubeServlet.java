package com.learnservletandjsp;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CubeServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		
		System.out.println("Cube called");
		
	}

}
