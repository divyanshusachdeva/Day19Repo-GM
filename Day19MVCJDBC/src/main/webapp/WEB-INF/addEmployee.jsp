<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
</head>
<body>
<h2>Add New Employee</h2>
    <form action="addEmployee" method="post">
        <label for="EmpId">ID:</label><br>
        <input type="number" id="EmpId" name="EmpId"><br>
        <label for="empName">Name:</label><br>
        <input type="text" id="empName" name="empName"><br>
        <label for="salary">Age:</label><br>
        <input type="number" id="empSal" name="empSal"><br>
    </form>
</body>
</html>
