<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- header 파일 불러오기 -->
<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--
method : 값을 전달하는 방식을 설정 : get, post
action : 값이 전달될 파일을 설정

  -->
<form method="post" action="login.jsp">
<table border=1 width=350 align=center>
<caption>로그인</caption>
<tr>
	<td>ID</td>
	<td><input type=text size=20 maxlength=10
						 autofocus="autofocus"
						 required="required"
						 name="id"
						 id="id"
								>
	</td>
</tr>
<tr>
	<td>비밀번호</td>
	<td><input type=password size=20 name="passwd"
									 id="passwd"
									 required="required"		
								></td>
</tr>
	<td colspan=2 align=center>
	<input type=submit value="로그인"><!-- 전송기능이 있는 버튼 -->
	<input type=reset value="취소">	<!-- 초기화 -->
	
	</td>


</table>

</form>
</body>
</html>
<br><br>
<!-- footer 파일 불러오기 -->
<%@ include file="footer.jsp" %>