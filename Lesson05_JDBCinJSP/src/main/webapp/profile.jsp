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
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url);
	
	%>

</body>
</html>