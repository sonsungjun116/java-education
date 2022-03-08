<%@ page contentType="text/html; charset=euc-kr" %>

<html>
	<head>
		<title>쿠키를 생성하는 예제</title>
	</head>

<%
   String cookieName = "id";
   Cookie cookie = new Cookie(cookieName, "totoro");
   
   cookie.setMaxAge(30);          // 쿠키의 유효 시간 설정 (단위: 초)
   cookie.setValue("guardian");   // 쿠키 값 수정
   response.addCookie(cookie);    // 쿠키 발행
%>

	<body>
	<h2>쿠키를 생성하는 예제</h2>
	<P>

"<%=cookieName%>" 쿠키가생성 되었습니다.<br>

		<input type="button" value="쿠키의 내용확인" onclick="javascript:window.location='useCookie.jsp'">
	</P>
	</body>
</html>