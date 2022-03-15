<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="board.BoardDBBean"%>
<%@page import="board.BoardDataBean"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>

<%
	// 1. 한 화면에 출력할 데이터 갯수
	int page_size = 10;

	String pageNum = request.getParameter("page");
	if(pageNum == null){
		pageNum = "1";		// 1 page : 최근글이 보이는 페이지
	}

	// 2. 현재 페이지 번호
	int currentPage = Integer.parseInt(pageNum);
	
	// startRow : 각 page에 출력할 데이터의 시작번호
	//	endRow : 각 page에 출력할 데이터의 끝번호
	// page = 1 : startRow=1, endRow=10
	// page = 2 : startRow=11, endRow=20
	// page = 3 : startRow=21, endRow=30
	int startRow = (currentPage - 1) * page_size +1;
	int endRow = currentPage * page_size;
	
	//3. 총 데이터 갯수
	int count = 0;
	
	BoardDBBean dao = BoardDBBean.getInstance(); // sql문을 검색해야 하기때문에 dao생성
	count = dao.getCount();	// dao변수안에 getcount라는 함수 만듬
	System.out.println("count"+ count);
	
	List<BoardDataBean> list = null;
	if(count > 0){
		list = dao.getList(startRow, endRow);	// 게시판 목록
	}
	System.out.println("list"+ list);
	
	
	if(count == 0) {
%>
		작성된 글이 없습니다.
		
<% }else{ %>
		
		<a href="writeForm.jsp">글작성</a>	글갯수: <%=count %>
		<table border=1 width=700 align=center>
			<caption>게시판 목록</caption>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
				<th>IP주소</th>
			</tr>
<%
		SimpleDateFormat sd = 
			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		//number : 각 페이지에 출력될 시작 번호
		int number = count - (currentPage-1) * page_size;
// 1page : number = 247 - (1-1) * 10 = 247
// 2page : number = 247 - (2-1) * 10 = 237

		for(int i=0; i<list.size(); i++){
			BoardDataBean board = (BoardDataBean)list.get(i); // 괄호는 위에서 제너릭 처리를해서 생략해도 된다
%>		<tr>	
			<td><%=number-- %></td>
			<td><%=board.getSubject() %></td>
			<td><%=board.getWriter() %></td>
			<td><%=sd.format(board.getReg_date()) %></td>
			<td><%=board.getReadcount() %></td>
			<td><%=board.getIp() %></td>
		</tr>
		
<% 		} // for end
%>	
				
		</table>
		
		
		
<% } %>

<!-- 페이지 링크 설정 -->
<center>
<%
if(count > 0) {
	//	pageCount : 총페이지 수
	int pageCount=count/page_size+((count%page_size==0)?0:1); //10의배수면 0 그렇지 않으면 1page증가
	System.out.println("pageCount:" + pageCount);
	
	// startPage : 각 블럭의 시작 페이지 번호 : 1, 11, 21...
	// endPage : 각 블럭의 끝 페이지 번호 : 10, 20, 30...
	int startPage = ((currentPage-1)/10) * 10 + 1;
	int block = 10;	// 1개의 블럭의 크기 : 10개의 페이지로 구성
	int endPage = startPage + block -1;
	
	
}

%>


</center>


</body>
</html>