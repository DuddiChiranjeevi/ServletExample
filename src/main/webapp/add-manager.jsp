<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">

<h1 style="color:red" align="center">Welcome to Manager register portal</h1>

<div style="color:green" align="center" >
<c:out value="${message}"></c:out>
</div>

<c:if test="${not empty errors}">
<div style="color:red" align="center">
<c:forEach items="${errors}" var="error">
<p> ${error}</p>
</c:forEach>
</div>
</c:if>

<form action="addmanager" method="post">

<c:choose>
<c:when test="${not empty form}">
<div align="center">
Manager Id: <input type="text" name="managerId" value="${form.getManagerId()}"></input>
Manager name: <input type="text" name="name" value="${form.getName()}"></input>
Mobile No:<input type="text" name="mobileNo" value="${form.getMobileNo()}"></input>
Email Id:<input type="text" name="emailId" value="${form.getEmailId()}">
Salary:<input type="text" name="salary" value="${form.getSalary()}">
Experience: <input type="radio" name="experience" value="5" >5 or <input type="radio" name="experience" value="7">7
</div>
<h1></h1>
<div align="center" style="color:blue">
<input type="submit" style="color:green" value="REGISTER">
</div>
</c:when>


<c:otherwise>
<div align="center">
Manager Id: <input type="text" name="managerId" ></input>
Manager name: <input type="text" name="name" ></input>
Mobile No:<input type="text" name="mobileNo" ></input>
Email Id:<input type="text" name="emailId" >
Salary:<input type="text" name="salary" >
Experience: <input type="radio" name="experience" value="5">5 or <input type="radio" name="experience" value="7">7
</div>

<h1></h1>
<div align="center">
<input type="submit" style="color:green" value="REGISTER">
</div>

</c:otherwise>
</c:choose>
</form>
</body>
</html>