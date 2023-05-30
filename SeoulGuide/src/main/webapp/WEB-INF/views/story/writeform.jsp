<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<h2>게시판글등록</h2>
		
 		<form action="./storywrite" method="post">
		
   			<table>
				<tr>
					<td class="td_left"><label for="user_id">글쓴이</label></td>
					<td class="td_right">
						<input type="text" name="user_id" id="writer" required="required" />
					</td>
				</tr>
				<tr>
					<td class="td_left"><label for="post_title">제 목</label></td>
					<td class="td_right">
						<input name="post_title" type="text" id="title" required="required" /></td>
				</tr>
				<tr>
					<td class="td_left"><label for="post_content">내용2</label></td>
					<td class="td_right">
						<input name="post_content" type="text" id="title" required="required" /></td>
				</tr>
				
				
				
				
				<tr>
					<td class="td_left"><label for="post_content">내 용</label></td>
					<td>
						
						<div id="content" name="content" required="required" class="content-wrap">
					
						
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

					    const btn = document.querySelector('.btniii');

					    btn.addEventListener('click', function() {
					        console.log(editor.getHTML());
					    });
					    
					    
					    
					    </script>
						<sapn class="btniii">html 변환</sapn>
					</td>
				</tr>
 				<tr>
					<td class="td_left"><label for="file"> 이미지 파일 첨부 </label></td>
					<td class="td_right">
						<input type="file" name="file" id="file" accept="image/*"/>
					</td>
				</tr>
			</table>
			<section id="commandCell">
				<input type="submit" value="등록">&nbsp;&nbsp; <input type="reset" value="다시쓰기" />
			</section>
		</form>
	
	
		
	</div>
</body>
</html>