<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%!
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	String url= "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String userpwd = "tiger";
	String sql = "insert into item values(?, ?, ?)";

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 관리</title>
</head>
<body>

<%

	request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("name");
	int price = Integer.parseInt(request.getParameter("price"));
	String description = request.getParameter("description");
	
	
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, userid, userpwd);
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, name);
		pstmt.setInt(2, price);
		pstmt.setString(3, description);
		
		pstmt.executeUpdate();
		
	} catch(Exception e){
		e.printStackTrace();
	} finally {
		try{
			
			if(pstmt != null)
				pstmt.close();
			if(conn != null)
				conn.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
%>

<h1>상품 등록 성공</h1>
<a href="06_itemMember.jsp">결과 보기</a>
</body>
</html>