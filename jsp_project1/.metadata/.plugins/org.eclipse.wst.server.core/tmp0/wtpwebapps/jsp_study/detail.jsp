<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품 상세정보</h1>
	<table border="1">
		<tr align="center">
			<th>번호 pno</th>
			<td>${pvo.pno }</td>
		</tr>
		<tr align="center">
			<th>상품명 pname</th>
			<td>${pvo.pname }</td>
		</tr>
		<tr align="center">
			<th>가격 price</th>
			<td>${pvo.price }</td>
		</tr>
		<tr align="center">
			<th>등록일자 regdate</th>
			<td>${pvo.regdate }</td>
		</tr>
		<tr align="center">
			<th>세부내용 madeby</th>
			<td>${pvo.madeby }</td>
		</tr>
	</table>
	<br>
	<a href="modify.pd?pno=${pvo.pno }"><button type="button">상품수정</button></a>
	<a href="remove.pd?pno=${pvo.pno }"><button type="button">상품삭제</button></a>
	<a href="list.pd"><button>상품목록가기</button></a>

</body>
</html>