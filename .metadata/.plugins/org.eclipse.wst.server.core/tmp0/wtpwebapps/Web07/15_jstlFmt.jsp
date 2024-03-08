<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜형식 지정하기</title>
</head>
<body>

<pre>
<c:set var="now" value="<%= new java.util.Date() %>"></c:set>
\${now } : ${now }

       <fmt:formatDate value="${now }"/>
date : <fmt:formatDate value="${now }" type="date"/>
time : <fmt:formatDate value="${now }" type="time"/>
both : <fmt:formatDate value="${now }" type="both"/>
default : <fmt:formatDate value="${now }" type="both" dateStyle="default" timeStyle="default"/>


long : <fmt:formatDate value="${now }" type="both"dateStyle="long"/>
medium : <fmt:formatDate value="${now }" type="both" dateStyle="medium"/>
short : <fmt:formatDate value="${now }" type="both" dateStyle="short"/>
pattern = "yyyy년 MM월 hh시 mm분 ss초" : 
<fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일 hh시 mm뷴 ss초"/>
</pre>

</body>
</html>