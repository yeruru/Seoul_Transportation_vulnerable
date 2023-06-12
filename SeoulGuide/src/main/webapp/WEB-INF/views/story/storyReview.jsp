<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
	<title>관광지 리뷰</title>
	<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
	<link rel="stylesheet" href="<c:url value="/resources/css/story/storyReview.css"/>">
	<script src="<c:url value="/resources//js/jquery-3.3.1.js"/>"></script>
	<script defer src="<c:url value="/resources/js/story.js"/>"></script>
	
</head>

<body class="body">

	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<div class="sub-header-box">
	
		<jsp:include page="/WEB-INF/views/story/storyHeader.jsp"></jsp:include>
		<div class="story-bg">
			<div class="content-wrap story-box">
				<p>관광지에 다녀온 후 당신의 경험을 공유해주세요.</p>
				<h4>관광스토리</h4>
				<img src="<c:url value="/resources/img/test-main.svg"/>" alt="메인이미지">
				<img class="img-dark" src="<c:url value="/resources/img/story-dark.svg"/>" alt="메인이미지">
			</div>
		</div>
		<section id="story-review" class="box-wrap">
	  		<div class="review-tumb">
	  			
	  			<div class="write-btn-box">
					<div class="serch">
						<input type="text" id="search-input" placeholder="작성자/제목">
   				 		<button id="search-button">
   				 			<span class="material-symbols-outlined">search</span>
						</button>
					</div>
					<div class="filter">
						<a href="javascript:void(0);">인기순</a>
						<a href="javascript:void(0);" class="on">최신순</a>
					</div>
	  			</div>
	  			<div id="js-load" class="main">
			        <ul class="menu">
			            
			          <c:forEach items="${boards}" var="article">
			            <li class="lists__item js-load">

			                <a href="storydetail?post_id=${article.post_id}">
			                    <div class="tumb-box">
			                       <div class="tumb">
			                          <!-- TOAST UI Viewer -->
									  <div id="viewer"><div class="viewer-box">${article.post_content}</div></div>
			                       </div>
			                       <div class="tumb-title">
			                          <em>${article.post_title }</em>
			                       </div>
			                      </div>
			                      <p>${article.nickname }</p>
				               </a>
				           </li>
			            </c:forEach>
			        </ul>
			    </div>
			    
			    <div style="padding-top:20px;">
				  <button type="button" id="js-btn-wrap" class="more">리뷰 더보기 +</button>
				</div>	

		</section>
	</div>
	<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>
</body>
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