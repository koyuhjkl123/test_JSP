<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:import url="http://localhost:8989/Web07/12_moveList.jsp" var="data"></c:import>
${data }

<c:url value="images/shop.jpg" var="img"></c:url>

<h3>${img }</h3>
<img src="${img }" width="150" height="150">


</body>
</html>