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
<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
<script src="<c:url value="/resources/js/jquery-3.3.1.js"/>"></script>
<script src="<c:url value="/resources/js/join.js"/>"></script>
<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
</head>
<body class="body">
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<section class="content-wrap" id="loginpage">
		<div class="signupbackground">
			<p>회원가입</p>
			<form action="join" method="POST" enctype="multipart/form-data"
				name="joinform">
				<div class="signuptotal">
					<div class="profileImage">
						<div>
							<img alt="" src="resources/img/loginLogo.png">
						</div>
						<div class="filebox">
							<input class="upload-name" value="첨부파일" placeholder="첨부파일">
							<label for="file">파일찾기</label> <input type="file" name="file"
								id="file" accept="image/*" />
						</div>
					</div>
					<table>
						<colgroup>
							<col style="width: 25%;">
							<col style="width: 75%;">
						</colgroup>
						<tbody class="signupform">
							<tr>
								<td class="nickname"><input type="text" name="nickname" id="nickname" placeholder=" 닉네임" required>
								<button type="button" id="checknickname">중복확인</button></td>
							</tr>
							<tr>
								<td><span class="message" id="idMessage"></span></td>
							</tr>
							<tr>
								<td><input type="text" name="username" placeholder=" 이름"
									required></td>
							</tr>
							<tr>
								<td><input type="text" name="email" id="email"
									placeholder=" 이메일" required></td>
							</tr>
							<tr>
								<td><input type="password" name="password" id="password"
									placeholder=" 비밀번호" required></td>
							</tr>
							<tr>
								<td><input type="password" name="passwdConfirm"
									id="passwdConfirm" placeholder=" 비밀번호 확인" required>
							</tr>
							<tr>
								<td><span id="passwordMessage"></span></td>
							</tr>
							<tr>
								<td><input type="text" name="phoneNumber" id="phoneNumber"
									placeholder=" 휴대전화" required></td>
							</tr>
							<tr>
								<td><input type="text" name="birthday" placeholder=" 생년월일"
									required></td>
							</tr>
						</tbody>
					</table>
				</div>
				<div>
					<button class="submitbutton" type="submit">회원가입</button>
				</div>
			</form>
		</div>
	</section>

</body>
</html>