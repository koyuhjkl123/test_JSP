<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%!

	String str = "안녕하세요!";
	int a = 100;
	int b = -100;
	
	
	public int abs(int n){
		if(n < 0){
			n = - n;
		}
		return n;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현식 사용 예제</title>
</head>
<body>

<%= str %><br>
<%= a %>의 절대값 : <%= abs(a) %> <br>
<%= b %>의 절대값 : <%= abs(b) %>

</body>
</html>