<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문조사결과</title>
</head>
<body>

	<h2>설문조사 결과</h2>


	<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	out.print("이름 : <b>" + name + "</b><br>");
	
	String gender = request.getParameter("gender");
	// out.print("성별 : <b>" + gender + "</b><br>");
	
	if(gender.equals("male")){
		out.print("<b>남자</b><br>");
	} else{
		out.print("<b>여자</b><br>");
	}
	
	String seasons[] = request.getParameterValues("season");
	// out.print("당신이 좋아하는 계절은 : " + seasons[0]);
	
	for(String season: seasons){
		
		switch(season){
		
		case "1":out.print("<b>봄 </b>");
		break;
		case "2":out.print("<b>여름 </b>");
		break;
		case "3":out.print("<b>가을 </b>");
		break;
		case "4":out.print("<b>겨울 </b>");
		break;
		}
	}
	out.print("입니다.");
	
	%>
	<br>
	<a href='javascript:history.go(-1)'>다시</a>
</body>
</html>