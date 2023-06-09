<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/views/head.jsp"/>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">	
<link rel="stylesheet" href="<c:url value="/resources/css/mypage/modifyMember.css"/>">
<!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script> -->
<meta charset="UTF-8">
<title>ModifyMemeber</title>
</head>
<body>
	<jsp:include page="/WEB-INF/views/header.jsp" />
	
	<section class="content-wrap">
		<div>
			<h2>내정보 수정</h2>
			<hr>
			<form>
				<table class="">
		
					<thead class="">
						<tr>
							<th scope="col" colspan="2"></th>
							<td></td>
						</tr>
					</thead>
					
					<tbody>
						<tr class="">
							<th scope="row">
								 <div class="img-box">
                                    <img id="updateImg" src="<c:url value='/resources/upload/${member.name}'/>" alt="프로필 이미지">
                                </div>
							</th>
							<td><input id="profileImage" type="file" class="" name="profile" /></td>
						</tr>
						<tr class="">
							<th scope="row">이름</th>
							<td>${member.username}</td>
						</tr>
						
						<tr class="">
							<th scope="row">닉네임</th>
							<td><input type="text" value="nickname" /></td>
						</tr>
						
						<tr class="">
							<th scope="row">비밀번호 변경</th>
							<td><input type="password" value="password" /></td>
						</tr>
						<tr class="">
							<th scope="row">비밀번호 확인</th>
							<td><input type="password" value="password" /></td>
						</tr>
						<tr class="">
							<th scope="row"><strong>이메일</strong></th>
							<td>${member.email}</td>
						</tr>
						
						<tr class="">
							<th scope="row">생년월일</th>
							<td>${member.birthday}</td>
						</tr>
		
					</tbody>
						
				</table>
				<div>
					<button type="button" value="delete">회원탈퇴</button>
					<button type="submit" value="save">저장하기</button>
				</div>
			</form>
		</div>	
	</section>
<script>

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