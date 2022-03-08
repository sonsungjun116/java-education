<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("EUC-KR"); //인코딩 형식   
int sel = Integer.parseInt(request.getParameter("sel")); //input태그의 dan 을 int형으로 변환해서 저장

    %>



 <h3>구구단 <%=sel%>단 </h3> <br>

<% for(int i=1; i < 10; i++){ %> 
<%=sel %> * <%=i %> = <%=sel*i %><br>  
<%}%>