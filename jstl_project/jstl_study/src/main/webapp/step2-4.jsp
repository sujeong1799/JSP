<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 파라미터 연습 4</title>
</head>
<body>
<!-- EL 방식은 null 값은 출력되지 않음 -->
	메뉴 1 : ${paramValues.food[0] } <br>
	메뉴 2 : ${paramValues.food[1] } <br>
	메뉴 3 : ${paramValues.food[2] } <br>
	
</body>
</html>