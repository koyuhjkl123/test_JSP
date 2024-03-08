<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="green">


<h1>관리자로 로그인 성공!</h1>
<%= URLDecoder.decode(request.getParameter("userName"), "UTF-8") %>
<%= request.getParameter("userId") %>님 환영합니다.

</body>
</html>