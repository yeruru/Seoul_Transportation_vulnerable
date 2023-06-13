<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="/WEB-INF/views/head.jsp" />
    <!-- Latest compiled and minified CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel=stylesheet  href="<c:url value="/resources/css/subway/subwayDetail.css"/>"/>
    <title>Insert title here</title>
</head>
<body>
    <jsp:include page="/WEB-INF/views/header.jsp" />
    <section class="content-wrap subway-detail">
        <div class= "subway-title">
            <h1>${station} 출입구 이동경로</h1>
            <p>*교통약자 경로를 알려드립니다.</p>
            <hr class="subway-hr">
            <div class="image-wrapper">
                <c:forEach var="move" items="${move}" begin="0" end="0" step="1">
                    <img src="${move.imgPath}" alt="Subway Image">
                </c:forEach>
            </div>
            <table class="move-table custom">
                <tbody>
                    <c:forEach var="move" items="${move}">
                        <tr>
                            <td>${move.mvContDtl}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </section>
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
