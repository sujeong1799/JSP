<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail</title>
</head>
<body>

	<br>
	<table class="table table-striped">
		<tr align="center">
			<th>글번호</th>
			<td>${bvo.bno }</td>
		</tr>
		<tr align="center">
			<th>제목</th>
			<td>${bvo.title }</td>
		</tr>
		<tr align="center">
			<th>글쓴이</th>
			<td>${bvo.writer }</td>
		</tr>
		<tr align="center">
			<th>작성일자</th>
			<td>${bvo.reg_date }</td>
		</tr>
		<tr align="center">
			<th>조회수</th>
			<td>${bvo.count }</td>
		</tr>
		<tr align="center">
			<th>내용</th>
			<td>${bvo.content }</td>
		</tr>
	</table>
	<div align="center">
	<a href="/brd/modify?bno=${bvo.bno }"><button type="submit">수정</button></a>
	<a href="/brd/remove?bno=${bvo.bno }"><button type="submit">삭제</button></a>
	<a href="/brd/list"><button>뒤로가기</button></a>
	</div>
</body>
</html>