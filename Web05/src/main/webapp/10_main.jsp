<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%

// 공유된 세션에서 로그인 유저의 값을 확인
if(session.getAttribute("loginUser") == null){
	// 로그인유저 정보가 없으므로 로그인 입력 화면으로
	response.sendRedirect("08_loginForm.jsp");
}else {
%>

<!-- 로그인 유저 정보가 있으므로 로그인 사용자 화면  -->
<%= session.getAttribute("loginUser") %>님 안녕하세요.<br>
<form method="POST" action="11_logout.jsp">
	<input type="submit" value="로그아웃">
</form>
<% }%>
	

</body>
</html>