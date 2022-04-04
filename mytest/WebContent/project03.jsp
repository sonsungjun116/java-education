<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>

<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
	function openDaumPostcode() {
		new daum.Postcode({
			oncomplete : function(data) {
				// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
				// 우편번호와 주소 정보를 해당 필드에 넣고, 커서를 상세주소 필드로 이동한다.
//				document.getElementById('join_zip1').value = data.postcode1;
//				document.getElementById('join_zip2').value = data.postcode2;
				document.getElementById('post').value = data.zonecode;
				document.getElementById('address').value = data.address;
				
			}
		}).open();
	}
</script>


<!-- 외부 자바스크립트 파일 불러오기 -->
<script src="<%=request.getContextPath() %>/member/member.js"></script>

</head>
<body>

<form method="post" action="<%=request.getContextPath() %>/MemberInsert.do"> 
회원관리
<br><br>

 ex) 마일리지 = 상품구매금액 * 0.01
 <br>
 ex) 마일리지 1000점 이상이라면 회원등급은 실버

<table border=1 width=1000 align=center>
	<caption>회원관리</caption>
	
	<tr><td>등급정보</td>
		<td>
		    <select id="email">
		    	<option value="">회원id 선택</option>
		    	<option value="naver.com">홍길동</option>
		    	<option value="daum.net">홍길동1</option>
		    	<option value="nate.com">홍길동2</option>
		    	<option value="gmail.com">홍길동3</option>
		    </select>		    
		 </td>
		 <td>회원name(varchar2)</td>
		 <td>회원등급(varchar2)</td>
		 <td>마일리지(num)</td>		
		 
		 </tr>
	
		 
</table>
<br><br><br>
선택된 회원의 등급은 실버 입니다.
<br><br>
<input type="button" value="확인">
<input type="button" value="취소">

</form>


</body>
</html>