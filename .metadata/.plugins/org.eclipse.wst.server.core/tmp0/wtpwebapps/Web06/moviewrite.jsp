<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

request.setCharacterEncoding("UTF-8");
%>

    
<jsp:useBean id="member" class="com.keduit.MovieBean" />
<jsp:setProperty property="*" name="member"/> <!-- 모든 property를 갖고온다 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>회원정보</h1>
제목 : <jsp:getProperty property="title" name="member"/><br>
가격 : <jsp:getProperty property="price" name="member"/><br>
감독 : <jsp:getProperty property="director" name="member"/><br>
출연배우 : <jsp:getProperty property="actor" name="member"/><br>
시놉시스 : <jsp:getProperty property="synopsis" name="member"/><br>
장르 : <jsp:getProperty property="genrel" name="member"/>
</body>
</html>