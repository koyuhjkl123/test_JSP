<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>get방식과 post방식</title>
</head>
<body>

	<form method="get" action="MethodServlet">
		<input type="submit" value="get방식으로 호출">
	</form>
	
	<br>
	
	<form method="post" action="MethodServlet">
		<input type="submit" value="post방식으로 호출">
		<a href="MethodServlet">여기를 클릭하세요.</a>
	</form>
	
</body>
</html>