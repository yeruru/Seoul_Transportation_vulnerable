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
				<li><a href="#">홈</a></li>
				<li><a href="#">인기관광지</a></li>
				<li><a href="#">방문자리뷰</a></li>
				<li><a href="#">로그인</a></li>
			</ul>
		</div>
	</div>
</body>
</html>