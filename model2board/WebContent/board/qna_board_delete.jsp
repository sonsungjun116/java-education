<%@ page language="java" contentType="text/html; charset=utf-8"%>

<html>
<head>
	<title>게시판 삭제</title>
	<script src="http://code.jquery.com/jquery-latest.js"></script>
	<script src="<%=request.getContextPath() %>/board/script.js"></script>
</head>
<body>

board_num1 : <%=request.getParameter("board_num") %> <br>
page1 : <%=request.getParameter("page") %> <br>

board_num2 : ${param.board_num} <br>
page2 : ${param.page} <br>

<form action="<%=request.getContextPath() %>/BoardDelete.do" method="post">			<!-- enctype="multipart/form-data"가 있어야 첨부파일이 넘어감 -->
<input type="hidden" name="board_num" value="${param.board_num}">
<input type="hidden" name="page" value="${param.page}">

<table cellpadding="0" cellspacing="0" align=center border=1 width=300>
	<tr align="center" valign="middle">
		<td colspan="5">게시판 삭제</td>
	</tr>
		<tr>
		<td style="font-family:돋음; font-size:12" height="16">
			<div align="center">비밀번호</div>
		</td>
		<td>
			<input name="board_pass" id="board_pass" type="password" size="10" maxlength="10" 
				value=""/>
		</td>
	</tr>
	</tr>
	<tr bgcolor="cccccc">
		<td colspan="2" style="height:1px;">
		</td>
	</tr>
	<tr><td colspan="2">&nbsp;</td></tr>
	<tr align="center" valign="middle">
		<td colspan="5">			
			<input type=submit value="삭제">
			<input type=reset value="취소">
		</td>
	</tr>
</table>
</form>

</body>
</html>