<%@page import="upload.BoardDBBean"%>
<%@page import="upload.BoardDataBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>

    
<%
	// 업로드할 디렉토리 위치를 구해옴
	String path = request.getRealPath("upload");
	System.out.println("path:"+path);
	int size = 1024 * 1024;		// 첨부파일의 크기(단위:Byte) : 1MB
	
	// 첨부파일은 MultipartRequest 클래스로 객체를 생성하면서 업로드가 된다.
	MultipartRequest multi = 
				new MultipartRequest(request,
									path,			// 업로드할 디렉토리명
									size,			// 첨부파일의 크기 : 1MB
									"utf-8",		// 인코딩 타입 설정
					new DefaultFileRenamePolicy()	// 중복 문제 해결				
						);
	
	int num = Integer.parseInt(multi.getParameter("num"));
	String nowpage = multi.getParameter("page");
	
	
	String writer = multi.getParameter("writer");
	String subject = multi.getParameter("subject");
	String email = multi.getParameter("email");
	String content = multi.getParameter("content");
	String passwd = multi.getParameter("passwd");
	
	// 오리지널 파일명 : 클라이언트가 업로드한 파일명
	String upload0 = multi.getOriginalFileName("upload");
	
	// 실제 서버에 저장된 파일명
	String upload = multi.getFilesystemName("upload");
	
	BoardDataBean board = new BoardDataBean();		// usebean을 사용할수 없음
	board.setWriter(writer);
	board.setEmail(email);
	board.setSubject(subject);
	board.setContent(content);
	board.setPasswd(passwd);
	board.setIp(request.getRemoteAddr());	// 클라이언트의 아이피
//	board.setUpload(upload);		//첨부 파일을 수정하지 않으면 null값이 저장된다.
	
	BoardDBBean dao = BoardDBBean.getInstance();
	BoardDataBean old = dao.getContent(num);
	
	if(upload !=null){		// 사용자가 첨부파일을 수정한 경우
		board.setUpload(upload);
	}else{					// 수정하지 않아 null값이 들어있는 경우
		board.setUpload(old.getUpload());
	}

	// 비번 비교
	if(old.getPasswd().equals(passwd)){		// 비번 일치시
			
	int result = dao.update(board);			// insert SQL문 수행
	
	if(result == 1) {	
%>
		<script>
		alert("글수정 성공");
		location.href="list.jsp?page=<%=nowpage%>";
		</script>
<% } 
	
	}else{		//비번 불일치시
%>
		<script>
			alert("비번이 일치하지 않습니다.");
			history.go(-1);
		</script>
<% } %>
