<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core Tags</title>
</head>
<body> 
	<% 
		//String name = request.getAttribute("name").toString();
		//out.println("Hello " + name);
	
	%> 
	<br>
	
	
	<!--  EXPRESSION LANGUAGAE -->
	Hello ${students} <br>
		<!--  JSTL TAGS  -->
	<c:out value="Hello ${students}"></c:out>
	
	
	<br><br>
	
	<c:forEach items="${students}" var="s">
		${s} has grade: ${s.grade} <br>
	
	</c:forEach>

</body>
</html>