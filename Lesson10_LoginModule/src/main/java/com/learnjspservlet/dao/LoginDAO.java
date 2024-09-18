package com.learnjspservlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO  {
	
	String url = "jdbc:postgrsql://localhost:5432/learn_jsp";
	String dbUser = "postgres";
	String dbPass = "0";
	
	String loginQuery = "SELECT * FROM users WHERE username = ? AND password = ?";
	
	
	public boolean checkUser(String username, String password) {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, dbUser, dbPass);
			PreparedStatement st = con.prepareStatement(loginQuery);
			st.setString(1, username);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return false;
	}

}
