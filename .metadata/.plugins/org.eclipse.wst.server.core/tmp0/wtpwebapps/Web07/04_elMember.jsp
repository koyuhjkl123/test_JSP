<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 
 <jsp:useBean id="member" class="com.keduit.MemberBean" />
 <jsp:setProperty property="*" name="member" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>회원 정보</h1>
이름 : ${member.name } <br>
아이디 : ${member.userid } <br>
닉네임 : ${member.nickname } <br>
비빌번호 : ${member.pwd }<br>


</body>
</html>