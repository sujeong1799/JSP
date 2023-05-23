<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>소원 수정 페이지</title>
</head>
<body>

	<form action="/brd/edit?bno=${bvo.bno }" method="post">
		<table class="table table-bordered">
			<thead>
				<h1>D-DAY</h1>
			</thead>
			<tbody>
				<tr>
					<td>소원번호</td>
					<td>${bvo.bno }</td>
					<td>소원제목</td>
					<td><input type="text" name="title" value="${bvo.title }"></td>
				</tr>
				<tr>
					<td>ㄱㅆㅇ</td>
					<td>${bvo.writer }</td>
					<td>등록날짜</td>
					<td>${bvo.reg_date }</td>
				</tr>
				<tr>
					<td>조회수</td>
					<td>${bvo.read_count }</td>
					<td>조아요</td>
					<td>${bvo.like_count }</td>
				</tr>
				<tr>
					<td>소원내용</td>
					<td colspan="3"><input name="content" value="${bvo.content }" ></td>
				</tr>
			</tbody>
		</table>
	<div align="center">
	<button type="submit">수정완료</button>
	</div>
	</form>

</body>
</html>