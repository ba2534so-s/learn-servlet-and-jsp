<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Function Tags</title>
</head>
<body>

	<c:set var="str" value="Hello World"></c:set>
	
	Length: ${fn:length(str)} <br><br>
	
	<c:forEach items="${fn:split(str, ' ')}" var="s">
	
		<c:out value="${s}"></c:out>
	
		<br>
	</c:forEach>
	
	<c:if test="${fn:contains(str, 'World' }">
		
	</c:if>
	
</body>
</html>