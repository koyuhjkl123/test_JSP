<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 등록</title>
<link rel="stylesheet" href="css/employee.css">
<script type="text/javascript" src="script/employee.js"></script>
</head>
<body>


	<div id="container">

		<h1>정보 등록</h1>
		<form action="EmployeeServlet" name="frm" method="post">

			<input type="hidden" name="command" value="employee_create">


			<table>

				<tr>
					<th>아이디</th>
					<td><input type="text" name="userid" required></td>
				</tr>

				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pass" required></td>
				</tr>

				<tr>
					<th>이름</th>
					<td><input type="text" name="name" required></td>
				</tr>

				<tr>
					<th>권한</th>
					<td><select name="lev">
							<option value="A">운영자</option>
							<option value="B">일반회원</option>
					</select></td>
				</tr>

				<tr>
					<th>성별</th>
					<td><select name="gender">
							<option value="1">남자</option>
							<option value="2">여자</option>
					</select></td>
				</tr>

				<tr>
					<th>전화번호</th>
					<td><input type="tel" name="phone" oninput=hypenTel(this) maxlength="13" ></td>
				</tr>
				
				<tr>
					<th>입사일</th>
					<td><input type="date" name="enter"></td>
				</tr>
				
				
			</table>
				<input type="submit" value="등록" onclick="return employeeCheck()">
				<input type="reset" value="취소">
				<input type="button" value="돌아가기" onclick="location.href='EmployeeServlet?command=employee_list'">
			
		</form>


	</div>

</body>
</html>