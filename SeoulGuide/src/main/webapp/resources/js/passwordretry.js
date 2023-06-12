$(document).ready(function() {
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
	
	$(document.forms[0]).submit(function(){
		 if($("#passwordMessage").text() != "비밀번호가 일치합니다"){
		  	alert("비밀번호를 다시 확인해 주세요");
		  	return false;
		  }
	});
});