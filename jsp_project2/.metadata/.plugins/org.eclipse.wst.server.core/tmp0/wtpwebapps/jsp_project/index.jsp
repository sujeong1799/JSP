<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">
	
	<h1>로그인 페이지입니당</h1>
	
	<%-- 
		비교표현식
		ne  = not equal
		eq = equal	
		
		ses.id가 null이 아니라면 밑에 정보 뜸.
	 --%>
	 

	<c:choose>
	<c:when test="${ses.id ne null }">
		${ses.id }님이 login 하셨습니다. <br>
		${ses.id }님은 ${ses.age }세 입니다.<br>
		계정생성일 : ${ses.reg_date } <br>
		마지막접속 : ${ses.last_login }<br><br>
	<a href="/mem/modify"><button>회원정보수정</button></a>
	<a href="/mem/list"><button>회원정보리스트</button></a>
	<br><br>
	<a href="/board/register.jsp"><button>게시글 작성</button></a>
	<a href="/brd/list"><button>글 목록 보기</button></a>
	<br><br><hr><br>
	<a href="/mem/logout" ><button>로그아웃</button></a>
	<br><br>
	<a href="/mem/delete" ><button>회원탈퇴</button></a>
	</c:when>
	<c:when test="${ses.id eq null }">
	<a href="/mem/login"><button>login</button></a>
	<a href="/mem/join"><button>join</button></a>
	</c:when>
	</c:choose>
	
	
</body>

<script type="text/javascript">
// 컨트롤러가 index로 보내는 객체가 있음 -> 로그인 값이 0일때
// c:out 값을 가져오겠다. 문자로 받아옴
const msg_login = `<c:out value="${msg_login}" />`;
console.log(msg_login);
// 문자 0이랑 비교
if(msg_login === '0'){
	alert("로그인 정보가 올바르지 않습니다.");
}
</script>
</html>