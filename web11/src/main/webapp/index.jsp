<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC2를 이용한 게시판</title>
</head>
<body>

<%
	response.sendRedirect("http://localhost:8989/web11/BoardServlet?command=board_list");
%>
</body>
</html>