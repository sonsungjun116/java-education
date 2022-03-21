<%@ page contentType = "text/html; charset=euc-kr" %>

<%
    session.invalidate(); // ¼¼¼Ç »èÁ¦ : ·Î±×¾Æ¿ô, È¸¿øÅ»Åð
%>

<html>
	<head><title>¼¼¼Ç Á¾·á</title></head>
	<body>

	<script>
		alert("·Î±×¾Æ¿ô");
		location.href = "../../index.jsp";
	</script>
	
	</body>
</html>