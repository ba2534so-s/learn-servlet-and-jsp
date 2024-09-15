<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--  DIRECTIVE  -->
<%@page import="java.util.Scanner"%>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP page</title>
	</head>
	<body>
		<h1>Hello World!</h1>
		
		<!-- DECLARATION -->
		<%!
			int coef = 10;
		%>
		
		<!--  SCRIPTLET -->
		<%
			out.println(5 + 7);
		%>
		
		My Favorite Number Is: <%= coef %>
	</body>
</html>