<%@ page contentType="text/html; charset=utf-8" %>


<html>
<head>
	<title>게시판</title>
	<link href="style.css" rel="stylesheet" type="text/css">
	<script src="http://code.jquery.com/jquery-1.11.1.js"></script>
	<script src="check.js"></script>
</head>   

 
<center>게시판</center>
<form method="post" name="writeform" action="board.jsp">

<table width="430" border="1" cellspacing="0" cellpadding="0"  align="center">
   
   <tr>
    <td  width="100"   align="center"><b>제목</b></td>
    <td  width="330">
       <input type="text" size="20" maxlength="10" id="title" name="title"></td>
  </tr>
  <tr>
    <td  width="100"  align="center" ><b>작성자</b></td>
    <td  width="330">    
       <input type="text" size="20" maxlength="50" id="name" name="name"></td>	
  </tr>
  <tr>
    <td  width="100"   align="center"><b>비밀번호</b></td>
    <td  width="330">
       <input type="text" size="20" maxlength="30" id="password" name="password" ></td>
  </tr>
  <tr>
    <td  width="100"  align="center" ><b>내 용</b></td>
    <td  width="330" >
     <textarea id="content" name="content" rows="13" cols="40"></textarea> </td>
  </tr>
  
<tr>      
 <td colspan=2  align="center"> 
  <input type="submit" value="확인" >  
  
</td></tr></table>   
   
</form>      
</body>
</html>
