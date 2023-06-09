$(document).ready(function(){
	$("#Comment").click(function(){
		alert("insert 들어오기 성공");
		tourist_id = $("#tourid").val();
		comment = $("#comment").val();
		$.ajax({
			url:"/guide/commentinsert",
			type:"POST",
			data:{
				tourist_id:tourist_id,
				comment_content : comment
				},
			success:function(){
				console.log("댓글달기");
				location.reload();
			},
			error:function(){
				console.log("실패");
			}
		});
	});
});





