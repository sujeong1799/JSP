<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- step5-from.jsp : 이름과 나이를 입력받기 step5-action.jsp로 전송 -->
	
	
	<!-- action에 어쩌구저쩌구.jsp만 해줘도 form내용이 그대로 넘어감 name=? age =? 안해도 됨  -->
	<form action="step5-action.jsp">
	이름 : <input type="text" name="name"><br>
	나이 : <input type="text" name="age"><br>
	<input type="submit" value="전송">
	</form>
	
</body>
</html>