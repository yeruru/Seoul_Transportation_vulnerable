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
				
				
				<c:choose>
		         	<c:when test="${sessionScope.email eq null }">
		         	    <li><a href="./loginform">로그인</a></li>
		         	</c:when>
		         	<c:otherwise>
		         		<li><a href="./logout">로그아웃</a></li>
		         	</c:otherwise>
	         	</c:choose>
			</ul>
		</div>
	</div>
</body>
</html>