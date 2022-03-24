<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="num1" value="${20}" />
<c:set var="num2">
10.5
</c:set>
<c:set var="today" value="<%= new java.util.Date() %>" />

<html>
	<head>
		<title>set 태그와 remove 태그</title>
	</head>

	<body>
		<%
			String str = "JSP변수";
			request.setAttribute("st", str);
		%>
		변수 : str1 = <%=str %> <br> <!-- 표현식 태그로 출력 -->
		변수 : str2 = ${str} <br> <!-- 그냥 el안에 들어가면 안됨 -->
		변수 : str3 = ${st} <br> <!-- request.setAttribute로 공유하고 값을 넣으면 출력됨 -->
	
	<!-- 아래의 코드는 ${st}와 같다. el의 간결한 처리를 보여줌 -->
		<%
			String s = (String) request.getAttribute("st");	
		%>
		변수 : str4 = <%=s %><br>
	
 <!-- el안에 들어가는것은 set으로 정의된 변수이거나 request객체로 공유한후 공유한 값을 넣으면 출력가능하다 -->		
		변수 num1 = ${num1} <br>
		변수 num2 = ${num2} <br>
		num1 + num2 = ${num1 + num2} <br>
		오늘은 ${today} 입니다.

		<c:remove var="num1" scope="page" />

		<p>
		삭제한 후의 num1 = ${num1} <br>
		삭제한 후의 num1 + num2 = ${num1 + num2}
	</body>
</html>
