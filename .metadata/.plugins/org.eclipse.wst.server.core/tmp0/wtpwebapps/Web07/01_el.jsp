<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression language</title>
</head>
<body>

${"안녕하세여"}
<%= "안녕하세여~~" %>
<p>
EL에서의 null표현 : ${"null"}</p>

<%
	String input = null;
%>

<p>표현식에서의 null : <%= input %></p>
<p>EL에서의 null : ${empty input }</p> <!-- empty 비어있으면 true -->

<p>정수형 : ${100 }<br>
실수형 : ${100.5 }<br>
문자열형 : ${"한정교" }<br>
논리형 : ${true }<br>
</body>
</html>