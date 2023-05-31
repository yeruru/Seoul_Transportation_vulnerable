<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script defer src="<c:url value="/resources/js/boardWrite.js"/>"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.48.4/codemirror.css">
<link rel="stylesheet" href="https://uicdn.toast.com/editor/2.0.0/toastui-editor.min.css">
<script src="https://uicdn.toast.com/editor/2.0.0/toastui-editor-all.min.js"></script>
</head>
<body>
	<!-- 게시판 등록 -->

	<section id="./writeForm">
		<h2>게시판글상세</h2>
		<form action="./storymodify" method="post">
		<input type="hidden" name="num" value="${article.post_id }"/>
			<table>
				<tr>
					<td class="td_left"><label for="writer">글쓴이</label></td>
					<td class="td_right"><input type="text" name="writer"
						id="writer" readonly="readonly" value="${article.user_id }"/></td>
				</tr>
				<tr>
					<td class="td_left"><label for="title">제 목</label></td>
					<td class="td_right"><input name="title" type="text"
						id="title" value="${article.post_title }"/></td>
				</tr>
				<tr>
					<td class="td_left"><label for="content">내 용</label></td>
					<td>
						<div id="viewer">${article.post_content}</div>
					    <!-- TOAST UI Editor CDN URL(JS) -->
					    <script src="https://uicdn.toast.com/editor/latest/toastui-editor-all.min.js"></script>
					    <script>
					    const viewer = toastui.Editor.factory({
				            el: document.querySelector('#viewer'),
				            viewer: true,
				            height: '500px',
				            initialValue: content,
				            
				        }); 
					    
					    
					    
					    /* function ToView()
				        {
				            viewer.setMarkdown(editor.getMarkdown());
				        }; */
					    </script>
						
						
						
						<%-- <textarea id="content" name="content" cols="40" rows="15">
					        <c:out value="${article.post_content}" escapeXml="true" />
					    </textarea> --%>
					</td>
					
					
					
					
					
					
					
				</tr>

 				<%-- <tr>
					<td class="td_left"><label for="content">이미지</label></td>
					<td><img src="./image/${article.fileid }" width="100px" height="100px"/></td>
				</tr> --%>
			
			</table>
			<section id="commandCell">
				<input type="submit" value="수정">&nbsp;&nbsp;
				<a href="storyreview">목록</a>
			</section>
		</form>
	</section>
</body>
</html>