<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>관광지 간편 검색</title>
<link rel="stylesheet"href="<c:url value="/resources/css/tour/tour.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
<script src="<c:url value="/resources/js/jquery-3.3.1.js"/>"></script>
<script src="<c:url value="/resources/js/tour.js"/>"></script>
<script src="https://kit.fontawesome.com/15fcf63df7.js" crossorigin="anonymous"></script>
<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
</head>
<body class="body">
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<form action="toursearch" method="POST">
		<div class="totalSearch">
			<div class="title">
				<p class="banner-sub">
					서울 관광을 고민중이신가요?<br>
					'서울 함께 가는 길'을 따라 편안하고 안전한 관광하세요.
				</p>
				<h2 class="banner-title">관광지 검색</h2>
				<div class="searchbox">
					<input type="text" class="bar" id="word" name="word"
						style="color: gray;" required size="30" placeholder="원하시는 관광지를 검색해 보세요.">
					<button type="submit" class="search-btn"><span class="material-symbols-outlined">search</span></button>
				</div>
			</div>
		</div>
	</form>
	<div class="searchbackground">
		<div class="box">
			<form action="tourdetailsearch" method="GET">
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
		<!-- <div>
		<form action="totalrank" method="GET">
			<select class="rank">
			  <option value="좋아요">좋아요순</option>
			  <option value="기본" selected>기본</option>
			</select>
		</form>
		</div> -->

		<div class="tourresult" id="js-load">
		
			<c:forEach items="${tourlist}" var="tour">	
				
					<div class="tourlist lists__item js-load">
					<a href="${path}/guide/detail?id=${tour.tourist_id}" class="result-box">
						<div class="tourimg" style="background-image: url(./resources/img/tour/tour${tour.tourist_id}.jpg);"></div>
							<div class="tourtext">
								<p class="text1">${tour.tourist_title}</p>
								<p class="text2">${tour.tourist_subtitle}</p>
								<div>
									<i class="fa-sharp fa-solid fa-heart" style="color : red;"></i>
									<p>${tour.like_count }</p>
								</div>
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
						</a>
					</div>
				
			</c:forEach>
			   
			<div style="padding-top:20px;">
              <button class="reviewbutton" type="button" id="js-btn-wrap" class="more">관광지 더보기 +</button>
       		</div>
		</div>
		
	</div>
	<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>
</body>
</html>