

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
				var message = $("#idMessage");	
				
					
					if(responseData=="사용가능"){
						console.log($("#nickname").val());
						message.css("color", "blue");
						checked = "Y";
					}else if(responseData == "사용불가"){
						message.css("color", "red");
						checked = "N";
					}else{
						message.css("color", "black").text("닉네임을 입력해주세요");
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
	      if(checked != "Y"){
	        alert("아이디 중복 확인이 필요합니다 ")
	        return false;
	      }
		  
		  if($("#passwordMessage").text() != "비밀번호가 일치합니다"){
		  	alert("비밀번호를 다시 확인해 주세요");
		  	return false;
		  }
		  
		  if($(".successEmailChk").text() != "인증번호가 일치합니다."){
		  	alert("인증번호를 다시받아주세요");
		  	return false;
		  }	
		  
		  if($("#birthdaymessage").text() != "완료"){
		  	alert("생년월일을 다시 확인해주세요");
		  	return false;
		  }
	    });
	    
	    $("#birthday").blur(function(){
	    	let year =  Math.floor(($("#birthday").val())/10000);
	    	let month = Math.floor((($("#birthday").val())%10000)/100);
	    	let day =  (($("#birthday").val())%10000)%100;
	    	
	    	var birthday = parseInt($("#birthday").val(), 10);
	    	
	    	console.log(year);
	    	console.log(month);
	    	console.log(day);
	    	
	    	
	    	if($("#birthday").val().length < 8){
	    		$("#birthdaymessage").text("8자리에 맞게 작성해주세요.");
	    		$("#birthdaymessage").css("color","red");
	    	}else if($("#birthday").val().length == 8){
	    		if(year < 1960  || year > 2023){
	    			$("#birthdaymessage").text("'년'을 다시 입력해주세요");
	    			$("#birthdaymessage").css("color","red");
	    		}else if(month < 1 || month > 12){
	    			$("#birthdaymessage").text("'월'을 다시 입력해주세요");
	    			$("#birthdaymessage").css("color","red");
	    		}else if(day < 1 || day > 31){
	    			$("#birthdaymessage").text("'일'을 다시 입력해주세요");
	    			$("#birthdaymessage").css("color","red");
	    		}else if(isNaN(birthday)) {
	    			$("#birthdaymessage").text("생년월일 형식이 아닙니다");
	    			$("#birthdaymessage").css("color","red");
	    		}else{
	    			$("#birthdaymessage").text("완료");
	    			$("#birthdaymessage").css("color","green");
	    		}
	    	}
	    });
	    
	    $("#file").on('change',function(){
		  var fileName = $("#file").val();
		  $(".upload-name").val(fileName);
	});
});
	
