<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 일치 시 분기하기</title>
</head>
<body>

	<script>
		if(window.name == "update"){
			window.opener.parent.location.href = 
				"BoardServlet?command=board_update_form&num=${param.num}";
		}else if(window.name == "delete"){
			alert("삭제 성공");
			window.opener.parent.location.href = "BoardServlet?command=board_delete_form&num=${param.num}";
		}
		window.close();
	</script>

</body>
</html>