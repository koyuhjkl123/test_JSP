<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지시자(include)</title>
</head>
<body>

	<h3>메인페이지</h3>
	<a href="06_sub.jsp">서브 페이지로 이동하기</a>
	<%@ include file="04_footer.jsp" %>
</body>
</html>