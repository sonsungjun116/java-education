<%@page import="reboard.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
		request.setCharacterEncoding("utf-8");    
%>

<jsp:useBean id="board" class="reboard.BoardDataBean"/>
<jsp:setProperty property="*" name="board"/>

<%
		// 클라이언트의 IP주소를 구해옴
		String ip = request.getRemoteAddr();
		board.setIp(ip);
		
		BoardDBBean dao = BoardDBBean.getInstance();
		int result = dao.insert(board);		// 원문 글작성 dto객체의 board가 매개변수 역할
		
		if(result == 1) {			
%>
		<script>
			alert("글작성 성공");
			location.href="list.jsp";
		</script>

<%}else{ %>
		<script>
			alert("글작성 실패");
			history.go(-1);
		</script>

<%} %>


