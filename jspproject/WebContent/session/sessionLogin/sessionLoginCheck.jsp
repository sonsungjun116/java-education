<%@ page contentType = "text/html; charset=euc-kr" %>
<%
    String memberId = (String)session.getAttribute("MEMBERID");

	//���ǿ�����(3�� ������)
	// (���ǽ�) ? a : b
	// -> ���ǽ��� true�̸� a��, false�� b�� �����

    boolean login = (memberId == null) ? false : true;
%>

<html>
	<head><title>�α��ο��� �˻�</title></head>
	<body>

<%
    if (login) {		// �α����� ���
%>
		<%=memberId %>�� ȯ�� �մϴ�. <br>
		
		<a href="sessionLogout.jsp">�α׾ƿ�</a> <br>

               ���� ���� <br>		
		
<%
    } else {			// �α����� ���� ���� ���
%>
		�α������� ���� ���� <br><br>
		
		<a href="sessionLoginForm.jsp">�α���</a> <br>
		
		<a href="../../request/member/memberform.html">ȸ������</a> <br>
<%
    }
%>

	</body>
</html>
