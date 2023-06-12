<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>댓글 수정</title>
	<script defer src="<c:url value="/resources/js/boardWrite.js"/>"></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.48.4/codemirror.css">
	<link rel="stylesheet" href="<c:url value="/resources/css/story/storyReview.css"/>">
	<link rel="stylesheet" href="https://uicdn.toast.com/editor/2.0.0/toastui-editor.min.css">
	<script src="https://uicdn.toast.com/editor/2.0.0/toastui-editor-all.min.js"></script>
	<script defer src="<c:url value="/resources/js/header.js"/>"></script>
</head>
<body class="body">
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<jsp:include page="/WEB-INF/views/story/storyHeader.jsp"></jsp:include>
	<div class="sub-header-box content-wrap">
		<h4 class="write-title">댓글수정</h4>
		<hr/>
		<!-- 댓글작성창 -->
		<div class="write">
			<div class="form">
				<form name="tform" id="tform" action="modify" method="POST">
					<label class="nick-modi">닉네임 : ${comment.nickname}</label>
					<span class="writeForm">
						<textarea name="comment_content" rows="5" cols="50" id="comment" name="content"></textarea>
					</span>
					<div class="wrap">
		         		<input type="hidden" name="post_id" value="${comment.post_id}">
		         		<input type="hidden" name="comment_id" value="${comment.comment_id}">
		         		<button type="submit" class="btn-st" >수정하기</button>
		         		<a href="../storydetail?post_id=${comment.post_id}" class="back-btn" >
			         		<span class="material-symbols-outlined">arrow_back_ios</span>
			         		뒤로가기
		         		</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>
</body>
</html>