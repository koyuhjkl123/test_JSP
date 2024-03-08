<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>두 수에 합을 구하여 결과를 출력하는 JSP</title>
</head>
<body>

	<%
		int num1 = 20;
		int num2 = 10;
		int sum = num1 + num2;
	%>
	
	<%= num1 %> + <%= num2 %> = <%= sum %> 


</body>
</html>