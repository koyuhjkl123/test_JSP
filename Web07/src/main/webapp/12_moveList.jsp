<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forEach의 begin, end 속성 사용하기</title>
</head>
<body>

<c:forEach var="cnt" begin="1" end="10" varStatus="status" step="2">
	${cnt }<c:if test="${not status.last }"></c:if>
</c:forEach>
<br><br>

<table border="1" style="width:100%; text-align:center;">

	<tr>
		<th>index</th>
		<th>count</th>
		<th>cnt</th>
	</tr>
	
	<c:forEach var="cnt" begin="5" end="8" varStatus="status">
		<tr>
			<td> ${status.index }</td>
			<td> ${status.count }</td>
			<td> ${cnt }</td>
		</tr>
	</c:forEach>
	
</table>

<br><br>

<table border="1" style="width:100%; text-align:center;">

	<tr>
		<th>index</th>
		<th>count</th>
		<th>cnt</th>
	</tr>
	
	<c:forEach var="cnt" begin="1" end="15" varStatus="status" step="3">
		<tr>
			<td> ${status.index }</td>
			<td> ${status.count }</td>
			<td> ${cnt }</td>
		</tr>
	</c:forEach>
	
</table>

</body>
</html>