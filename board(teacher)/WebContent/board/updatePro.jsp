<%@page import="board.BoardDataBean"%>
<%@page import="board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
%> 

<jsp:useBean id="board" class="board.BoardDataBean"/>
<jsp:setProperty property="*" name="board"/>

<%
	String nowpage = request.getParameter("page");

	BoardDBBean dao = BoardDBBean.getInstance();
	BoardDataBean old = dao.getContent(board.getNum());
	
	// 비번 비교
	if(old.getPasswd().equals(board.getPasswd())){	// 비번 일치시
		int result = dao.update(board);	// update SQL문 실행
	
		if(result == 1){
%>   		
			<script>
				alert("글수정 성공");
				<%-- location.href="list.jsp?page=<%=nowpage%>"; --%>
				location.href="content.jsp?num=<%=board.getNum()%>&page=<%=nowpage%>";
			</script>
<%		}
	}else{ 	// 비번 불일치시  %>
			<script>
				alert("비번이 일치하지 않습니다.");
				history.go(-1);
			</script>
<%	} %>
