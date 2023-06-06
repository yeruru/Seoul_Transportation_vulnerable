<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<link rel="stylesheet" href="<c:url value="/resources/css/header.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
</head>

<header id="header">

	<div class="header-wrap">

		<!-- 접근성 -->
		<div>
			<a href="#;" class="accbtn"> <img
				src="<c:url value="/resources/img/accessicon.png"/>" alt="접근성 버튼">
			</a>

			<!-- 접근성 팝업 -->
			<div class="access">
				<div class="popup">
					<h3>접근성</h3>
					<div class="popup-con">
						<a href="#skip-nav" onclick="handleLinkClick(event)">본문 바로가기</a>
					</div>
					<div class="popup-con">
						<em>화면크기</em> <span class="zoom"> <span class="zoom-out"><a
								href="#" onclick="javascript:zoomControl.zoomOut()"><img
									src="<c:url value="/resources/img/zoomOut.png"/>" alt="화면축소"></a></span>

							<span class="zoom-text"><a href="#" title="화면초기화"
								onclick="javascript:zoomControl.zoomReset()">100%</a></span> <span
							class="zoom-in"><a href="#"
								onclick="javascript:zoomControl.zoomIn()"><img
									src="<c:url value="/resources/img/zoomIn.png"/>" alt="화면확대"></a></span>
						</span>
					</div>
					<div class="popup-con">
						<a href="#;" class="btn">다크모드</a>
					</div>
					<div class="not">
						<a href="#;" class="close"><span
							class="material-symbols-outlined">close</span></a>
					</div>
				</div>
			</div>
		</div>

		<!-- 로고 -->
		<h1 class="logo">
			<a href="./"> 
			<img src="<c:url value="/resources/img/logo.png"/>"alt="서울, 함께 가는 길"> 
			<img src="<c:url value="/resources/img/logo-dark.png"/>"alt="서울, 함께 가는 길" class="logo-dark">
			</a>
		</h1>

		<!-- 메뉴 -->
		<a href="#" class="menu"><span>메뉴열기/닫기</span></a>
		<div class="menu-bg"></div>
		<nav id="gnb" class="gnb">
			<ul class="gnb-box">
				<li><a href="./">HOME</a></li>
				<li class="not"><a href="#">관광지</a>
					<ul>
						<li><a href="./tourlist">관광지 간편 검색</a></li>
						<li><a href="./storyreview">관광스토리</a></li>
						<li><a href="./test">관광지 TEST</a></li>
					</ul></li>
				<li class="not"><a href="#">지하철</a>
					<ul>
						<li><a href="./subway">지하철 간편 검색</a></li>
						<li><a href="./density">실시간 교통</a></li>
					</ul></li>
				<c:choose>
					<c:when test="${sessionScope.email eq null }">
						<li><a href="./loginform">로그인</a></li>
						<li><a href="./joinform">회원가입</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="./logout">로그아웃</a></li>
					</c:otherwise>
				</c:choose>

			</ul>
		</nav>
	</div>

</header>

<script>
	bodyEl = document.querySelector('.body')
	btn = document.querySelector('.btn')

	btn.addEventListener('click', function() {
		if (bodyEl.classList.contains('dark')) {
			bodyEl.classList.remove('dark')
		} else {
			bodyEl.classList.add('dark')
		}
	})

	//접근성 팝업
	const accStarterEl = document.querySelector('header .accbtn')
	const accEl = document.querySelector('.access')
	const accClose = document.querySelector('.close')

	accStarterEl.addEventListener('click', function(event) {
		event.stopPropagation()
		//basketEl.classList.contains('show') //false or true
		// 클래스가 들어있는지 안들어있는지 확인하는것 contains

		if (accEl.classList.contains('show')) {
			hideBasket()
		} else {
			showBasket()
		}
	})
	accEl.addEventListener('click', function(event) {
		event.stopPropagation()
	})

	window.addEventListener('click', function() {
		hideBasket()
	})

	accClose.addEventListener('click', function() {
		hideBasket()
	})

	function showBasket() {
		accEl.classList.add('show')
	}
	function hideBasket() {
		accEl.classList.remove('show')
	}

	function handleLinkClick(event) {
		hideBasket();

		// 링크의 href 속성값을 가져와서 이동합니다
		const href = event.target.getAttribute('href');
		window.location.href = href;

		// 기본 동작을 막기 위해 preventDefault()를 호출합니다
		event.preventDefault();
	}

	//화면확대축소
	let nowZoom = 100;
	const zoomBtn = document.querySelector('.zoom-text > a');

	const zoomControl = {
		zoomOut : function() {
			nowZoom = nowZoom - 5;
			if (nowZoom <= 90)
				nowZoom = 90;
			zoomControl.zooms();
			zoomBtn.textContent = nowZoom + '%';
		},
		zoomIn : function() {
			nowZoom = nowZoom + 5;
			if (nowZoom >= 120)
				nowZoom = 120;
			zoomControl.zooms();
			zoomBtn.textContent = nowZoom + '%';
		},
		zoomReset : function() {
			nowZoom = 100;
			zoomControl.zooms();
			zoomBtn.textContent = nowZoom + '%';
		},
		zooms : function() {
			const aUserAgent = navigator.userAgent.toLowerCase();

			if (aUserAgent.indexOf('firefox') >= 0) {
				document.body.style.MozTransform = 'scale(' + nowZoom / 100
						+ ')';
				document.body.style.MozTransformOrigin = '0 0';
			} else {
				document.body.style.zoom = nowZoom + '%';
			}

			if (nowZoom === 90) {
				alert('더 이상 축소할 수 없습니다.');
			}
			if (nowZoom === 120) {
				alert('더 이상 확대할 수 없습니다.');
			}
		}
	};

	// 메뉴
	menuBtn = document.querySelector('.menu')
	menu = document.querySelector('.gnb')
	menubg = document.querySelector('.menu-bg')

	menuBtn.addEventListener('click', function() {
		if (menuBtn.classList.contains('close')) {
			menuShow()
			document.documentElement.classList.remove('fixed')
			
		} else {
			menuClose()
			document.documentElement.classList.add('fixed')
		}
	})

	function menuShow() {
		menuBtn.classList.remove('close')
		menu.classList.remove('open')
		menubg.classList.remove('show')
	}
	function menuClose() {
		menuBtn.classList.add('close')
		menu.classList.add('open')
		menubg.classList.add('show')
	}
</script>
