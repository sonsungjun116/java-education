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
홍길동님
<table border=1 width=1200 align=center>
	<caption>내 구매 내역</caption>
	
	<tr><td>구매정보</td>
		
		 <td>물품번호(num)</td>
		 <td>주문번호(num)</td>
		 <td>상품name(varchar2)</td>		
		 <td>구매날짜(timestamp)</td>
		 <td>구매수량(num)</td>
		 <td>상품가격(num))</td>
		 </tr>
	<tr>
	<td>항목1</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>		
	</tr>	 
	<tr>
	<td>항목2</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>		
	</tr>	 	
		 
</table>
<br><br><br>
누적총액 : 100,000원 입니다.
<br><br>
<input type="button" value="확인">
<input type="button" value="취소">

</form>


</body>
</html>