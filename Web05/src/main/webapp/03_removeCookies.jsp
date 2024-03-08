<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Id 쿠키 삭제하기</title>
</head>
<body>

<%

  Cookie c = new Cookie("id", "");
  c.setMaxAge(0); // 유효기간 만료
  response.addCookie(c);
  
%>

<h1> id 쿠키가 삭제되었습니다.</h1>
<a href="02_getCookies.jsp">쿠키를 확인 할려면 클릭하세요</a>
</body>
</html>