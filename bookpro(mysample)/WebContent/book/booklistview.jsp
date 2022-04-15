<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/share/header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/admin_view.css"
	rel="stylesheet" />
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
<table border=1 width=900 align="center">
	<caption>도서 목록</caption>
	<tr>
		<th>출력번호</th>
		<th>도서 번호</th>
		<th>저자</th>
		<th>도서명</th>
		<th>재고량</th>
		<th>판매량</th>
		<th>가격</th>
		<th>출판사</th>
		<th>카테고리</th>
		<th>등록일</th>
		<th>상품삭제</th>
	</tr>
	 <c:set var="num" value="${bookcount - (page-1) * 10 }" />
     <c:forEach var="b" items="${booklist}">
         <!--request객체로 공유해야 items에 공유 값을 입력하여 사용 할 수 있다.  -->
          <tr>
            <th>${num}
               <c:set var="num" value="${num-1}" />
            </th>
            <th><a href="<%=request.getContextPath() %>/BookModify.pdo?book_num=${b.book_num}&page=${page}">${b.book_num}</a></th>
            <th>${b.book_author}</th>
            <th>${b.book_name}</th>
            <th>${b.book_stock}</th> 
            <th>${b.book_count}</th> 
            <th>${b.book_price}</th>            
            <th>${b.book_pb}</th>
            <th>${b.book_category}</th>
            <th>
            <fmt:setLocale value="ko_kr"/>
            <fmt:formatDate value="${b.book_reg}"
                  pattern="yyyy-MM-dd HH:mm:ss EEE요일" /></th>
            <th><input type="button" value="상품삭제" 
            	onClick="location.href='<%=request.getContextPath()%>/BookDelete.pdo?book_num=${b.book_num}&page=${page}'"></th>
            <th>
            	<input type=button value="담기" onclick=
            	"location.href='./CartAdd.cdo?book_name=${b.book_name}&book_num=${b.book_num}&book_price=${b.book_price}'">
            </th> 	
         </tr>
         
     </c:forEach>
	
</table>

<!-- 페이지 처리 -->
<center>
<c:if test="${bookcount > 0}">

<!-- 1페이지로 이동 -->
<a href="./BookListAction.pdo?page=1" style="text-decoration: none"> << </a>

<!-- 이전 블록으로 이동 -->
<c:if test="${startPage > 10}">
<a href="./BookListAction.pdo?page=${startPage-10}" style="text-decoration: none"> [이전] </a>
</c:if>

<!-- 각 블럭에 10개의 페이지 출력 -->
<c:forEach var="i" begin="${startPage}" end="${endPage}">
	<c:if test="${i == page}">	<!-- 현재 페이지 -->
		[${i}]
	</c:if>
	<c:if test="${i != page}">	<!-- 현재 페이지가 아닌 경우 -->
		<a href="./BookListAction.pdo?page=${i}">[${i}]</a>
	</c:if>
</c:forEach>	
	
<!-- 다음 블럭으로 이동 -->
<c:if test="${endPage < pageCount }">
	<a href="./BookListAction.pdo?page=${startPage+10}" style="text-decoration: none">[다음]</a>
</c:if>
	
<!-- 마지막 페이지로 이동 -->
	<a href="./BookListAction.pdo?page=${pageCount}" style="text-decoration: none"> >> </a>


</c:if>


<br><br>

<center>
<form method=post action="./BookListAction.pdo">
	<select name="sel">
		<option value="">검색</option>
		<option value="book_author">저자</option>
		<option value="book_name">도서명</option>
		<option value="book_pb">출판사</option>
	</select>
	<input type=text name="find" id="find">
	<input type=submit value="검색">
</form>
</center>

<%@ include file="/share/footer.jsp" %>  
</body>
</html>