<%@page import="member.MemberDAO"%>
<%@page import="member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%
		request.setCharacterEncoding("utf-8"); 
 %>
 
 <jsp:useBean id="member" class="member.MemberDTO"/>
 <jsp:setProperty property="*" name="member"/>
 
 <%
 	String[] hobby = request.getParameterValues("hobby");
 	
 	// 취미를 하이픈(-)을 붙여서 저장 : ex) 공부-게임-등산-	
	String h ="";				// h = "공부-게임-등산-"
 	for(String h1 : hobby){
 		h += h1 + "-";
 	}
 	member.setHobby(h);
 	
 	MemberDAO dao = MemberDAO.getInstance();
 	
 	// 한 사람의 상세정보 구하기
 	MemberDTO old = dao.getMember(member.getId());
 	
 	// 비번 비교
 	if(old.getPasswd().equals(member.getPasswd())){ // old는 데이터베이스 member는 새로 입력한 값
 		int result = dao.update(member);	// update SQL문 실행
 		
 		if(result ==1 ){
 %>
 	<script>
 		alert("회원정보 수정 성공");
 		location.href="main.jsp";
 	</script>
 	
 <%		}
 		}else{   // 비번 불일치시 %>
		<script>
			alert("비밀번호가 일치하지 않습니다.");
			history.go(-1);
		</script>
 
 <% } %>
 