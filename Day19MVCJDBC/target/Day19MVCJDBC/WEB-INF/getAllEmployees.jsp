<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Employee JSP Page</h1>
<table border = "1px">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Salary</th>
	</tr>
	
	<c:forEach var="emp" items="${empList}">
	<tr>
		<td>${emp.empId}</td>
		<td>${emp.empName}</td>
		<td>${emp.empSal}</td>
	</tr>    
	
	</c:forEach>
</table>
</body>
</html>