<%@ page contentType="text/html; charset=euc-kr" %>
<% request.setCharacterEncoding("euc-kr");%>
<%@ page import="javaBean.SimpleBean" %>

<%
	SimpleBean sb1 = new SimpleBean();
//	sb1.msg = "hi";
	sb1.setMsg("안녕");

%>


<jsp:useBean id="sb" class="javaBean.SimpleBean" /> <!-- 자바빈 클래스로 객체 생성/ 패키지명.클래스명/import를 할 필요가 없다 -->
<jsp:setProperty property="*" name="sb"/> <!-- 이름값이 일치가 되는 set메소드의 값을 모두 전달한다 -->

<%-- <jsp:setProperty name="sb" property="msg" /> 
<!-- usebean의 id값을 name값으로 설정 프로퍼티는 java파일의 프로퍼티와 동일 -->
<jsp:setProperty property="name" name="sb"/> --%>

<html>
	<body>

	<h1>간단한 자바빈 프로그래밍</h1>
	<br>
	이름 : <%=sb.getName() %> <br>
	이름 : <jsp:getProperty property="name" name="sb"/>  <br>
	
	
	메세지 : <%=sb.getMsg() %> <br>
	메시지: <jsp:getProperty name="sb" property="msg" />
	<!-- usebean의 id값을 name값으로 설정 프로퍼티는 java파일의 프로퍼티와 동일 -->

	</body>
</html>