package com.learnservletandjsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ConfigContext extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		PrintWriter out = res.getWriter();
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		
		out.println("Name: " + str);
		
		str = ctx.getInitParameter("car");
		out.println("Car: " + str);
		out.println();
		
		
		ServletConfig cfg = getServletConfig();
		str = cfg.getInitParameter("name");
		out.println("Name: " + str);
		
	}

}
