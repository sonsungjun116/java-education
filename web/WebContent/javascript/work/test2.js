$(document).ready(function(){
	
	
	$("form").submit(function(){
	
		if($("#sel").val() ==""){
			alert("구구단을 선택하세요.");
			$("#sel").focus();
			return false;	
		}
	
	});	
});
