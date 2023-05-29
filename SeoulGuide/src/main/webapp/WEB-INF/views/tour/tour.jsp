<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<c:url value="/resources/css/tour/tour.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
<script src="<c:url value="/resources/js/jquery-3.3.1.js"/>"></script>
<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
</head>
<body class="body">
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
		<div class="totalSearch">
			<div class="title">
				<h3>서울 관광을 고민중이신가요?</h3>
				<h3>'서울 함께 가는 길'을 따라 편안하고 안전한 관광하세요.</h3>
				<h1>관광지 검색</h1>
				<div class="searchbox">
					<input type="text" class="bar" id="name" name="name" style="color: gray;" required size="30">
					<button>검색</button>
				</div>
			</div>
		</div>
		<div class="searchbackground">
			<div class="box">
				<div class="search">
					<div class="iconsearch">
						<div class = "off" value = "지체장애">
							<img alt="" src="">
						</div>
						<div class = "off" value = "시각장애">
							<img alt="" src="">
						</div>
						<div class = "off" value = "임산부">
							<img alt="" src="">
						</div>
						<div class = "off" value = "고령자">
							<img alt="" src="">
						</div>
					</div>
					<div class="searchBar">
						<span>지역 선택</span>
						<select class = "SeoulLocal" name="Seoullocal">
							<option value="">구 선택</option>
							<option value="학생">종로구</option>
							<option value="회사원">회사원</option>
							<option value="기타">기타</option>
						</select>
					</div>
					<div class="searchButton">
						<button>검색</button>
						<button>초기화</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>