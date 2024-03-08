<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 수정</title>
<link rel="stylesheet" href="css/employee.css">
<script type="text/javascript" src="script/employee.js"></script>
</head>
<body>


	<div id="container">

		<h1>정보 수정</h1>
		<form action="EmployeeServlet" name="frm" method="post">

			<input type="hidden" name="command" value="employee_update">


			<table>

				<tr>
					<th>아이디</th>
					<td><input type="text" name="userid" value="${employee.userid }" readonly="readonly"></td>
				</tr>

				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pass" value="${employee.pass }"></td>
				</tr>

				<tr>
					<th>이름</th>
					<td><input type="text" name="name" value="${employee.name }"></td>
				</tr>

				<tr>
					<th>권한</th>
					<td><input type="text" name="lev" value="${employee.lev }" readonly="readonly"></td>
				</tr>

				<tr>
					<th>성별</th>
					<td><input type="text" name="gender" value="${employee.gender }" readonly="readonly"></td>
				</tr>

				<tr>
					<th>전화번호</th>
					<td><input type="tel" name="phone" value="${employee.phone }"></td>
				</tr>
				
			</table>
				<input type="submit" value="확인" onclick="return employeeCheck()">
				<input type="reset" value="취소">
				<input type="button" value="목록" onclick="location.href='EmployeeServlet?command=employee_list'">
			
		</form>


	</div>

</body>
</html>