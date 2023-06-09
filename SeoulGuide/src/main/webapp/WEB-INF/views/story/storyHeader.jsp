<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
	<link rel="stylesheet" href="<c:url value="/resources/css/story/storyHeader.css"/>">
</head>
<body>
	<div class="sub-header">
		<div class="box-wrap">
			<ul>
				<li><a href="./storyreview">관광스토리</a></li>
				
				<c:choose>
		         	<c:when test="${sessionScope.email eq null }">
		         	    <li><a href="./loginform">로그인</a></li>
		         	</c:when>
		         	<c:otherwise>
		         		<li>
		         			<a href="writeform" class="write-btn" title="리뷰 글쓰기">
	  						글쓰기
	  						</a>
	  					</li>
		         	</c:otherwise>
	         	</c:choose>
			</ul>
		</div>
	</div>
</body>
</html>