<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/member/login.css"/>">
<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<section class="content-wrap" id="loginpage">
	<div class="pa-wrap">
		<div>
			<p class="password-change">
			비밀번호 변경에 성공하셨습니다<br>
			로그인을 하여 서비스를 이용해주세요</p>
		</div>
		<img class="main-img" src="<c:url value="/resources/img/test-main.svg"/>" alt="관광지테스트 이미지">
		<div>
			<a href="./loginform" class="pa-login">로그인 하러가기</a>
		</div>
	</div>
	</section>
</body>
</html>