<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<h1>Login Page</h1>
<form action="/mem/login_auth" method="post">
ID : <input type="text" name="id"><br>
PassWord : <input type="password" name="password"><br>
<button type="submit">login</button>
</form>

</body>
</html>