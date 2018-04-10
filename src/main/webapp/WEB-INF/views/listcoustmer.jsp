<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<input type="button" value="addcoustmer" 
onclick="window.location.href='showaddcoustmer';return false;"/>

<table>
<tr>FirstName</tr>
<tr>LastName</tr>
<tr>Email</tr>

<c:forEach var="temp" items="${coustmer}">

<c:url value="updatelink" value="coustmer/showformforupdate">
<c:param name="coustmerId" value="${temp.id}"></c:param>

</c:url>

<tr>
<td>${temp.firstname}</td>
<td>${temp.lastname}</td>
<td>${temp.email}</td>
<td><ahref="${updatelink}>Delete</a>"</td>


</tr>


</c:forEach>

</table>








</body>
</html>