package com.learnjspservlet.login;

import java.io.IOException;

import com.learnjspservlet.dao.LoginDAO;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		LoginDAO dao = new LoginDAO();
		
		// Static username and password check just for practicing login.
		if (dao.checkUser(username, password)) {
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			
			res.sendRedirect("welcome.jsp");
		} else {
			res.sendRedirect("login.jsp");
		}
		
	}
	

}
