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
						<div class = "profileImg">
							<img alt="" id = "myImg" src="resources/img/profile.png">
						</div>
						<div class="filebox">
							<input class="upload-name" value="첨부파일" placeholder="첨부파일">
							<label for="file">파일찾기</label> <input type="file" name="file" id="file" accept="image/*" />
						</div>
					</div>
					<table>
						<colgroup>
							<col style="width: 25%;">
							<col style="width: 75%;">
						</colgroup>
						<tbody class="signupform">
							<tr>
								<td class="nickname"><input type="text" name="nickname"
									id="nickname" placeholder=" 닉네임" required maxlength="6" oninput="handleInputLength(this, 6)">
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
								<td class="emailcheck"><input type="text" name="email"
									id="email" placeholder=" 이메일" required>
									<button type="button" id="emailChk" class="doubleChk">인증번호
										요청</button></td>
							</tr>
							<tr>
								<td class="emailcheck2"><input id="sm_email2" type="text"
									name="sm_email2" title="인증번호 입력" disabled required />
									<button type="button" id="emailChk2" class="doubleChk">이메일인증</button>
								</td>

							</tr>
							<tr>
								<td><span class="point successEmailChk">이메일 입력후 인증번호
										보내기를 해주십시오.</span> <input type="hidden" id="emailDoubleChk" /></td>
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
								<td class = "phonenumber">
									<select name="phone1" class = "phone1" required>
											<option value="010" selected>010</option>
											<option value="011">011</option>
									</select><p>-</p> 
									<input type="text" name="phone2" class = "phone" required maxlength="4"><p>-</p>
									<input type="text" name="phone3" class = "phone" required maxlength="4">
								</td>
							</tr>
							<tr>
								<td>
									<input type="text" name="birthday" id = "birthday"  maxlength = "8" placeholder=" 생년월일" required>
									<span>ex)19770302</span>
								</td>
							</tr>
							
							<tr>
								<td><span id="birthdaymessage"></span></td>
							</tr>
						</tbody>
					</table>
				</div>
				<div>
					<button class="submitbutton" id="submitbutton" type="submit">회원가입</button>
				</div>
			</form>
		</div>
	</section>

</body>
<script>
window.addEventListener('load', function() {
	  var darkModeCookie = getCookie('darkMode');
	  if (darkModeCookie === 'true') {
	    bodyEl.classList.add('dark');
	  }
	});

	function getCookie(name) {
	  var cookies = document.cookie.split(';');
	  for (var i = 0; i < cookies.length; i++) {
	    var cookie = cookies[i].trim();
	    if (cookie.startsWith(name + '=')) {
	      return cookie.substring(name.length + 1);
	    }
	  }
	  return '';
	}
</script>
<script type="text/javascript">
function handleInputLength(el, max) {
	  if(el.value.length > max) {
	    el.value = el.value.substr(0, max);
	  }
	}
</script>
</html>
