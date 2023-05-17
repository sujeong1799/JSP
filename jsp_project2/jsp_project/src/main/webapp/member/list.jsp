<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>

	<table border="1">

		<thead>
			<tr align="center">
				<th>id</th>
				<th>email</th>
				<th>age</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="list">
				<tr align="center">
					<td>${list.id }</td>
					<td>${list.email }</td>
					<td>${list.age }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>