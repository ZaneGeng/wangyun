$(function(){
	
	$(".loginInput").blur(function(){
		$("p#login#").show();
	});
	$(".loginInput").focus(function(){
		$("p#login#").hide();
	});
	
});