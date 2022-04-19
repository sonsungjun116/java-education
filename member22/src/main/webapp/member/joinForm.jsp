<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<h2>회원가입</h2>
<form action="joinPro.jsp"><!-- 생략했으므로 기본전송방식 get으로 전송, required속성은 값을 반드시 입력해야 함-->
	아이디 : <input type="text" name="id" required="required"><p>
	암호 : <input type="password" name="password" required="required"><p>
	<input type="submit" value="확인">
</form>
</body>
</html>