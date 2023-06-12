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
		존재하지 않는 이메일계정입니다.
		회원가입을 통해 새로이 가입해주세요
		<a href="./joinagreeform">회원가입하러가기</a>
	</section>
</body>
</html>