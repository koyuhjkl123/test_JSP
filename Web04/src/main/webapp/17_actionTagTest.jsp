<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String userId = request.getParameter("userId");
String userPwd = request.getParameter("userPwd");
String loginCheck = request.getParameter("loginCheck");

if(loginCheck.equals("user")){
%>
<jsp:forward page="18_UserMain.jsp">
	<jsp:param value='<%= URLEncoder.encode("홍길동", "UTF-8") %>' name="userName" />
</jsp:forward>
<%} else {%>
<jsp:forward page="19_MangerMain.jsp">
<jsp:param value='<%= URLEncoder.encode("한정교", "UTF-8") %>' name="userName"/>
</jsp:forward>
<%} %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>