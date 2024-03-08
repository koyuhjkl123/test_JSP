<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 변경</title>
<script type="text/javascript" src="script/member.js"></script>
<style>
span {
	color: red;
}

label {
	display: inline-block;
	width: 30%;
	text-align: left;
}

form {
	width: 100%;
}

#container {
	width: 50%;
	margin: 30px auto;
	line-height: 2em;
}

.center {
	text-align: center;
}
</style>
</head>
<body>
	<div id="container">
		<h3 class="center">회원 정보 변경</h3>
		<form name="frm" id="reg_frm" method="POST" action="memberUpdate.do">
			<label for="name">이름</label><span> * </span> 
			<input type="text" name="name" value="${mvo.name }" readonly><br> 
				
				<label for="id"> 아이디 </label><span> * </span> 
				<input type="text" id="id" name="userid" value="${mvo.userid }" readonly> 
				
				<label for="pwd"> 비밀번호 </label><span> * </span> 
				<input type="password" id="pwd" name="pwd" required><br> 
				
				<label for="pwd_c">비밀번호 확인</label><span></span> 
				<input type="password" id="pwd_c" name="pwd_c" required><br> 
				
				<label for="email"> 이메일 </label><span></span> 
				<input type="email" id="email" name="email" value="${mvo.email }"><br>

			<label for="phone"> 전화번호 </label><span> * </span> 
			<input type="tel" id="phone" name="phone" placeholder="010-1234-1234" pattern="[0-9]{3}-[0-9]{4}-[0-9]{4}" value="${mvo.phone }"><br>

			<label for="admin"> 권한 </label><span> * </span>

			<c:choose>
				<c:when test="${mvo.admin == 0  }">
					<input type="radio" name="admin" value="0" checked> 일반회원 
					<input type ="radio" name="admin" value="1"> 관리자 <br>
				</c:when>
				<c:otherwise>
					<input type="radio" name="admin" value="0" > 일반회원 
					<input type ="radio" name="admin" value="1" checked> 관리자 <br>
				</c:otherwise>
			</c:choose>
			<br>
			<div class="center">
				<input type="submit" value="수정" onclick="return joinCheck()">
				<input type="reset" value="취소">
			</div>

		</form>
	</div>

</body>
</html>