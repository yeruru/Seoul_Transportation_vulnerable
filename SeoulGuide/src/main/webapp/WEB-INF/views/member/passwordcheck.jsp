<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<c:url value="/resources/css/member/login.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
<script src="<c:url value="/resources/js/jquery-3.3.1.js"/>"></script>
<script src="<c:url value="/resources/js/passwordcheck.js"/>"></script>
<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<section class="content-wrap" id="loginpage">
		<form action="passwordsearch" method="POST">
			<div class="loginbackground">
				<p>비밀번호 찾기</p>
				<div>
				<div class="emailcheck">
					<input type="text" name="email" id="email" class="email-style" placeholder=" 이메일" required>
					<button type="button" id="emailChk" class="doubleChk">인증번호요청</button></div>
				</div>
				<div>
					<div class="emailcheck2">
						<input id="sm_email2" type="text" title="인증번호 입력" class="email2-style" disabled required />
						<button type="button" id="emailChk2" class="doubleChk">이메일 인증</button>
					</div>

				</div>
				<div>
				<div>
					<span class="point successEmailChk">이메일 입력후 인증번호 보내기를 해주십시오.</span>
					<input type="hidden" id="emailDoubleChk" /></div>
				</div>
				<div>
					<input class="button1" type="submit" value="찾기">
				</div>
			</div>
		</form>


	</section>
</body>
</html>