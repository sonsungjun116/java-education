
/*$(document).ready(function() {
	
	alert("주문취소가 완료 되었습니다.");
	
	
	$("#ordercancel").click(function(){
    	alert("주문취소가 완료 되었습니다.");
        return false;
    }); 
});
*/



$(document).ready(function() { 
	$('button').click(function(){ 
		if($('#ordercancel').val()=='') { 
			alert('주문취소가 완료 되었습니다.'); 
			 
			}
	})
});

