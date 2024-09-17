package com.learnjspservlet.login;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		// Static username and password check just for practicing login.
		if (username.equals("TestUser") && password.equals("testPass")) {
			
			
			res.sendRedirect("welcome.jsp");
		}
		
	}
	

}
