<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원목록</title>
<link rel="stylesheet" type="text/css" href="css/employee.css">
</head>
<body>

<div id="container">

	<h1>사원 목록</h1>
	<table class = "list">
	<tr>
	<td colspan="5" class="right"><a href="EmployeeServlet?command=employee_form_create">정보등록</a></td>
	
	<tr>
	<th>아이디</th><th>이름</th><th>권한</th><th>성별</th><th>전화번호</th>
	</tr>
	
	<c:forEach var = "employee" items="${employee }">
	<tr>
	<td><a href="EmployeeServlet?command=employee_form_view&userid=${employee.userid }">${employee.userid }</a></td>
	<td><a>${employee.name }</a></td>
	<td>${employee.lev }</td>
	<td>${employee.gender }</td>
	<td>${employee.phone }</td>
	</tr>
	</c:forEach>
	
	</table>
</div>


</body>
</html>