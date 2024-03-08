<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<h1>회원 정보 입력 폼</h1>

<form method="post" action="04_itemMember.jsp">

<label for="name">이름 </label>
<input type="text" name="name" id="name" value="김진수"><br>
<label for="price">가격</label>
 <input type="text" name="price" id="price" value="55000"><br>
 <label for="description">가격</label>
 <textarea rows="10" cols="70" name="description" id="description"></textarea><br>
 
 <button type="submit">전송</button>
 <button type="reset">취소</button>

</form>
</body>
</html>