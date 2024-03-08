<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성하기</title>
</head>
<body>

<%

// 1. Cookie 객체 생성

Cookie c = new Cookie("id", "keduit");

// 2. 유효기간 설정
c.setMaxAge(365*24*60*60);

// 3. 클라이언트에 쿠키 전송
response.addCookie(c);

// 4. 쿠키를 생성하여 클라이언트에 전송(생성과 동시 전송)
response.addCookie(new Cookie("pwd", "test123"));
response.addCookie(new Cookie("age", "20"));
%>
<h1>쿠키 생성</h1>
</body>
</html>