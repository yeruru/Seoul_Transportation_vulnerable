<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="/WEB-INF/views/head.jsp"/>
	<!-- Latest compiled and minified CSS -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<!-- Latest compiled JavaScript -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<link rel=stylesheet  href="<c:url value="/resources/css/subway/subway.css"/>"/>
 	<title>지하철 간편 검색</title>
</head>
<body class="body" >

	<jsp:include page="/WEB-INF/views/header.jsp"/>

<section class="subway">

	<div class="subway-head">
	
		<div class="subway-wrap box-wrap">
			<div>	
				<p class="banner-sub">
				서울 관광을 고민중이신가요? <br>
				‘서울, 함께 가는 길’ 을 따라 편안하고 안전한 관광하세요.
				</p>
				<h2 class="banner-title">지하철 검색</h2>
			</div>
		</div>

		<div class="subway-form">
			<h4>각 지하철역 교통편의 시설을 알려드립니다.</h4>
				<form action="./search" method ="post">
					<input class="form-control-plaintext" type="text" name="STIN_NM" value="${STIN_NM}" placeholder="역명으로 검색해주세요 (서울역제외)"/>
					<hr>
					<div class="btn-box">
						<button class="btn btn-secondary" type="submit" >검색</button>
						<button class="btn btn-light" type="reset" >초기화</button>
					</div>
				</form>
			</div>
		<div class="subway-list box-wrap">
			<c:choose>
			    <c:when test="${empty STIN_NM}">
			        <!-- 검색을 아예 하지 않았을 때 아무 내용도 표시하지 않음 -->
			    </c:when>
			    <c:when test="${empty station}">
			        <div class="none-result">
			            <img src="<c:url value="/resources/img/none_result.png"/>" alt="검색결과없음">
			            <em>검색 결과가 없어요.</em>
			            <p>
			                ㆍ키워드를 정확하게 입력하셨는지 확인해보세요.<br>
			                ㆍ지하철 역명으로 검색해보세요. (예: 서울 -> 서울역)
			            </p>
			        </div>
			    </c:when>
			    <c:otherwise>
			        <c:forEach items="${station}" var="subway">
			            <div class="grid-box">
			                <a href="./subwaydetail?station=${STIN_NM}&line=${subway.LN_NM}">${subway.LN_NM}</a>
			            </div>
			        </c:forEach>
			    </c:otherwise>
			</c:choose>

		</div>
			
	</div>
	
</section>

	<div class="footer-box">
		<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>
	</div>
</body>

</html>