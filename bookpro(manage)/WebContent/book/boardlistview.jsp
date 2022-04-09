<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/admin_view.css" rel="stylesheet" />
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>



<form method="post" action="#">
	<table border=1 width=800 align="center">
		<tr>
			<th>게시판 번호</th>
			<th>게시판 작성자</th>
			<th>게시판 제목</th>
			<th>게시판 작성일</th>			
			<th>게시판 조회수</th>			
			<th>게시판 답변체크</th>			
		</tr>
		<tr>
			<td></td>
			<td></td>
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