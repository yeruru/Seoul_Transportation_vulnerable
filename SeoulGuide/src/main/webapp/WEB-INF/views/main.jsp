<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
	<link rel="stylesheet" href="<c:url value="/resources/css/main.css"/>">
	<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
</head>
<body class="body">
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<section id="main" class="content-wrap">
		<div class="content">
			<p>교통약자를 위한<br>서울시 장애물 없는 관광</p>
			<h2>서울, 함께 가는 길</h2>
			<img src="<c:url value="/resources/img/main-img.svg"/>" alt="메인이미지">
			<div class="link">
				<ul>
					<li><a href="#">관광지 간편 검색</a></li>
					<li><a href="subway">지하철 간편 검색</a></li>
					<li><a href="#">로그인</a></li>
				</ul>
				<a href="#">계정이 없으신가요?</a>
			</div>
		</div>
	</section>
</body>
</html>