<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Add JSP</title>
	</head>
	<body bgcolor="black">
	
		<% 
			int i = Integer.parseInt(request.getParameter("num1"));
			int j = Integer.parseInt(request.getParameter("num2"));
			int sum = i + j;			
		%>
		<h2 style='color:mediumseagreen'>
		<% out.println("Sum: " + sum);	%>
		</h2>
			
			
		</body>
	</html>
	