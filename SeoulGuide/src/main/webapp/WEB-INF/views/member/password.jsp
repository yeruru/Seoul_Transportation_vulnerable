<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<section class="content-wrap" id="loginpage">
		비밀번호 변경에 성공하셨습니다 
		로그인을 하여 서비스를 이용해주세요
		<a href="./loginform">로그인하러가기</a>
	</section>
</body>
</html>