<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%@ page import="java.sql.Statement, java.util.ArrayList" %>
<%@ include file="header.jsp" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		pageContext.setAttribute("name", "Batman", PageContext.SESSION_SCOPE);
	
	%>

</body>
</html>