package com.learnjspservlet.login;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		// Static username and password check just for practicing login.
		if (username.equals("TestUser") && password.equals("testPass")) {
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			
			res.sendRedirect("welcome.jsp");
		} else {
			res.sendRedirect("login.jsp");
		}
		
	}
	

}
