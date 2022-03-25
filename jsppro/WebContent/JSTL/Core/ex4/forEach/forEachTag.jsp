<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    java.util.HashMap mapData = new java.util.HashMap();
    mapData.put("name", "최범균");	// 키값, value값
    mapData.put("today", new java.util.Date());
%>

<c:set var="intArray" value="<%= new int[] {1,2,3,4,5} %>" />
<c:set var="map" value="<%= mapData %>" />
<html>
<head><title>forEach 태그</title></head>
<body>

<h4>1부터 100까지 홀수의 합</h4>
<c:set var="sum" value="0" />
<c:forEach var="i" begin="1" end="100" step="2">
<c:set var="sum" value="${sum + i}" />
</c:forEach>
결과 = ${sum}

<h4>구구단: 4단</h4>
<ul>
<c:forEach var="i" begin="1" end="9">
   <li>4 * ${i} = ${4 * i}
</c:forEach>
</ul>

<h4>int형 배열</h4>

<c:forEach var="i" items="${intArray}" begin="2" end="4">
    [${i}]
</c:forEach>

<h4>Map</h4>

<c:forEach var="i" items="${map}">
    ${i.key} = ${i.value}<br>
</c:forEach>
<br><br>
<%
	List list = new ArrayList();
	list.add("자바");
	list.add("웹표준");
	list.add("JSP");
	list.add("오라클");
	list.add("스프링");
	list.add("파이썬");
	list.add("텐서플로우");
	
	request.setAttribute("slist", list);		//공유 설정

%>

<!-- 방법1. -->
<c:forEach var="s" items="${slist}">
   ${s} <br>
</c:forEach>
<br><br>

<%
	List li = (List) request.getAttribute("slist");

	for(int i=0; i<li.size(); i++){
		String str = (String) li.get(i);
		out.println(str + "<br>");
	}
%><br><br>

<!-- 방법2. -->
<c:set var="s1" value="<%=list %>"/>
<c:forEach var="s2" items="${s1}">
  ${s2 }<br>
</c:forEach> 





</body>
</html>
