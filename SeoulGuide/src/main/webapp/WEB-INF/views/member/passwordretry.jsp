<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<c:url value="/resources/css/member/login.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/member/join.css"/>">
<script src="<c:url value="/resources/js/jquery-3.3.1.js"/>"></script>
<script src="<c:url value="/resources/js/passwordretry.js"/>"></script>
<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<section class="content-wrap" id="loginpage">
		<form action="passworupdate" method="POST">
			<div class="loginbackground">
			<input type="hidden" name ="email" value=${email }>
				<p>비밀번호 재설정</p>
				<div>
					<div>
						<input type="password" name="password" id="password"
							placeholder=" 비밀번호" required>	
					</div>
				</div>
				<div>
					<div>
						<input type="password" name="passwdConfirm" id="passwdConfirm"
							placeholder=" 비밀번호 확인" required>
					</div>
				</div>
	
				<div>
					<div>
						<span id="passwordMessage"></span>
					</div>
				</div>
				<div>
					<input class="button1" type="submit" value="비밀번호 변경">
				</div>
			</div>
		</form>
	</section>
</body>
</html>