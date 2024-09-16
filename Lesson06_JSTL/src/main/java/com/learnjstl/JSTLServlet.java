package com.learnjstl;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/JSTLServlet")
public class JSTLServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		List<Student> students = Arrays.asList(
												new Student(1, "Batman", "B"),
												new Student(2, "Superman", "A"),
												new Student(3, "Spiderman", "D")); 
		
		//Student s = new Student(1, "Batman", "B");
		//req.setAttribute("student", s);
		
		req.setAttribute("students", students);
		
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
		
	}

}
