<%@ page contentType="text/html; charset=euc-kr" %>

<html>
	<head>
		<title>��Ű�� �����ϴ� ����</title>
	</head>

<%
   String cookieName = "id";
   Cookie cookie = new Cookie(cookieName, "totoro");
   
   cookie.setMaxAge(30);          // ��Ű�� ��ȿ �ð� ���� (����: ��)
   cookie.setValue("guardian");   // ��Ű �� ����
   response.addCookie(cookie);    // ��Ű ����
%>

	<body>
	<h2>��Ű�� �����ϴ� ����</h2>
	<P>

"<%=cookieName%>" ��Ű������ �Ǿ����ϴ�.<br>

		<input type="button" value="��Ű�� ����Ȯ��" onclick="javascript:window.location='useCookie.jsp'">
	</P>
	</body>
</html>