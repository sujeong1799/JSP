<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
	<h1>
		Hello world..
	</h1>
	
	<%-- .pd를 쓰면 productController로 보내겠다는 의미, 
	모든 jsp 파일은 컨트롤러에 갔다가 컨트롤러 처리를 받고 jsp로 갈거임 --%>
	
	<a href="register.pd">상품등록 페이지로 이동</a>
	<br>
	<a href="list.pd">상품 리스트로 이동</a>
	
	
</body>
</html>