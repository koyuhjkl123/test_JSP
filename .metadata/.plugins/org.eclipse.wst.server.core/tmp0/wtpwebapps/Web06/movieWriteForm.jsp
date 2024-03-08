<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>영화 정보 등록</h3>

<form action="moviewrite.jsp" method="POST" name="frm" id="reg_frm">

<label for="title">제목 </label>
<input type="text" name="title" id="title" value="바닐라 스카이"><br>
<label for="price">가격</label>
 <input type="text" name="price" id="price" value="12000">원<br>
 <label for="director">감독</label>
 <input type="text" name="director" id="director" value="카메론 크로우"><br>
 <label for="actor">출연배우</label>
 <input type="text" name="actor" id="actor" value="톰 크루즈 페넬로페 크루스 캐머런 디아즈 외" ><br>
 
 <label for="synopsis">시놉시스</label>
<textarea rows="10" cols="50" name="synopsis" id="synopsis"></textarea><br>
<label for="genrel">장르</label>
<select name="genrel">
<option value="로맨스">로맨스</option>
<option value="스릴러">스릴러</option>
<option value="미스터리">미스터리</option>
<option value="액션" selected="selected">액션</option>
<option value="코미디">코미디</option>
<option value="애니메이션">애니메이션</option>
</select>
<input type="submit" value="등록">
<input type="reset" value="다시 작성">

</form>

</body>
</html>