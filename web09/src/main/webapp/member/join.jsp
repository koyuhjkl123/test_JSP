<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 입력 폼</title>
<script type="text/javascript" src="script/member.js">


</script>
<style type="text/css">
span{
color:red;
}
label{
	display:inline-block;
	width: 200px;
}
</style>
</head>
<body>

<h1>회원 정보 입력 폼</h1>

<form name="frm" id="reg_frm" method="POST" action="join.do">

<label for="name">이름 </label><span> * </span>
<input type="text" name="name" id="name" required><br>

<label for="id">아이디</label><span> * </span>
 <input type="text" name="userid" id="userid"><br>
 <input type="hidden" name="reid" size="20">
 <input type="button" value="중복 체크" onclick="idCheck()"><br>
 
 <label for="pwd">비밀번호</label><span> * </span>
 <input type="password" name="pwd" id="pwd"><br>
 
 <label for="pwd_c">비밀번호 확인 </label><span> * </span>
 <input type="password" id="pwd_c" name="pwd_c" required><br>
 
 <label for="email">이메일</label><span> * </span>
 <input type="email" name="email" id="email"><br>
 
 <label for="phone">전화번호</label><span> * </span>
 <input type="tel" name="phone" id="phone" 
 placeholder="010-1234-1234"
 pattern="[0-9]{3}-[0-9]{4}-[0-9]{4}" required>
 
 <label for="admin">권한</label><span> * </span>
 <input type="radio" name="admin" value="0"> 일반회원
 <input type="radio" name="admin" value="1"> 관리자
 <br>
 
 
 
 <button type="submit" value="등록" onclick="return joinCheck()">등록</button>
 <button type="reset" value="취소">취소</button>

</form>


</body>
</html>