<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<title>관광지 리뷰</title>
	<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
	<link rel="stylesheet" href="<c:url value="/resources/css/story/storyReview.css"/>">
	<script src="<c:url value="/resources//js/jquery-3.3.1.js"/>"></script>
	<script defer src="<c:url value="/resources/js/story.js"/>"></script>
	
</head>
<body class="body">

	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<div class="sub-header-box">
		<jsp:include page="/WEB-INF/views/story/storyHeader.jsp"></jsp:include>
		<section id="tourreview" class="content-wrap">
			<h4>방문자 리뷰</h4>
	  		<div class="review-tumb">
	  			<div class="write-btn-box">
	  				<a href="#" class="write-btn">글쓰기</a>
	  			</div>
	  			
	  			
	  			
	  			
	  			<div id="js-load" class="main">
			        <ul class="menu">
			            <%-- 첫 번째 3개의 li 요소만 표시됨 --%>
			            <%
			                for (int i = 0; i < 10; i++) {
			            %>
			            <li class="lists__item js-load">
			                <a href="javascript:void(0);">
			                    <div class="tumb-box">
			                        <div class="tumb">
			                            <%-- tumb 내용 --%>
			                        </div>
			                        <div class="tumb-title">
			                            <em>서울숲 다녀왔습니다</em>
			                            <span>닉네임</span>
			                        </div>
			                        <p>서울숲 다녀왔는데 진짜 대박대박대박대박대박
			                            대박대박 멋있고 맛있는거 진짜 겁나겁나겁나겁나
			                            많고 완전 취향 탕탕탕탕탕탕탕탕탕탕탕탕면에다가 탕탕면을 
			                            먹으면 얼마나 맛있게요?</p>
			                    </div>
			                </a>
			            </li>
			            <%
			                }
			            %>
			        </ul>
			    </div>
			    
			    <div style="padding-top:20px;">
				  <button type="button" id="js-btn-wrap" class="more">더보기</button>
				</div>	
				
	  		<%-- <c:forEach items="${boards}" var="article">
				<tr>
					<td>${article.num }</td>
					<td><a href="boarddetail?num=${article.num}">${article.title }</a></td>
					<td>${article.writer }</td>
					<td>
						<c:if test="${sessionScope.id eq article.writer }">
							<a href="boarddelete?num=${article.num }">삭제</a>
						</c:if>
					</td>
				</tr>
			</c:forEach> --%>

		</section>
	</div>
</body>
</html>