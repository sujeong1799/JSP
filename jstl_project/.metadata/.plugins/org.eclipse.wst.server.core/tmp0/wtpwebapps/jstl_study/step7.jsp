<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- n~n까지 변수에 저장해라라는뜻 --%>
	<%-- <c:forEach begin="시작숫자" end="끝숫자" var = "변수"> --%>
	<c:forEach begin="1" end="10" var = "i">
	${i }<br>
	</c:forEach>

</body>
</html>