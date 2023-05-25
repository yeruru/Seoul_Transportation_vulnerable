<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<!-- <jsp:include page="/WEB-INF/views/head.jsp"/>-->
<link rel="stylesheet" href="<c:url value="/resources/css/header.css"/>">
<!--<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">-->
<script defer src="<c:url value="/resources/js/header.js"/>"></script>
</head>

<header id="header">

<div class="header-wrap">

	<!-- 접근성 -->
	<div>
	  <button id ="show" type="button" class="accbtn"><img src="<c:url value="/resources/img/accessicon.png"/>" alt="접근성 버튼"></button>
	  <div class="background">
	    <div class="access">
	        <div class ="popup">
	          <div class = "accesstitle">
	            <h3>접근성을 선택해주세요</h3>
	            <button id="close">X</button>
	          </div>
	          <div class = "btnclass"><button class="btn">다크모드</button></div>
	          <div><a href="">본문 바로가기</a></div>
	        </div>
	    </div>
	  </div>
	</div> 
	
	<!-- 로고 -->
	<h1 class="logo">
	  <a href="#">
	    <img src="<c:url value="/resources/img/logo.png"/>"  alt="서울, 함께 가는 길">
	    <img src="<c:url value="/resources/img/logo-dark.png"/>"  alt="서울, 함께 가는 길" class="logo-dark">
	  </a>
	</h1>
	
	<!-- 메뉴 -->
      <a href="#" class="menu"><span>메뉴열기/닫기</span></a>
            <div class="menu-bg"></div>
            <nav id="gnb" class="gnb">
              <ul class="gnb-box">
                <li><a href="#">HOME</a></li>
                <li class="not">
                  <a href="#">관광지</a>
                  <ul>
                    <li><a href="#">관광지 간편 검색</a></li>
                    <li><a href="#">관광스토리</a></li>
                    <li><a href="#">관광지 TEST</a></li>
                  </ul>
                </li>
                <li class="not">
                  <a href="#">지하철</a>
                  <ul>
                    <li><a href="#">지하철 간편 검색</a></li>
                    <li><a href="#">실시간 교통</a></li>
                  </ul>
                </li>
                <li><a href="#">로그인</a></li>
                <li><a href="#">회원가입</a></li>
              </ul>
            </nav>
	
	</div>
</header>


