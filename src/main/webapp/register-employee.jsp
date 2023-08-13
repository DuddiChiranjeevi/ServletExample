<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register-employee</title>
</head>
<body bgcolor="lightgray">

<h1 style="color:blue" align="center">Welcome to employee register portal</h1>

<div style="color:green" align="center">
<c:out value="${message}"></c:out>
</div>

<c:if test="${not empty errors}">
<div style="color:red" align="center">
<c:forEach items="${errors}" var="error">
<p>"${error}"</p>
</c:forEach>
</div>
</c:if>

<form action="registeremployee" method="post">
<c:choose>
<c:when test="${not empty form}">
<div align="center">
Full name: <input type="text" name="empName" value="${ form.getEmpName()}"></input>
Mobile No:<input type="text" name="mobileNo" value="${ form.getMobileNo()}"></input>
Email Id:<input type="text" name="emailId" value="${ form.getEmailId()}"></input>
Salary:<input type="text" name="salary" value="${ form.getSalary()}"></input>
</div>

<h1></h1>
<div align="center">
<input type="submit" style="color:green" value="REGISTER"></input>
</div>
</c:when>

<c:otherwise>
<div align="center">
Full name: <input type="text" name="empName"  ></input>
Mobile No:<input type="text" name="mobileNo"  ></input>
Email Id:<input type="text" name="emailId"  ></input>
Salary:<input type="text" name="salary" ></input>
</div>

<h1></h1>
<div align="center">
<input type="submit" style="color:green" value="REGISTER"></input>
</div>
</c:otherwise>
</c:choose>
</form>
<footer style="color:brown">Be cool Work more</footer>
</body>
</html>