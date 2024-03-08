<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 입력 폼</title>
</head>
<body>


<h3>회원 정보 입력</h3>
<form name="frm" id="reg_frm"  method="POST" action="05_elMember2.jsp">
  <label for="name">이름</lable><span> * </span>
  <input type="text" name="name" value="김정보" required><br>

   <label for="id"> 아이디  </label><span style="color:red;"> * </span>
   <input type="text" id="id" name="userid" value="pinksung" required><br>

    <label for="pwd"> 비밀번호 </label><span style="color:red;"> * </span> 
    <input type="password" id="pwd" name="pwd" value="1234" required><br>

<label for="id"> 닉네임  </label><span style="color:red;"> * </span>
   <input type="text" id="nickname" name="nickname" value="pinksung11" required><br>
  <input type="submit" value="등록">
  <input type="reset" value="취소">

</form>

</body>
</html>