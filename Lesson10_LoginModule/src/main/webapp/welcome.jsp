<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>

	<%
		response.setHeader("cache-control", "no-cache, no-store, must-revalidate");
		
		if(session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	
	%>

	<h1>Welcome ${username}</h1><br>
	
	<a href="videos.jsp">Videos</a><br>
	
	<form action="logout">
		<input type="submit" value="Logout">
	</form>
	

</body>
</html>