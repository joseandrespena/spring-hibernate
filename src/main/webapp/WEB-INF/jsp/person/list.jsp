<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Persons List</title>
<style type="text/css">
.pageStyle {
	background-color: #EEE;
	color: #000;
	font-size: 13px;
	text-align: center;
	font-family: Arial, Helvetica, sans-serif;
	padding: 5px;
}
</style>
</head>
<body class="pageStyle">
<br>
<p><b>Persons in Data Base</p>
<table id="persons">
	<tr><th>ID</th><th>FirstName</th><th>LastName</th><th>Email</th><th>Address</th><th>Phone</th></tr>
	<c:forEach items="${requestScope.personList}" var="person">
		<tr>
			<td><c:out value="${person.id}"></c:out></td>
			<td><c:out value="${person.firstName}"></c:out></td>
			<td><c:out value="${person.lastName}"></c:out></td>
			<td><c:out value="${person.email}"></c:out></td>
			<td><c:out value="${person.address}"></c:out></td>
			<td><c:out value="${person.phone}"></c:out></td> 
		</tr>
	</c:forEach>
</table>
</body>
</html>