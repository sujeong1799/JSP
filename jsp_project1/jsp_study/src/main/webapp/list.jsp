<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
	<h1>Product List Page</h1>
	
	<%-- 컨트롤러에서 뿌린다..? form 필요없고 태그라이브러리 필요하대 --%>
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>상품명</th>
				<th>등록일</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${list }" var="pvo">
				<tr>
					<td>${pvo.pno }</td>
					<%-- detail만들때 a태그를 달고 넘어가야한대;;;; --%>
					<td> <a href="detail.pd?pno=${pvo.pno }">${pvo.pname }</a></td>
					<td>${pvo.regdate }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<a href="register.pd"><button type="button">상품등록</button></a>
	<a href="index.jsp"><button type="button">처음으로</button></a>
</body>
</html>