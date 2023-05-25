<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value="/resources/css/member/login.css"/>">
<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
</head>
<body class="body">
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<section class = "content-wrap" id="loginpage">
		<div class = "loginbackground">
			<p>로그인</p>
			<div><input type="text" class = "email" name="email" placeholder=" Email"></div>
			<div><input type="password" class = "password" name="password" placeholder=" password"></div>
			<div >
	             <input  class="button1" type="submit" value="로그인">
	        </div>
	        <div >
	             <input  class="button2" type="submit" value="회원가입">
	        </div>
		</div>
	</section>
</body>
</html>