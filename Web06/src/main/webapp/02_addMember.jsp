<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="member" class="com.keduit.MemberBean" />
<jsp:setProperty property="*" name="member"/> <!-- 모든 property를 갖고온다 -->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member test</title>
</head>
<body>

<h1>회원정보</h1>
이름 : <jsp:getProperty property="name" name="member"/>
아이디 : <jsp:getProperty property="userid" name="member"/>
비번 : <jsp:getProperty property="pwd" name="member"/>
닉네임 : <jsp:getProperty property="nickname" name="member"/>

</body>
</html>