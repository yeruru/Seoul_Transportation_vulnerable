<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
<link rel="stylesheet" href="<c:url value="/resources/css/story/storyReview.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
<link rel="stylesheet"
	href="https://uicdn.toast.com/editor/latest/toastui-editor.min.css" />
<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
<script defer src="<c:url value="/resources/js/boardWrite.js"/>"></script>
<title>글쓰기</title>
</head>

<body class="body">
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<div class="sub-header-box">
		<jsp:include page="/WEB-INF/views/story/storyHeader.jsp"></jsp:include>
		<div id="writeform" class="content-wrap">

			<form action="./storywrite" method="post" onsubmit="return handleSubmit()">
				<div class="title">
					<input name="post_title" type="text" id="title" required="required"
						placeholder="제목: " />
				</div>
				<div id="content" name="content" required="required"
					class="content-wrap">

					<input type="hidden" name="post_content" value="" class="form">
					<!-- TOAST UI Editor API -->
					<div id="editor"></div>

					<!-- TOAST UI Editor CDN URL(JS) -->
					<script
						src="https://uicdn.toast.com/editor/latest/toastui-editor-all.min.js"></script>
					<script>
						const editor = new toastui.Editor({
							el : document.querySelector('#editor'),
							height : '600px',
							initialEditType : 'wysiwyg',
							previewStyle : 'vertical'

						});
					</script>
				</div>
				<section id="commandCell">
					<input type="submit" value="등록" class="submit-btn">
				</section>

			</form>
		</div>
	</div>
</body>
<script>
   
</script>
</html>