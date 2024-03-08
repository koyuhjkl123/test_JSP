<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>라디오 버튼</title>
</head>
<body>
	<form action="RadioServlet">
		<label for="gender">성별 : </label>
		<input type="radio" id="gender" name="gender" value="남자" checked> 남자
		<input type="radio" id="gender" name="gender" value="여자"> 여자
		<br><br>
		<label for="chk_mail">메일 정보 수신 여부 : </label>
		<input type="radio" id="chk_mail" name="chk_mail" value="yes" checked> 수신
		<input type="radio" id="chk_mail" name="chk_mail" value="no"> 거부
		<br><br>
		<label for="content">간단한 가입 인사를 적어주세요^o^</label>
		<textarea rows="3" cols="35" id="content" name="content"></textarea>
		<br>
		<h2>악세사리</h2>
		관심항목을 선택하세요.
		<hr>
		<input type="checkbox" name="item" value="신발">신발
		<input type="checkbox" name="item" value="가방">가방
		<input type="checkbox" name="item" value="벨트">벨트<br>
		<input type="checkbox" name="item" value="모자">모자
		<input type="checkbox" name="item" value="시계">시계
		<input type="checkbox" name="item" value="쥬얼리">쥬얼리<br>
		
		
		<input type="submit" value="전송">
	</form>

</body>
</html>