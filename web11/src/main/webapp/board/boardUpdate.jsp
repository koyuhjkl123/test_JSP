<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
<link rel="stylesheet" href="css/board.css">
<script type="text/javascript" src="script/board.js"></script>
</head>
<body>


<div id="wrap">
<h1>게시글 수정</h1>

<form action="BoardServlet" name="frm" method="post">

	<input type="hidden" name="command" value="board_update">
	<input type="hidden" name="num" value="${board.num }">
	<table>
	
	<tr>
	<th>작성자</th>
	<td><input type="text" name="name" required value="${board.name }" readonly="readonly"> * 필수</td>
	</tr>
	
	<tr>
	<th>비밀번호</th>
	<td><input type="password" name="pass" required> * 필수(게시물 수정, 삭세 시 필요합니다.)</td>
	</tr>
	
	<tr>
	<th>이메일</th>
	<td><input type="email" name="email" required value="${board.email }"></td>
	</tr>
	
	<tr>
	<th>제목</th>
	<td><input type="text" name="title" size="70" required value="${board.title }"> * 필수</td>
	</tr>
	
	<tr>
	<th>내용</th>
	<td><textarea name="content" rows="15" cols="70">${board.content }</textarea></td>
	</tr>
	</table>
	<br><br>
	
	<input type="submit" value="수정" onclick="return boardCheck()">
	<input type="reset" value="다시작성">
	<input type="button" value="목록" onclick="location.href='BoardServlet?command=board_list'">
	
</form>
</div>
</body>
</html>