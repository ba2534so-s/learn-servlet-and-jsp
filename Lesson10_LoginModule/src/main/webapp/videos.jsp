<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Videos</title>
</head>
<body>

	<%
	
		response.setHeader("cache-control", "no-cache, no-store, must-revalidate");
		
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	
	%>
	
	<h1>Video 1</h1>
	<h1>Video 2</h1>
	<h1>Video 3</h1>
	
</body>
</html>