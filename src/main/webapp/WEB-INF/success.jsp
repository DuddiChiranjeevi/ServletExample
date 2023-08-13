<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="51-204-255">

<div style="color:yellow" align="center">
<h2>
<c:out value="${message}"> </c:out>
</h2>
</div>
<div  align="center">
<a href="/servletexample/index.jsp" style="color:red">HOME PAGE</a>
</div>
</body>

</html>