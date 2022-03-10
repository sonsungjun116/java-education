<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="JavaBeanMember.register.LogonDataBean" %>
<%@ page import="JavaBeanMember.register.LogonDBBean" %>
<%@include file="color.jsp" %>

<% 
  request.setCharacterEncoding("euc-kr");

  LogonDataBean	regBean1 = new LogonDataBean();
// regBean1.id="test";
%>

<jsp:useBean id="regBean" class="JavaBeanMember.register.LogonDataBean" />
<jsp:setProperty name="regBean" property="*" />

<%
	LogonDBBean manager = LogonDBBean.getInstance();

	LogonDataBean old = manager.updateForm(regBean.getId());
	
	if(old.getPasswd().equals(regBean.getPasswd())){	// 비번 일치시
		manager.update(regBean);		// update SQL문 실행
		
%>	
	<script>
		alert("회원수정 성공");
		location.href="list.jsp";
	</script>
	
<% }else{	// 비번 불일치 %>

	<script>
		alert("비밀번호가 일치하지 않습니다.");
		history.go(-1);
	</script>

<% } %>



