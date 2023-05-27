<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<c:url value="/resources/css/boardWrite.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
<link rel="stylesheet" href="https://uicdn.toast.com/editor/latest/toastui-editor.min.css" />
<script defer src="<c:url value="/resources/js/BoardWrite.js"/>"></script>
<title>글쓰기</title>
</head>
<body class="body">
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
		<div id="board-write" class="content-wrap">
		<!-- 현윤 -->
		<h2 style="color: #fff">Editor</h2>
		<div id="editor"></div>
	
		<h2 style="color:#fff">Viewer</h2>
		<div id="viewer"></div>
		<!-- 현윤 -->
	   <!-- 게시판 등록 -->
	   <!-- TOAST UI Editor가 들어갈 div태그 -->
	    <div id="editor"></div>
	    <!-- TOAST UI Editor CDN URL(JS) -->
	    <script src="https://uicdn.toast.com/editor/latest/toastui-editor-all.min.js"></script>
	    <script>
	    const editor = new toastui.Editor({
	        el: document.querySelector('#editor'),
	        height: '600px',
	        initialEditType: 'wysiwyg',
	        previewStyle: 'vertical'
	      });
	    </script>
	</div>
</body>
</html>