<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DBCP DB 연동</title>
</head>
<body>

	<h1>DB 연동</h1>

	<%
	Context initContext = new InitialContext();
	Context envContext = (Context) initContext.lookup("java:/comp/env");
	DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
	Connection conn = ds.getConnection();
	
	out.print("DBCP 연동 성공");
	%>

</body>
</html>