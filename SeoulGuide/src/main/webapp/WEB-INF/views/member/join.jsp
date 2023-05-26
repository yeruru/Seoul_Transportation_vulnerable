<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet"
	href="<c:url value="/resources/css/member/join.css"/>">
<link rel="stylesheet"
	href="<c:url value="/resources/css/member/common.css"/>">
<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
</head>
<body class="body">
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<section class="content-wrap" id="loginpage">
		<div class="signupbackground">
			<form action="join" method="POST">
				<table>
					<colgroup>
						<col style="width: 25%;">
						<col style="width: 75%;">
					</colgroup>
					<tbody>
						<tr>
							<th>닉네임</th>
							<td><input type="text" name="nickname" id="nickname"
								required>
								<button type="button" id="checkId">중복확인</button> <span
								class="message" id="idMessage"></span></td>
						</tr>
						<tr>
							<th>이 름</th>
							<td><input type="text" name="username" required></td>
						</tr>

						<tr>
							<th>이메일</th>
							<td>
								<input type="text" name="email" id="email" required>
							</td>
						</tr>
						<tr>
							<th>비밀번호</th>
							<td><input type="password" name="password" id="password"
								required></td>
						</tr>
						<tr>
							<th>비빌번호확인</th>
							<td><input type="password" name="passwdConfirm"
								id="passwdConfirm" required> <span id="passwordMessage"></span>
							</td>
						</tr>
					</tbody>
				</table>
				<div>
					<button type="submit">회원가입</button>
				</div>
			</form>
		</div>
	</section>

</body>
</html>