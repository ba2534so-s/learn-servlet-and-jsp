package com.learnjspservlet.dao;

public class LoginDAO  {
	
	String url = "jdbc:postgrsql://localhost:5432/learn_jsp";
	String db_user = "postgres";
	String db_pass = "0";
	
	
	public boolean checkUser(String username, String password) {
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return false;
	}

}
