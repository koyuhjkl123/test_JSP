<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션에 값 설정하기</title>
</head>
<body>

<%

	session.setAttribute("id", "keduit");
	session.setAttribute("pwd", "test1234");
	session.setAttribute("age", 20);
%>

<h1>세션 설정</h1>

</body>
</html>