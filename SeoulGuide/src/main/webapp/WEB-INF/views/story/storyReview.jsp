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
		<section id="tourreview" class="box-wrap">
			
			
	  		<div class="review-tumb">
	  			
	  			<div class="write-btn-box">
	  				<h4>방문자 리뷰</h4>
	  				<a href="writeform" class="write-btn" title="리뷰 글쓰기">
	  					<span class="material-symbols-outlined">edit</span>
	  				</a>
	  			</div>
	  			

	  			<div id="js-load" class="main">
			        <ul class="menu">
			           <%--  <%-- 첫 번째 3개의 li 요소만 표시됨 --%>
			           <%--  <%
			                for (int i = 0; i < 1; i++) {
			            %> --%> 
			            
			          <c:forEach items="${boards}" var="article">
			            <li class="lists__item js-load">
			                <a href="storydetail?post_id=${article.post_id}">
			                    <div class="tumb-box">
			                        <div class="tumb">
			                            <%-- tumb 내용 --%>
			                        </div>
			                        <div class="tumb-title">
			                        	<em>${article.post_title }</em>
			                        	
			                        </div>
			                      </div>
				                </a>
				           </li>
			            </c:forEach>
			           <%-- <%
			                }
			            %> --%>
			        </ul>
			    </div>
			    
			    <div style="padding-top:20px;">
				  <button type="button" id="js-btn-wrap" class="more">리뷰 더보기</button>
				</div>	
				
	  		<%-- 
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