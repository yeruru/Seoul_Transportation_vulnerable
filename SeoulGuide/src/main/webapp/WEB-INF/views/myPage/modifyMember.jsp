<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<jsp:include page="/WEB-INF/views/head.jsp" />
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
<link rel="stylesheet"
	href="<c:url value="/resources/css/mypage/modifyMember.css"/>">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="UTF-8">
<title>ModifyMemeber</title>
</head>

<body>
	<jsp:include page="/WEB-INF/views/header.jsp" />

	<section class="content-wrap">

		<div class="container">
			<h2>내정보 수정</h2>
			<hr>
			<form id="memberForm" action="modifyMember/update" method="POST"
				enctype="multipart/form-data">

				<div class="form-box">
					<ul>
						<li>
							<div class="img-box">
								<img id="updateImg"
									src="<c:url value='/resources/upload/${member.name}'/>"
									alt="프로필 이미지">
							</div> <!-- <input id="profileImage" type="file" class="" name="file" />-->
							<!-- 아이콘을 클릭할 수 있는 버튼으로 변경 --> <label for="profileImage"
							class="material-symbols-outlined"> add_a_photo </label> <!-- 파일 업로드 인풋 (숨겨진 상태로 유지) -->
							<input id="profileImage" type="file" class="" name="file"
							style="display: none;">
						</li>
						<li>
							<p>이름</p>
							<div>${member.username}</div>
						</li>
						<li>
						    <p>닉네임</p>
						    <input type="text" value="${member.nickname}" name="nickName" id="nickName" />
						    <button type="button" value="중복확인" onclick="checkNickname()">중복확인</button>
						    <div id="nicknameCheck"></div>
						</li>
						<li><strong>이메일</strong>
							<p>${member.email}</p></li>
						<li>
							<p>생년월일</p>
							<p>${member.birthday}</p>
						</li>
					</ul>
				</div>
				<div>
					<input class="withdraw-btn" type="submit" value="회원탈퇴"
						onclick="confirmWithdrawal()" />
					<button class="" type="submit" value="save" id="modifyButton">저장하기</button>
				</div>

			</form>

		</div>
	</section>
	<script>
	function checkNickname() {
	    var nickname = $("#nickName").val();
	    if (nickname == "") {
	        $("#nicknameCheck").text("닉네임을 입력해주세요");
	        $("#nicknameCheck").css("color", "red");
	        return;
	    }
	    $.ajax({
	        type: "POST",
	        url: "modifyMember/nicknameCheck",
	        data: {
	            nickname: nickname
	        },
	        success: function(result) {
	            $("#nicknameCheck").text(result);
	            if (result == "사용가능") {
	                $("#nicknameCheck").css("color", "blue");
	                $("#modifyButton").prop("disabled", false); // 중복확인 결과가 "사용가능"일 때 버튼 활성화
	            } else {
	                $("#nicknameCheck").css("color", "red");
	                $("#modifyButton").prop("disabled", true); // 중복확인 결과가 "사용불가"일 때 버튼 비활성화
	            }
	        },
	        error: function() {
	            alert("닉네임 중복 확인 실패");
	        }
	    });
	}
	function confirmWithdrawal() {
	    if (confirm("정말로 회원 탈퇴하시겠습니까?")) {
	        document.getElementById("memberForm").action = "modifyMember/delete";
	        document.getElementById("memberForm").submit();
	    }
	}

	 document.getElementById("profileImage").addEventListener("change", function() {
	let file = this.files[0]; // 선택한 파일 가져오기
	let reader = new FileReader(); // FileReader 객체 생성

	reader.onload = function(e) {
	  let imageElement = document.getElementById("updateImg"); // 프로필 이미지 엘리먼트 가져오기
	  imageElement.src = e.target.result; // 선택한 파일의 내용을 이미지 엘리먼트에 설정
	};

	reader.readAsDataURL(file); // 파일을 Data URL로 읽기

	});  
		
	</script>
</body>
</html>