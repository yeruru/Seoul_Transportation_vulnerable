<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="<c:url value="/resources/css/tour/tourdetail.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
<script src="<c:url value="/resources/js/jquery-3.3.1.js"/>"></script>
<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
</head>
<body class="body">
	<script type="text/javascript"
		src="//dapi.kakao.com/v2/maps/sdk.js?appkey=128269215f9b3f3f6cff3575bebaaa81&libraries=services"></script>
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<section class="content-wrap" id="detail">
		<p class="title">${tourdetail.tourist_name }</p>
		<p class="subtitle">${tourdetail.tourist_subtitle }</p>

		<ul class="sidebar">
			<li><a href="#detail2">상세정보</a></li>
			<li><a href="">댓글보기</a></li>
			<li><a href="">주변 지하철역 편의시설</a></li>
			<li><a href="">관광스토리</a></li>
		</ul>

		<section id="detail">
			<div>
				<div class="tourimg"
					style="background-image: url(./resources/img/tour/tour${tourdetail.tourist_id}.jpg); width : 500px; height : 300px;"></div>
			</div>
		</section>
		<section id="detail2">
			<div class="content">
				<p style="font-weight: bold">상세정보</p>
				<div class="line"></div>
				<p class="tourlistContent">${tourdetail.tourist_content }</p>
				<div id="map${tourdetail.tourist_id}"
					style="width: 100%; height: 200px; margin-top: 30px"></div>

				<div class="detailcontent">
					<div class = "detailcontent1">
						<div>문의 및 안내 : <span>${tourdetail.tourist_phonenumber}</span></div>
						<div>주소 : <span>${tourdetail.local}</span></div>
						<div>관광 가능 시간 : <span>${tourdetail.tourist_time}</span></div>
						<div>휴일 : <span>${tourdetail.tourist_restdate}</span></div>
						<div>홈페이지 : <a href = "${tourdetail.tourist_site}">${tourdetail.tourist_site}</a></div>
					</div>
					<div class = "detailcontent2">
						<c:choose>
							<c:when test="${tourdetail.menu_icon1 == 1}">
								<div>장애인용 출입문 : <span>있음</span></div>
							</c:when>
							<c:otherwise>
								<div>장애인용 출입문 : <span>없음</span></div>
							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when test="${tourdetail.menu_icon2 == 1}">
								<div>휠체어 대여 유무 : <span>가능</span></div>
							</c:when>
							<c:otherwise>
								<div>휠체어 대여 유무 : <span>없음</span></div>
							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when test="${tourdetail.menu_icon3 == 1}">
								<div>장애인용 화장실 : <span>있음</span></div>
							</c:when>
							<c:otherwise>
								<div>장애인용 화장실 : <span>없음</span></div>
							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when test="${tourdetail.menu_icon4 == 1}">
								<div>장애인 전용 주차장 : <span>있음</span></div>
							</c:when>
							<c:otherwise>
								<div>장애인 전용 주차장 : <span>없음</span></div>
							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when test="${tourdetail.menu_icon5 == 1}">
								<div>임산부 전용 휴식처: <span>있음</span></div>
							</c:when>
							<c:otherwise>
								<div>임산부 전용 휴식처 : <span>없음</span></div>
							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when test="${tourdetail.menu_icon6 == 1}">
								<div>점자가이드 : <span>있음</span></div>
							</c:when>
							<c:otherwise>
								<div>점자가이드 : <span>없음</span></div>
							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when test="${tourdetail.menu_icon7 == 1}">
								<div>오디오 가이드 : <span>있음</span></div>
							</c:when>
							<c:otherwise>
								<div>오디오 가이드 : <span>없음</span></div>
							</c:otherwise>
						</c:choose>
					</div>
				</div>

			</div>
		</section>
		
		<section id = "detail3">
				<div class="tourstory">
					<div class = "tourname">
						<p class="titletour">해당 관광지를 다녀오셨나요?</p>
						<p class="subtitletour">다녀오셨다면, 다양한 관광경험을 나눠주세요</p>		
					</div>
					<div><a href = "./storyreview"><button>관광스토리</button></a></div>
				</div>
				
				<div class="comment">
					<p class="commenttitle">관광후기 <span>* 로그인 후 댓글 작성이 가능합니다.</span></p> 
					<div class="line2"></div>
					<div>
						<textarea id="comment" name="commentmain" class="commentmain" title="여행경험 입력" placeholder="관광후기를 남겨주세요."   style="resize: none;"></textarea>
					</div>
					<div class="commentbutton">
						<button>등록하기</button>
					</div>
				</div>
				
				
		</section>

		<script>
					mapContainer = document.getElementById('map${tourdetail.tourist_id}'), // 지도를 표시할 div 
					mapOption = {
						center : new kakao.maps.LatLng(${tourdetail.lati}, ${tourdetail.logi}), // 지도의 중심좌표
						level : 3
					// 지도의 확대 레벨
					};

					// 지도를 생성합니다    
					var map = new kakao.maps.Map(mapContainer, mapOption);

					// 주소-좌표 변환 객체를 생성합니다
					var geocoder = new kakao.maps.services.Geocoder();

					// 주소로 좌표를 검색합니다
					geocoder.addressSearch('${tourdetail.local}',function(result, status) {

										// 정상적으로 검색이 완료됐으면 
										if (status === kakao.maps.services.Status.OK) {

											var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
											console.log(coords);

											// 결과값으로 받은 위치를 마커로 표시합니다
											var marker = new kakao.maps.Marker(
													{
														map : map,
														position : coords
													});

											// 인포윈도우로 장소에 대한 설명을 표시합니다
											var infowindow = new kakao.maps.InfoWindow(
													{
														content : '<div style="width:150px;text-align:center;padding:6px 0;"><a href = "https://map.kakao.com/link/to/${tourdetail.local},${tourdetail.lati},${tourdetail.logi}">길찾기</a></div>'
													});
											infowindow.open(map, marker);

											// 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
											map.setCenter(coords);
										}
									});
				</script>
	</section>
</body>

</html>

