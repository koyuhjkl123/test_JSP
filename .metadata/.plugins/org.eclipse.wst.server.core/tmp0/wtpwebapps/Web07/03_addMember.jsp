<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="member" class="com.keduit.MemberBean" />
<jsp:setProperty property="*" name="member" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL로 정보 출력</title>
</head>
<body>

이름 : ${member.name }<br>
아이디 : ${member.userid }<br>
비번 : ${member.pwd }<br>
닉네임 : ${member.nickname }<br>



</body>
</html>