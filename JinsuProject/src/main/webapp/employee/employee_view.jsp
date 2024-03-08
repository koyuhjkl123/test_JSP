<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 보기</title>
<link rel="stylesheet" href="css/employee.css">
<script type="text/javascript" src="script/employee.js"></script>
</head>
<body>


	<div id="container">

		<h1>정보 보기</h1>
		<form action="EmployeeServlet" name="frm" method="post">

			<input type="hidden" name="command" value="employee_view">


			<table>

				<tr>
					<th>아이디</th>
					<td>${employee.userid }</td>
				</tr>

				<tr>
					<th>비밀번호</th>
					<td>${employee.pass }</td>
				</tr>

				<tr>
					<th>이름</th>
					<td>${employee.name }</td>
				</tr>

				<tr>
					<th>권한</th>
					<td>${employee.lev }</td>
				</tr>

				<tr>
					<th>성별</th>
					<td>${employee.gender }</td>
				</tr>

				<tr>
					<th>전화번호</th>
					<td>${employee.phone }</td>
				</tr>
				
				<tr>
					<th>가입일</th>
					<td><fmt:formatDate value="${employee.enter }" /></td>
				</tr>
				
			</table>
				<input type="button" value="수정" onclick="location.href='EmployeeServlet?command=employee_form_update&userid=${employee.userid}'">
				<input type="button" value="삭제" onclick="location.href='EmployeeServlet?command=employee_form_delete&userid=${employee.userid}'">
				<input type="button" value="목록" onclick="location.href='EmployeeServlet?command=employee_list'">
				<input type="button" value="등록" onclick="location.href='EmployeeServlet?command=employee_form_create'">
			
		</form>


	</div>

</body>
</html>