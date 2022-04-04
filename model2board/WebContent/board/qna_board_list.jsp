<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- el사용 -->
<a href="./BoardForm.do">글작성</a> <br>
글갯수 : ${listcount} 개 <br> <!-- 서비스인 BoardListAction에서 request로 전달 받아서 사용이 가능하다 -->

<!-- el사용하지 않음 -->
<%
	int count = ((Integer)request.getAttribute("listcount")).intValue();
				/* 공유 받을때는 object형이기 때문에 형변환을 해주어야 한다. 다운캐스팅 */
%>
글갯수 : <%=count%> 개 <br>

<table border=1 width=700 align="center">
	<caption>게시판 목록</caption>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>날짜</th>
		<th>조회수</th>
	</tr>
	
	<c:set var="num" value="${listcount - (page-1) * 10 }" />	
	<c:forEach var="b" items="${boardlist}"> <!--request객체로 공유해야 items에 공유 값을 입력하여 사용 할 수 있다.  -->
	<tr>
		<td>${num}
			<c:set var="num" value="${num-1}" />
		</td>
		<td>
			<!-- 댓글 제목 앞에 여백 처리 -->
			<c:if test="${b.board_re_lev > 0}"> <!-- 댓글이라면 -->
				<c:forEach var="i" begin="0" end="${b.board_re_lev}">
					&nbsp;
				</c:forEach>
			</c:if>		
			
<a href="./BoardDetailAction.do?board_num=${b.board_num}&page=${page}">	<!-- 페이지값을 같이 보내야 게시판 페이지에서 이전페이지로 이동이 가능하다 -->
			${b.board_subject}			
			</a>	
		</td>
		<td>${b.board_name}</td>
		<td>
			<fmt:formatDate value="${b.board_date}"
							pattern="yyyy-MM-dd HH:mm:ss EEE요일"/>
		</td>
		<td>${b.board_readcount}</td>
	</tr>	
	</c:forEach>
	


</table>  <br><br>

<!-- 페이지 처리 -->
<center>
<c:if test="${listcount > 0}">

<!-- 1페이지로 이동 -->
<a href="./BoardListAction.do?page=1" style="text-decoration:none"> << </a>

<!-- 이전 블럭으로 이동 -->
<c:if test="${startPage > 10}">
	<a href="./BoardListAction.do?page=${startPage-10}">[이전]</a>
</c:if>

<!-- 각 블럭에 10개의 페이지를 출력 -->
<c:forEach var="i" begin="${startPage}" end="${endPage}">
	<c:if test="${i == page}">	<!-- 현재 페이지 -->
		[${i}]
	</c:if>
	<c:if test="${i != page}">	<!-- 현재 페이지가 아닌 경우 -->
		<a href="./BoardListAction.do?page=${i}">[${i}]</a>
	</c:if>
</c:forEach>

<!-- 다음 블럭으로 이동 -->
<c:if test="${endPage < pageCount}">
	<a href="./BoardListAction.do?page=${startPage+10}">[다음]</a>
</c:if>

<!-- 마지막 페이지로 이동 -->
<a href="./BoardListAction.do?page=${pageCount}" 
	style="text-decoration:none"> >> </a>	

</c:if>
</center>










