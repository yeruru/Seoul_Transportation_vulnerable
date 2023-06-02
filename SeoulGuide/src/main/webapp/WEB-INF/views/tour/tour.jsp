<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"href="<c:url value="/resources/css/tour/tour.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
<script src="<c:url value="/resources/js/jquery-3.3.1.js"/>"></script>
<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
</head>
<body class="body">
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<form action="toursearch" method="POST">
		<div class="totalSearch">
			<div class="title">
				<h3>서울 관광을 고민중이신가요?</h3>
				<h3>'서울 함께 가는 길'을 따라 편안하고 안전한 관광하세요.</h3>
				<h1>관광지 검색</h1>
				<div class="searchbox">
					<input type="text" class="bar" id="word" name="word"
						style="color: gray;" required size="30">
					<button type="submit">검색</button>
				</div>
			</div>
		</div>
	</form>
	<div class="searchbackground">
		<div class="box">
			<form action="tourdetailsearch" method="POST">
				<div class="search">
					<div class="iconsearch">
						<div class="off">
							<input type="checkbox" class="menu_icon1" name="menu_icon"
								value="type1" id="menu_icon1"><label for="menu_icon1"></label>
						</div>
						<div class="off">
							<input type="checkbox" class="menu_icon6" name="menu_icon"
								value="type2" id="menu_icon6"><label for="menu_icon6"></label>
						</div>
						<div class="off">
							<input type="checkbox" class="menu_icon5" name="menu_icon"
								value="type3" id="menu_icon5"><label for="menu_icon5"></label>
						</div>
						<div class="off">
							<input type="checkbox" class="menu_icon2" name="menu_icon"
								value="type4" id="menu_icon2"><label for="menu_icon2"></label>
						</div>
					</div>
					<div class="searchBar">
						<span>지역 선택</span> <select class="SeoulLocal"
							name="tourist_subtitle">
							<option value="">구 선택</option>
							<option value="강남구">강남구</option>
							<option value="강동구">강동구</option>
							<option value="강북구">강북구</option>
							<option value="강서구">강서구</option>
							<option value="관악구">관악구</option>
							<option value="광진구">광진구</option>
							<option value="구로구">구로구</option>
							<option value="금천구">금천구</option>
							<option value="노원구">노원구</option>
							<option value="동봉구">동봉구</option>
							<option value="서대문구">서대문구</option>
							<option value="서초구">서초구</option>
							<option value="성동구">성동구</option>
							<option value="중구">중구</option>
						</select>
					</div>
					<div class="searchButton">
						<button type="submit" value="검색">검색</button>
						<button type="reset">초기화</button>
					</div>
				</div>
			</form>
		</div>
		<div class="tourresult">
			<c:forEach items="${tourlist}" var="tour">
				<a href="${path}/guide/detail?id=${tour.tourist_id}">
					<div class="tourlist">
						<div class="tourimg" style="background-image: url(./resources/img/tour/tour${tour.tourist_id}.jpg);"></div>
							<div class="tourtext">
								<p class="text1">${tour.tourist_title}</p>
								<p class="text2">${tour.tourist_subtitle}</p>
							</div>
						<div class="menu_icon">
							<c:if
								test="${tour.menu_icon1  == 1 || tour.menu_icon3  == 1 || tour.menu_icon4  == 1}">
								<div>
									<img class="icon1" alt="" src="resources/img/icons/Group 1.png">
								</div>
							</c:if>
							<c:if test="${tour.menu_icon6  == 1}">
								<div>
									<img class="icon1" alt="" src="resources/img/icons/Group 2.png">
								</div>
							</c:if>
							<c:if test="${tour.menu_icon5  == 1}">
								<div>
									<img class="icon1" alt="" src="resources/img/icons/Group 3.png">
								</div>
							</c:if>
							<c:if test="${tour.menu_icon2  == 1}">
								<div>
									<img class="icon1" alt="" src="resources/img/icons/Group 4.png">
								</div>
							</c:if>

						</div>
					</div>
				</a>
			</c:forEach>
		</div>
	</div>
</body>
</html>