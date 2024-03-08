<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
 <%
 
 int age = Integer.parseInt(request.getParameter("age"));
 
 if(age <= 19){
	%>
	<script type="text/javascript">
	alert("19세 미만이므로 입장이 불가합니다.")
	history.go(-1)
	</script>
	<%
 }else {
	 request.setAttribute("name", "한정교");
	 RequestDispatcher dispatcher = request.getRequestDispatcher("09_forwardResult.jsp");
	 dispatcher.forward(request, response);
 }
	%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포워드 처리</title>
</head>
<body>

</body>
</html>