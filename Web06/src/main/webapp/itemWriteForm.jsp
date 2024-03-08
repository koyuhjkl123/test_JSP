<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>정보 입력 폼</h1>

<form action="itemWrite.jsp" method="POST">
<label for="name">이름 : </label>
<input type="text" name="name" id="name" value="휴대폰"><br>
<label for="price">가격 :</label>
 <input type="text" name="price" id="price" value="90000"><br>
 <label for="description">설명 :</label>
<textarea rows="10" cols="50" name="description" id="description"></textarea><br>
<input type="submit" value="전송">
<input type="reset" value="취소">
</form>
</body>
</html>