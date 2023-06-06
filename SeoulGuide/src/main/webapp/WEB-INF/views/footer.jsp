<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
	<link rel="stylesheet" href="<c:url value="/resources/css/common.css"/>">
</head>
<style>
	footer { background-color: var(--footer); color: #6F6F6F; width: 100%; height: 200px; padding: 10px 0; margin-top: 170px;}
	.top { padding: 20px 0; display: flex;}
	.footer-nav:last-child { padding-left: 20px;}
	.top .footer-nav em { color: var(--c-tex); font-size: 16px; padding-bottom: 10px; display: inline-block;}
	.top .footer-nav a{ color: #878787; line-height: 22px; font-size: 12px;}
	.top .footer-nav a:hover { color: var(--c-tour-w);}
    .bottom { display: flex;justify-content: space-between; align-items: center; padding-top: 20px; border-top: 1px solid #CBCBCB;}
    .bottom .sns-icon { display: flex;}
    .bottom .sns-icon a { width: 25px; opacity: .6; margin: 0 auto; display: inline-block; padding-left: 12px; transition: all .2s;}
    .bottom .sns-icon a:last-child { width: 15px;}
    .bottom .sns-icon a:hover { opacity: 1;}
    .copy { font-size: 12px; color: #CBCBCB;}
</style>

<footer>
	<div class="box-wrap">
		<div class="top">
			<div class="footer-nav">
				<ul>
					<li>
						<em>관광지</em>
						<ul>
							<li><a href="./tourlist">관광지 간편 검색</a></li>
							<li><a href="./storyreview">관광 스토리</a></li>
							<li><a href="./test">관광지 TEST</a></li>
						</ul>
					</li>
				</ul>
			</div>
			<div class="footer-nav">
				<ul>
					<li>
						<em>지하철</em>
						<ul>
							<li><a href="./subway">지하철 간편 검색</a></li>
							<li><a href="./density">실시간교통</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
		<div class="bottom">
			<p class="copy">COPYRIGHT© 2023 SEOUL TEAM. All Right Reserved</p>	
			<div class="sns-icon">
				<a href="https://github.com/cjstmdgusqw/Seoul_Transportation_vulnerable" target="_blank"><img src="<c:url value="/resources/img/icons/GitHub.png"/>"alt="깃허브 링크 이동"></a>
				<a href="https://www.notion.so/94550100d43540e99423bd1d2d7e5715?pvs=4" target="_blank"><img src="<c:url value="/resources/img/icons/Notion.png"/>"alt="노션 링크 이동"></a>
				<a href="#" target="_blank"><img src="<c:url value="/resources/img/icons/Figma.png"/>"alt="피그마 링크 이동"></a>
			</div>	
		</div>
	</div>
</footer>