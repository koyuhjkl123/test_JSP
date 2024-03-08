<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문조사</title>
</head>
<body>

<h2>설문조사</h2>
<form action="03_research.jsp" method="post">
	이름 : 
	<input type="text" name="name" size="20"><br>
	성별 :
	<input type="radio" name="gender" value="male" checked="checked">남자
	<input type="radio" name="gender" value="female">여자<br>
	
	좋아하는 계절 : 
	<input type="checkbox" name="season" value="1"> 봄
	<input type="checkbox" name="season" value="2"> 여름
	<input type="checkbox" name="season" value="3" checked="checked"> 가을
	<input type="checkbox" name="season" value="4"> 겨울
	<br>
	
	<input type="submit" value="전송">
	<input type="reset" value="취소">
	
</form>


</body>
</html>