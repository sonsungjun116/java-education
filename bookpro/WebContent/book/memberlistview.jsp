<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/admin_view.css" rel="stylesheet" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="header.jsp" %>
</head>
<body>

<form method="post" action="#">
	<table border=1 width=400 align="center">
		<tr>
			<th>회원관리번호</th>
			<th>회원아이디</th>
			<th>회원등급</th>
			<th>마일리지</th>			
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</table>
</form>

<%@ include file="footer.jsp" %>
</body>
</html>