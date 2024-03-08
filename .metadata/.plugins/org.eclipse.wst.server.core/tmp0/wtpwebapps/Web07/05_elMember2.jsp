<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

자바코드 : <%= request.getParameter("userid") %>
EL 식 : ${param.userid }

<hr>
연산 사용 비교
자바코드 : 
<%
if(request.getParameter("userid") != null){%>
== 연산자 사용 결과 : <%= request.getParameter("userid")== "pinksung" %><br>
equals() 사용 결과 : <%= request.getParameter("userid").equals("pinksung") %>
<% } else {
	out.print("id를 입력해 주세요.");
}
%>
</body>
</html>