<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
</head>
<body
	style="background-image: url('/image/배경화면.png'); background-repeat: no-repeat; background-size: cover;">
	<nav class="navbar"
		style="background-color: #EFE6FF; border-bottom: 3px solid #E8D9FF;">
		<div class="container-fluid">
			<a class="navbar-brand" href="/">Hello ${ses.id } Bunnies♥</a>
			<ul class="nav justify-content-end">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="/brd/page">Bunnies Board</a></li>
				<li class="nav-item"><a class="nav-link" href="/mem/list">Bunnies
						List</a></li>
				<li class="nav-item"><a class="nav-link" href="/mem/modify">Bunnies
						edit</a></li>
				<li class="nav-item"><a class="nav-link" href="/mem/logout">logout</a>
				</li>
			</ul>
		</div>
	</nav>
	<div
		style="width: 700px; margin: 20px auto; border: 1px solid; background-color: white; border-radius: 10px">
		<br>
		<form action="/brd/edit" method="post" enctype="multipart/form-data">
			<table class="table" style="width: 600px; margin: 0px auto;">
				<thead class="table-group-divider">
				</thead>
				<tbody>
					<tr>
						<th>글번호</th>
						<td><input type="text" name="bno" value="${bvo.bno }"
							readonly="readonly"></td>
					</tr>
					<tr>
						<th>제목</th>
						<td><input type="text" name="title" value="${bvo.title }"></td>
					</tr>
					<tr>
						<th>작성자</th>
						<td>${bvo.writer}</td>
					</tr>
					<tr>
						<th>작성일</th>
						<td>${bvo.reg_date }</td>
					</tr>
					<tr>
						<th>조회수</th>
						<td>${bvo.read_count }</td>
					</tr>
					<tr>
						<th>내용</th>
						<td><textarea rows="3" cols="30" name="content">${bvo.content }</textarea></td>
					</tr>
					<tr>
						<th>파일첨부</th>
						<td><c:if test="${bvo.image_file ne null }">
								<img alt="없음" src="/_fileUpload/th_${bvo.image_file }">
							</c:if>
							<input type="hidden" name="image_file" value="${bvo.image_file }">
							<input type="file" name="new_file">
					</tr>
				</tbody>
			</table>
			<div align="center">
				<img alt="없음" src="/_fileUpload/${bvo.image_file }"
					style="width: 50%;">
			</div>
			<br>
			<div align="center">
				<button type="submit" class="btn btn-outline-primary">수정완료</button>
			</div>
		</form>
		<br>
	</div>
</body>
</html>