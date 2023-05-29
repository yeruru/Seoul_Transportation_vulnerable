$("#file").on('change',function(){
  var fileName = $("#file").val();
  $(".upload-name").val(fileName);
});

$(document).ready(function() {
		var checked="N";
		$("#checknickname").click(function() {	
			$.ajax({
				url : 'nicknameCheck',
				type : 'get',
				data : {
					nickname : $("#nickname").val(),
					pw : '1234'
				},
				dataType : 'text', 
				success : function(responseData, status, xhr) {	
					console.log(responseData);
				
					var message = $("#idMessage");
					if(responseData=="사용가능"){
						message.css("color", "blue");
						checked = "Y";
					}else{
						message.css("color", "red");
						checked = "N";
					}				
					message.text(responseData);					
				},
				error : function(xhr, status, error) {
				    console.log("code: " + request.status)
        			console.log("message: " + request.responseText)
        			console.log("error: " + error);
				}
			});
		});
		
		$("#passwdConfirm").blur(function(){			
			let message = $("#passwordMessage");
			
			if($(this).val()==$("#password").val()){
				if($(this).val() == ""){
					message.css("color", "black").text("");
				}else if($(this).val().length < 8 || $(this).val().length > 12){
			    	message.css("color", "black").text("8 ~ 12자리로 설정해주셔야합니다");
			    }else{
					message.css("color", "blue").text("비밀번호가 일치합니다");
				}					
			}else if ($(this).val()!=$("#password").val()){				
				message.css("color", "red").text("비밀번호가 불일치합니다");
			}
		});
	});