<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="member" class="com.keduit.ItemBean" />
<jsp:setProperty property="*" name="member"/> <!-- 모든 property를 갖고온다 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>입력 완료된 정보</h1>
상품명 : <jsp:getProperty property="name" name="member"/><br>
가격 : <jsp:getProperty property="price" name="member"/><br>
설명 : <jsp:getProperty property="description" name="member"/><br>
</body>
</html>