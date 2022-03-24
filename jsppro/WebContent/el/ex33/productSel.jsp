<%@page import="jspbook.Product"%>
<%@ page language="java" contentType="text/html; charset=utf-8"%>

<html>
	<head>		
		<meta charset="utf-8">
		<title>EL 예제</title>
	</head>
	<body>
		<center>
		<H2>EL 예제-상품선택</H2>
		<HR>
		
		
		<!-- 표현언어로 출력 -->
		1. 선택한 상품은 : ${param.sel} <br>
		
		
		
		<!-- 표현식 태그로로 출력 -->
		1. 선택한 상품은 : <%=request.getParameter("sel") %> <br>


		<!-- 표현언어로 출력 >>dto객체.메소드(필드명으로 써도 됨) 원래라면 product.getNum이여야 한다. -->
		2. num1 + num2 = ${product.num1+product.num2} <br>
		
		<!-- 표현식 태그로 출력 -->
<%
		Product pro = (Product)session.getAttribute("product");
		/* attribute는 object를 상속하기 때문에 다운캐스팅 표현식을 써야 한다 (product) */
		
%>		
		2. num1 + num2 = <%=pro.getNum1() + pro.getNum2() %>
		
		
		</center>
	</body>
</html>