<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원 정보 입력 폼</h1>

<form method="post" action="02_addMember.jsp">

<label for="name">이름 </label>
<input type="text" name="name" id="name" value="성윤정"><br>
<label for="id">아이디</label>
 <input type="text" name="userid" id="userid" value="pinksung"><br>
 <label for="pwd">비밀번호</label>
 <input type="password" name="pwd" id="pwd" value="1234"><br>
 <label for="email">이메일</label>
 <input type="email" name="email" id="email" value="pinksung@naver.com" ><br>
 
 <label for="phone">전화번호</label>
 <input type="text" name="phone" id="phone" value="010-7777-7778" ><br>
 
 <label for="admin">등급</label>
 <input type="radio" name="admin" value="1">관리자
 <input type="radio" name="admin" value="0">일반회원<br>
 
 <button type="submit">전송</button>
 <button type="reset">취소</button>

</form>


</body>
</html>