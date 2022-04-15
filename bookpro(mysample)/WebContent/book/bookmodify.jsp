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
<%@ include file="/share/header.jsp" %>  
</head>
<body>

<c:set var="b" value="${book}" />

<form method="post" action="<%=request.getContextPath() %>/BookModifyAction.pdo" enctype="multipart/form-data">
<input type="hidden" name="book_num" value="${b.book_num}">
<input type="hidden" name="page" value="${page}">
	<table align="center" border=1 width=500>
		<caption>상품수정</caption>
		<tr>
			<th>도서제목</th>
			<td><input type="text" name="book_name" id="book_name" value="${b.book_name}"></td>
		</tr>
		<tr>
			<th>도서저자</th>
			<td><input type="text" name="book_author" id="book_author" value="${b.book_author}"></td>
		</tr>
		<tr>
			<th>도서가격</th>
			<td><input type="text" name="book_price" id="book_price" value="${b.book_price}"></td>
		</tr>
		<tr>
			<th>도서재고량</th>
			<td><input type="text" name="book_stock" id="book_stock" value="${b.book_stock}"></td>
		</tr>
		<tr>
			<th>도서출판사</th>
			<td><input type="text" name="book_pb" id="book_pb" value="${b.book_pb}"></td>
		</tr>
		<tr>
			<th>도서카테고리</th>
			<td><input type="text" name="book_category" id="book_category" value="${b.book_category}"></td>
		</tr>
		<tr>
			<th>도서파일</th>
			<td><input type="file" name="book_img" id="book_img" value="${b.book_img}"></td>
		</tr>
		<tr>
			<th>도서내용</th>
			<td>
				<textarea id="book_content" name="book_content" rows="6" cols="50">${b.book_content}</textarea>
			</td>
		</tr>
		<tr align="center">
			<td colspan=2>
				<input type="submit" value="수정등록">
				<input type="reset" value="취소">	
			</td>
		</tr>
	</table>
</form>
<%@ include file="/share/footer.jsp" %>  
</body>
</html>