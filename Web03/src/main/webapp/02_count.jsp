<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
 <%!
 	int g_cnt = 0;
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	int l_cnt = 0;


	out.print("<br> local var : ");
	out.print(++l_cnt);
	
	out.print("<br> global var : ");
	out.print(++g_cnt);
%>

</body>
</html>