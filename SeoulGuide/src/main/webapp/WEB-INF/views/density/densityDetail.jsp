<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>

<title>Density Detail</title>
<!-- 표 디자인용 -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!-- Add Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<!-- Add Bootstrap JS -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<style>
.bg-orange {
	background-color: orange !important;
}
</style>

<!-- head -->
<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
</head>

<body class="body">

<!-- head -->
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>

<div class="content-wrap">

	<div>
		<div>
			<div>
				<h2 class="my-4">${cityDataResponse.getCityData().getAreaName()}</h2>
			</div>
		</div>


		<!-- 혼잡도 출력 코드 -->
		<div>
			<div>
				<h4>인구혼잡도</h4>
				<c:choose>
					<c:when
						test="${cityDataResponse.getCityData().getOuterLivePopulationStatus().getInnerLivePopulationStatus().getAreaCongestLevel() eq '여유'}">
						<div class="progress">
							<div class="progress-bar bg-success" role="progressbar"
								style="width: 25%;" aria-valuenow="25" aria-valuemin="0"
								aria-valuemax="100">여유</div>
						</div>
					</c:when>
					<c:when
						test="${cityDataResponse.getCityData().getOuterLivePopulationStatus().getInnerLivePopulationStatus().getAreaCongestLevel() eq '보통'}">
						<div class="progress">
						
							<!-- 보통색상 파랑으로 강제변경함,, -->
							<div class="progress-bar " role="progressbar"
								style="width: 50%;" aria-valuenow="50" aria-valuemin="0" 
								background-color="rgba(13, 153, 255, 1); color: white;"
								aria-valuemax="100">보통</div>
						</div>
					</c:when>
					<c:when
						test="${cityDataResponse.getCityData().getOuterLivePopulationStatus().getInnerLivePopulationStatus().getAreaCongestLevel() eq '약간 붐빔'}">
						<div class="progress">
							<div class="progress-bar bg-orange" role="progressbar"							
								style="width: 75%;" aria-valuenow="75" aria-valuemin="0"
								aria-valuemax="100">약간 붐빔</div>
						</div>
					</c:when>
					<c:otherwise>
						<div class="progress">
							<div class="progress-bar bg-danger" role="progressbar"
								style="width: 100%;" aria-valuenow="100" aria-valuemin="0"
								aria-valuemax="100">붐빔</div>
						</div>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
		<div>
			<div>
				<h4 class="my-4"></h4>
				<p>${cityDataResponse.getCityData().getOuterLivePopulationStatus().getInnerLivePopulationStatus().getAreaCongestMessage()}</p>
			</div>
		</div>


		<!-- 도로 교통 상황 출력 코드 -->
		<div>
			<div>
				<h4 class="my-4">도로소통 단계</h4>

				<div class="progress">
					<c:choose>
						<c:when
							test="${cityDataResponse.getCityData().getRoadTrafficStts().getAvgRoadData().getRoadTrafficIdx() eq '정체'}">
							<div class="progress-bar  bg-danger" role="progressbar"
								style="width: 100%" aria-valuenow="100" aria-valuemin="0"
								aria-valuemax="100">정체</div>
						</c:when>
						<c:when
							test="${cityDataResponse.getCityData().getRoadTrafficStts().getAvgRoadData().getRoadTrafficIdx() eq '서행'}">
							<div class="progress-bar bg-warning" role="progressbar"
								style="width: 66%" aria-valuenow="66" aria-valuemin="0"
								aria-valuemax="100">서행</div>
						</c:when>
						<c:otherwise>
							<div class="progress-bar bg-success" role="progressbar"
								style="width: 33%" aria-valuenow="33" aria-valuemin="0"
								aria-valuemax="100">원활</div>
						</c:otherwise>
					</c:choose>
				</div>
				<p>
					<br>${cityDataResponse.getCityData().getRoadTrafficStts().getAvgRoadData().getRoadMsg()}<br>
					평균 속도:
					${cityDataResponse.getCityData().getRoadTrafficStts().getAvgRoadData().getRoadTrafficSpd()}Km/h
					(${cityDataResponse.getCityData().getRoadTrafficStts().getAvgRoadData().getRoadTrafficIdx()})
				</p>


				<style>
.traffic-speed {
	color: green;
}

.traffic-speed:contains( '서행 ') {
	color: yellow;
}

.traffic-speed:contains( '정체 ') {
	color: red;
}
</style>
			</div>
		</div>

		<!-- 주차장 상태 출력 코드 -->
		<div class="my-4">

			<h2>${cityDataResponse.getCityData().getAreaName()}주차 공간</h2>
			<p>잔여 주차공간 :
				${cityDataResponse.getCityData().getRemainingCapacity()} /
				${cityDataResponse.getCityData().getTotalCapacity()}</p>
			<p>주차장 잔여율 :
				${cityDataResponse.getCityData().getRemainingRate()}%</p>
		</div>
		<table class="table table-bordered table-striped">
			<thead class="thead-dark">
				<tr>
					<th>주차장명</th>
					<th>잔여현황</th>
					<th>위치</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach
					items="${cityDataResponse.getCityData().getPrkSttsList()}"
					var="parking">
					<tr>
						<td>${parking.getPrkNm()}</td>
						<td>${parking.getCurPrkCnt()}/${parking.getCpcty()}</td>
						<td>${parking.getAddress()}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<!-- 날씨 -->
		<link rel="stylesheet"
			href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<h1 class="mt-4">날씨 정보</h1>
		<div class="table-responsive">
			<table class="table mt-4">
				<tbody>
					<tr>
						<th>날씨 시각</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getWeatherTime()}</td>
						<th>최고기온</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getMaxTemperature()}</td>
					</tr>
					<tr>
						<th>온도</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getTemperature()}</td>
						<th>최저기온</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getMinTemperature()}</td>
					</tr>
					<tr>
						<th>체감온도</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getSensibleTemperature()}</td>
						<th>습도</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getHumidity()}</td>
					</tr>
					<tr>
						<th>풍향</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getWindDirection()}</td>
						<th>풍속</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getWindSpeed()}</td>
					</tr>
					<tr>
						<th>강수량</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getPrecipitation()}</td>
						<th>강수 소식</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getPrecipitationMsg()}</td>
					</tr>
					<tr>

						<th>일출</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getSunrise()}</td>
						<th>일몰</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getSunset()}</td>
					</tr>
					<tr>

						<th>자외선(UV) 지수</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getUvIndexLevel()}</td>
						<th>자외선(UV)</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getUvIndex()}</td>
					</tr>
					<tr>

						<th>미세먼지 PM2.5</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getPm25Index()}</td>
						<th>미세먼지 PM2.5 지수</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getPm25()}</td>
					</tr>
					<tr>

						<th>미세먼지 PM10</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getPm10Index()}</td>
						<th>미세먼지 PM10 지수</th>
						<td>${cityDataResponse.getCityData().getOuterWeatherStts().getInnerweatherStts().getPm10()}</td>
					</tr>


				</tbody>
			</table>
		</div>








	</div>

</div>

	<!-- footer -->
	<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>

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

</html>
