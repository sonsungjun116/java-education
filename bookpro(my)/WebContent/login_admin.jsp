<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 로그인</title>
</head>
<body>
<table width=400 align=center>
	<tr>
		<td><h2>관리자로그인</h2></td>
	</tr>
	<tr>
		<td><input type=text name="admin_id" id="admin_id" placeholder="관리자아이디"></td>
	</tr>
	<tr>
		<td><input type=text name="admin_pw" id="admin_pw" placeholder="관리자비밀번호"></td>
	</tr>
	<tr>
		<td><input type=button width=200 align=center 
		name="login_admin" id="login_admin" value="관리자로그인"
		onClick="location.href='AdminView.jsp'"></td>
	</tr>
</table>

</body>
</html>