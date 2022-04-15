$(document).ready(function(){
	$("form").submit(function(){
		
		if($.trim($("#grade").val())==""){
			alert("grade를 정하세요");
			$("#grade").focus();
			return false;
		}
		
		if($("#mile1").val()=="" & $("#grade").val()!=""){
			$.ajax({
		         type:"post",
		         url:"/bookpro0411/MileChargeAction.managedo",
		         data:{"grade":grade},
		         datatype:"select",
		         success:function(data){
		
		         }})
		
		
		
		
		}
		
		
		
	});
});