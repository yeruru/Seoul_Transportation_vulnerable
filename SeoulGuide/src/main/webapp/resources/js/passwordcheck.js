$(document).ready(function() {
		var code = "";
		$("#emailChk").click(function(){
			var sm_email = $("#email").val();
			$.ajax({
		        type:"GET",
		        url:"mailCheck?sm_email=" + sm_email,
		        cache : false,
		        success:function(data){
		        	if(data == "error"){
		        		alert("이메일 주소가 올바르지 않습니다. 유효한 이메일 주소를 입력해주세요.");
						$("#email").attr("autofocus",true);
						$(".successEmailChk").text("유효한 이메일 주소를 입력해주세요.");
						$(".successEmailChk").css("color","red");
		        	}else{	        		
						alert("인증번호 발송이 완료되었습니다.\n입력한 이메일에서 인증번호 확인을 해주십시오.");
		        		$("#sm_email2").attr("disabled",false);
		        		$("#emailChk2").css("display","inline-block");
		        		$(".successEmailChk").text("인증번호를 입력한 뒤 이메일 인증을 눌러주십시오.");
		        		$(".successEmailChk").css("color","green");
		        		code = data;
		        	}
		        }
		    });
		});
		
		//이메일 인증번호 대조
		$("#emailChk2").click(function(){
	
			if($("#sm_email2").val() == code){
				if($("#sm_email2").val() ==""){
				$(".successEmailChk").text("인증번호를 받아주세요");
				}else{
					$(".successEmailChk").text("인증번호가 일치합니다.");
					$(".successEmailChk").css("color","green");
					$("#emailDoubleChk").val("true");
					$("#sm_email2").attr("disabled",true);
					//$("#sm_email").attr("disabled",true);
				}
			}else{
				$(".successEmailChk").text("인증번호가 일치하지 않습니다. 확인해주시기 바랍니다.");
				$(".successEmailChk").css("color","red");
				$("#emailDoubleChk").val("false");
				$("#sm_email2").attr("autofocus",true);
			}
		});
		 $(document.forms[0]).submit(function(){
		 
		  if($(".successEmailChk").text() != "인증번호가 일치합니다."){
		  	alert("인증번호를 다시받아주세요");
		  	return false;
		  }	
	});
});