<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table border=1 width=800 align=center>
		<caption>판매 내역</caption>
		<tr>
			<td>번호</td>
			<td>판매 번호</td>
			<td>회원아이디</td>
			<td>도서번호</td>
			<td>도서명</td>
			<td>판매가격</td>
			<td>주문수</td>
			<td>판매날짜</td>
			<td>판매금액</td>
			
		</tr>

		<c:set var="total" value="0"/>
		<c:set var="num" value="${listcount - (page-1) * 10 }" />
		<c:forEach var="b" items="${salelist}">
			<!--request객체로 공유해야 items에 공유 값을 입력하여 사용 할 수 있다.  -->
			<tr>
				<td>${num}
					<c:set var="num" value="${num-1}" />
				</td>
				<td>${b.sale_num}</td>
				<td>${b.member_id}</td>
				<td>${b.book_num}</td>
				<td>${b.book_name}</td> 
				<td>${b.book_price}</td>				
				<td>${b.sale_qty}</td>
				<td><fmt:formatDate value="${b.sale_date}"
						pattern="yyyy-MM-dd HH:mm:ss EEE요일" /></td>
				<td>${b.sale_qty * b.book_price}</td>
			</tr>
			<c:set var="t" value="${b.sale_qty * b.book_price}"/>
			<c:set var="total" value="${total + t}"/>
			
		</c:forEach>
		
		<tr>
			<td  colspan=8>총판매금액</td>
			<td>${total}</td>
		</tr>



	</table>
	<br><br><br>
	
	<input type="button" value="확인">
	<input type="button" value="취소">
</body>
</html>