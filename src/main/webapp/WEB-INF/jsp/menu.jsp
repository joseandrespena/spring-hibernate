<%@ include file="/WEB-INF/jsp/include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p><b>Please select an option</b></p>

<!-- <a href="<c:url value="/order/form.do"/>">Purchase order</a> -->
<!-- <a href="<c:url value="/provider/list.do"/>">List Providers</a> -->
<a href="<c:url value="/person/list.do"/>">List Person</a>
<!-- <a href="<c:url value="/order/list.do"/>">List Orders</a>  -->
<a href="<c:url value="/person/form.do"/>">Add Person</a>

</body>
</html>