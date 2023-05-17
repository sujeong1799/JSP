<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>

<div align="center">
<form action="/mem/login_auth">
아이디<br>
<input type="text" name="id" placeholder="아이디를 입력해주세요."><br><br>
비밀번호<br>
<input type="text" name="password" placeholder="비밀번호를 입력해주세요.">
<br><br>
<button type="submit">login</button>
</div>

</form>

</body>
</html>