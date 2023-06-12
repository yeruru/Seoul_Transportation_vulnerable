<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>스토리상세페이지</title>
	<script defer src="<c:url value="/resources/js/boardWrite.js"/>"></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.48.4/codemirror.css">
	<link rel="stylesheet" href="<c:url value="/resources/css/story/storyReview.css"/>">
	<link rel="stylesheet" href="https://uicdn.toast.com/editor/2.0.0/toastui-editor.min.css">
	<script src="https://uicdn.toast.com/editor/2.0.0/toastui-editor-all.min.js"></script>
	<script defer src="<c:url value="/resources/js/header.js"/>"></script>
</head>
<body class="body">
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<div class="sub-header-box">
		<jsp:include page="/WEB-INF/views/story/storyHeader.jsp"></jsp:include>

		<section id="./writeForm" class="content-wrap storydetail">
				<input type="hidden" name="num" value="${article.post_id }" /> 
				<input type="hidden" name="writer" id="writer" readonly="readonly" value="${article.user_id }" />
				<h3>${article.post_title }</h3>

				<div class="sub-title">
					<p class="profile">
					  <img id="profileImage" src="<c:url value='/resources/upload/${article.name}'/>" alt="프로필 이미지">
					</p>
					<p class="name">${article.nickname }</p>
					<p class="date">
						<fmt:formatDate value="${article.post_edit_date}" pattern="yyyy-MM-dd hh:mm" />
					</p>
					<div class="session-box">
						<c:choose>
						<c:when test="${sessionScope.id eq article.user_id}">
							<form action="<c:url value='storymodify'/>" method="post" style="display: inline;">
								<input type="hidden" name="post_id" value="${article.post_id}" />
								<input type="submit" value="수정" />
							</form>
							<form action="<c:url value='storydelete'/>" method="post" id="deleteForm" style="display: inline;">
								<input type="hidden" name="post_id" value="${article.post_id}">
								<button type="button" onclick="confirmDelete()">삭제</button>
							</form>
						</c:when>
						<c:otherwise>
							<!-- 일치하지 않을 때의 처리 -->
						</c:otherwise>
						</c:choose>
					</div>
					
				</div>

				<!-- TOAST UI Viewer -->
				<div id="viewer">
					<div class="viewer-box">${article.post_content}</div>
				</div>
				<!-- TOAST UI Viewer CDN URL(JS) -->
				<script
					src="https://uicdn.toast.com/editor/latest/toastui-editor-all.min.js"></script>
				<script>
					const viewer = toastui.Editor.factory({
						el : document.querySelector('#viewer'),
						viewer : true,
						height : '500px',
						initialValue : content,

					});
				</script>
				
				<h4 class="write-title">댓글</h4>
				<hr/>
				<!-- 댓글작성창 -->
				<div class="write">
					<div class="form">
						<form name="tform" id="tform" action="storydetail" method="POST">
							<span class="writeForm">
								<textarea name="comment_content" rows="5" cols="50" id="comment" placeholder="로그인 후 소중한 댓글을 남겨주세요."></textarea>
							</span>
							<div class="wrap">
								<c:choose>
						         	<c:when test="${sessionScope.id eq null }">
						         	    <li class="btn-st-box"><a href="./loginform" class="btn-st">로그인</a></li>
						         	</c:when>
						         	<c:otherwise>
						         		<input type="hidden" name="post_id" value="${article.post_id}">
						         		<li class="btn-st-box"><button type="submit" class="btn-st" >등록하기</button></li>
						         	</c:otherwise>
					         	</c:choose>
							</div>
						</form>
					</div>
				</div>
				
			
				<!-- 댓글창 -->
				
				<div>
					<div class="list">
						<ul>
							<c:forEach items="${comment}" var="comment">
							<li>
								<div class="profile">
									<img id="profileImage"
									src="<c:url value='/resources/upload/${comment.name}'/>"
									alt="프로필 이미지">
								</div>
								<div class="text">
									<span>${comment.nickname}</span>
									<p>${comment.comment_content}</p>
									 <span>
						               <c:choose>
						                <c:when test="${not empty comment.b_comment_chg}">
						                  <fmt:formatDate value="${comment.b_comment_chg}" pattern="yyyy-MM-dd HH:mm:ss" />
						                </c:when>
						                <c:otherwise>
						                  <fmt:formatDate value="${comment.b_comment_reg}" pattern="yyyy-MM-dd HH:mm:ss" />
						                </c:otherwise>
						              </c:choose>
						            </span>
								</div>
								<div class="modify-box">
							 		<c:if test="${sessionScope.id eq comment.user_id}">
										<a href="storydetail/modify?post_id=${comment.post_id }&comment_id=${comment.comment_id}">수정</a>
										<form action="<c:url value='/storydetail/delete'/>" method="post" id="deleteForm2" style="display: inline;">
									          <input type="hidden" name="comment_id" value="${comment.comment_id}">
									          <input type="hidden" name="post_id" value="${comment.post_id}">
									          <button type="button" onclick="conmmentDelete()">삭제</button>
										</form>          
									</c:if>
								</div>
							</li>
							</c:forEach>
						</ul>
					</div>
				</div>


		</section>
	</div>
	<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>
</body>

<script>
	function copyUrl() {
		var url = window.location.href;

		var tempInput = document.createElement("input");
		tempInput.style = "position: absolute; left: -1000px; top: -1000px";
		tempInput.value = url;
		document.body.appendChild(tempInput);

		tempInput.select();
		document.execCommand("copy");
		document.body.removeChild(tempInput);

		alert("URL이 복사되었습니다.");
	}
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
<script>
	function confirmDelete() {
		if (confirm("게시글을 삭제하시겠습니까?")) {
			document.getElementById("deleteForm").submit();
		}
	}
</script>
<script>
	function conmmentDelete() {
		if (confirm("댓글을 삭제하시겠습니까?")) {
			document.getElementById("deleteForm2").submit();
		}
	}
</script>


</html>