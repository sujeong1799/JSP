<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- jstl의 라이브러리를 쓰겠습니다라는 의미 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL if</title>
</head>
<body>
	<!-- JSTL if 조건 -->
	<c:if test="true">
	<!--  test 조건이 참일경우에만 실행 -->
	true 이므로 실행되어야 한다.
	</c:if>
	
	
	<!-- Query String 방식 -->
	<a href="step3-if.jsp?age=20&nick=apple">step3-if 다시 호출</a>
	<br><br>
	이름 : ${param.nick } <br>
	나이 : ${param.age } <br>
	
	<!-- 나이가 5보다 크면 출력 -->
	~ 나이가 5보다 크면 출력합니다. ~<br>
	<c:if test="${param.age > 5}">
	나이 : ${param.age } <br>
	</c:if>
	
	<hr>
	
	<!-- 나이가 5보다 크고, 닉네임이 apple인 경우 출력 -->
	나이가 5보다 크고, 닉네임이 apple인 경우 출력 <br>
	<c:if test="${param.age > 5 && param.nick == 'apple'}">
	나이 : ${param.age }세, 이름 : ${param.nick } <br>
	</c:if>
	 
</body>
</html>