<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%-- jsp에서 에러가 발생 하였을 떄 보여지는 페이지를 설정 --%>
  <%@ page errorPage="08_eeor.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러를 발생 시키는 페이지</title>
</head>
<body>
	0으로 나누는 것은 불가능합니다.
	<%-- 강제로 예외를 발생 시킴 --%>
	<%= 2/0 %>
</body>
</html>