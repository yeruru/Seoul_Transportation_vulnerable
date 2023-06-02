<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
</head>
<body>
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<div class="sub-header-box">
		<jsp:include page="/WEB-INF/views/story/storyHeader.jsp"></jsp:include>
		
		<section id="./writeForm" class="content-wrap storydetail">
			<form action="./storymodify" method="post">
				<input type="hidden" name="num" value="${article.post_id }"/>
				<input type="hidden" name="writer"id="writer" readonly="readonly" value="${article.user_id }"/>
				<h3>${article.post_title }</h3>
				
				<div class="sub-title">
					<p class="name">닉네임</p>
					<p class="date"><fmt:formatDate value="${article.post_edit_date}" pattern="yyyy-MM-dd hh:mm" /></p>
					<a href="#;" id="copyButton" onclick="copyUrl()">URL 복사</a>
				</div>
				
				<!-- TOAST UI Viewer -->
				<div id="viewer"><div class="viewer-box">${article.post_content}</div></div>
				<!-- TOAST UI Viewer CDN URL(JS) -->
				<script src="https://uicdn.toast.com/editor/latest/toastui-editor-all.min.js"></script>
				<script>
				    const viewer = toastui.Editor.factory({
			            el: document.querySelector('#viewer'),
			            viewer: true,
			            height: '500px',
			            initialValue: content,
			            
			        }); 
				</script>
			
				<section id="commandCell">

					<a href="<c:url value='/storymodify?post_id=${article.post_id}'/>">수정</a>

					<a href="storyreview">목록</a>
				</section>
			</form>
		</section>
	</div>
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
</html>