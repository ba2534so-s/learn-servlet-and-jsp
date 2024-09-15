<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>
<DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	101 <br>
	Batman <br>
	24 <br>
	
	<% 
		String url = "jdbc:postgresql://localhost:5432/learn_jsp";
		String username ="postgres";
		String password = "0";
		
		String query = "SELECT * FROM Students WHERE studentID = 1";
		
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
	
	%>

</body>
</html>