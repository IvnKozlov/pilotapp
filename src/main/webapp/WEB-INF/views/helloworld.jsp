<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>Hello world</h2>
		<h2> ${message} ${name}</h2>
	</center>
<h1>${mv}</h1><!-- 
<table>
	<tbody>
<c:forEach var="row" items="${rs.rows}">
	<tr>
		<td>${row.id_customer}</td>
		<td>${row.first_name}</td>
		<td>${row.last_name}</td>
		<td>${row.phone}</td>
	</tr>
</c:forEach>
	</tbody>
</table> -->
</body>
</html>