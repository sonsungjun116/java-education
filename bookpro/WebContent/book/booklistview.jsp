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
	<table border=1 width=500 align="center">
		<tr>
			<th>도서 번호</th>
			<th>저자</th>
			<th>도서명</th>
			<th>재고량</th>			
			<th>판매량</th>			
			<th>출판사</th>			
			<th>카테고리</th>			
			<th>등록일</th>			
		</tr>
		<tr>
			<td></td>
			<td></td>
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