package com.learnjspservlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class LoginDAO  {
	
	String url = "jdbc:postgrsql://localhost:5432/learn_jsp";
	String dbUser = "postgres";
	String dbPass = "0";
	
	String loginQuery = "SELECT * FROM users WHERE username = ? AND password = ?";
	
	
	public boolean checkUser(String username, String password) {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, dbUser, dbPass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return false;
	}

}
