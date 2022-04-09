<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table align="center">
	<caption>메인 페이지</caption>
	<tr>
		<td><input type="text" name="member_id" id="member_pw" placeholder="아이디"></td>
		<td><input type="button" name="client" id="client" value="클라 로그인"
			onClick="location.href='MemberView.jsp'">
	</tr>
	<tr>
		<td><input type="text" name="member_pw" id="member_pw" placeholder="비밀번호"></td>
		<td><input type="button" name="admin" id="admin" value="관리자 로그인"
			onClick="location.href='login_admin.jsp'">
	</tr>
</table>

</body>
</html>