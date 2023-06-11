<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/views/head.jsp" />
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
<link rel="stylesheet"
	href="<c:url value="/resources/css/mypage/profile.css"/>">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	
	<link rel="stylesheet" href="<c:url value="/resources/css/story/storyReview.css"/>">
	<script src="<c:url value="/resources//js/jquery-3.3.1.js"/>"></script>

<meta charset="UTF-8">
<title>마이페이지</title>
<style>
</style>
</head>
<body>
	<jsp:include page="/WEB-INF/views/header.jsp" />
	<section class="content-wrap profile">
		<div class="profile-wrap">
			<div class="profile-head">
				<h2>마이페이지</h2>
				<div class="grid-box">
					<a href="./modifyMember">내정보수정하기 </a>
				</div>
				<hr>
			</div>
			<div class="profile-content">
				<ul>
					<li>
					<img id="profileImage"
						src="<c:url value='/resources/upload/${member.name}'/>"
						alt="프로필 이미지">
						</li>
					<li>닉네임: ${member.nickname}</li>
					<li>이메일: ${member.email}</li>
					<li>${member.directory }</li>
				</ul>
			</div>
			
			<div class="tab">
				<div class="tab-list">
					<div class="list">
						<a href="#;" class="ho"> <span
							class="material-symbols-outlined">bookmark</span>즐겨찾기
						</a> <a href="#;" class="ho on"> 
						<span class="material-symbols-outlined">edit</span>내가 쓴 게시물
						</a>
					</div>
				</div>
				<div class="tab-content">
					<div class="content">
						<div>즐겨찾기</div>
					</div>
					<div class="content on">
						<p>ㅎㅇ</p>
					</div>
				</div>
			</div>
		</div>
	</section>

</body>
<script>
	// tab-list
	var links = document.querySelectorAll('.list a');
	links.forEach(function(link) {
		link.addEventListener('click', function() {
			var idx = Array.from(links).indexOf(link);
			var listItems = document.querySelectorAll('.list a');
			var contentItems = document
					.querySelectorAll('.tab-content .content');

			listItems.forEach(function(item) {
				item.classList.remove('on');
			});
			contentItems.forEach(function(item) {
				item.style.display = 'none';
			});

			link.classList.add('on');
			contentItems[idx].style.display = 'block';
		});
	});
</script>
<script>
window.addEventListener('load', function() {
	  var darkModeCookie = getCookie('darkMode');
	  if (darkModeCookie === 'true') {
	    bodyEl.classList.add('dark');
	  }
	});

	function getCookie(name) {
	  var cookies = document.cookie.split(';');
	  for (var i = 0; i < cookies.length; i++) {
	    var cookie = cookies[i].trim();
	    if (cookie.startsWith(name + '=')) {
	      return cookie.substring(name.length + 1);
	    }
	  }
	  return '';
	}
</script>




</html>