<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL SQL</title>
</head>
<body>

	<sql:setDataSource var="db" 
		driver="org.postgresql.Driver" 
		url="jdbc:postgresql://localhost:5432/learn_jsp" 
		user="postgres" 
		password="0"/>
		
	<sql:query var="rs" dataSource="${db}">SELECT * FROM Students</sql:query>

</body>
</html>