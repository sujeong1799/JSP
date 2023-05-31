<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body style="background-image: url('/image/배경화면.png'); background-repeat: no-repeat; background-size: cover;">
	<br>
	<div align="center" style="background-color: white; border: 1px solid; width: 400px; height: 300px; border-radius: 20px; margin: 150px auto;">
		<form action="/mem/login_auth" method="post">
			<div style="width: 350px; height: 150px">
					<div class="input-group mb-3" style="margin-top: 20px">
						<input type="text" name="id" class="form-control"
							aria-label="Sizing example input"
							aria-describedby="inputGroup-sizing-default"
							placeholder="아이디를 입력해주세요." style="margin-top: 40px">
					</div>
					<div class="input-group mb-3" style="margin-top: 20px">
						<input type="password" name="password" class="form-control"
							aria-label="Sizing example input"
							aria-describedby="inputGroup-sizing-default"
							placeholder="비밀번호를 입력해주세요." style="margin-top: 20px">
					</div>
					<br>
					<button type="submit" class="btn btn-outline-primary">로그인</button>
			</div>
		</form>
	</div>
</body>
</html>