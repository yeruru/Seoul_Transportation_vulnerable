<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>관광지 맞춤 테스트</title>
	<jsp:include page="/WEB-INF/views/head.jsp"></jsp:include>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
	<link rel="stylesheet" href="<c:url value="/resources/css/test.css"/>">
	<script defer src="<c:url value="/resources/js/test.js"/>"></script>
</head>
<body class="body">
  <jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
  <div class="content-wrap">
	  <section class="start">
	  	<img class="main-img" src="<c:url value="/resources/img/test-main.svg"/>" alt="관광지테스트 이미지">
	    <div class="text-box">
	    	<p>재미로 보는!</p>
	    	<img src="<c:url value="/resources/img/check-icon.png"/>" alt="관광지테스트 이미지">
	    </div>
	    <h2>맞춤 관광지<br>테스트</h2>
	    <p>나와 가장 어울리는 서울시 관광지는?</p>
	    <button type="button" onclick="start()" class="test-btn">테스트 시작하기</button>
	  </section>
	
	  <section class="question">
	    <div class="progress mt-5" role="progressbar" aria-label="Basic example" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100">
	      <div class="progress-bar" style="width: calc(100/12*1%)"></div>
	    </div>
	    <h2 id="qnum">문제번호</h2>
	    <h3 id="title">문제</h3>
	    <input id="type" type="hidden" value="EI">
	    <button id="A" type="button" class="question-btn mt-5">답1</button>
	    <button id="B" type="button" class="question-btn mt-5">답2</button>
	  </section>
	
	 	<section class="loading-screen">
		  <img src="<c:url value='/resources/img/test/loding.svg'/>" alt="로딩 이미지">
		  <p>어울리는 관광지를 분석중입니다..</p>
		</section>

	
	
	 <section class="result">
	 	<h2 id="mbtiResult">${result[mbti]["mbtiResult"]}</h2>
	 	<h3 id="subTitle">${result[mbti]["subTitle"]}</h3>
	 	<a href="<c:url value='/guide/detail?${result[mbti]["url"]}'/>" class="link-tour">
	 	  <em class="link-tour-btn">교통약자 정보 보기</em>
		  <img id="imgResult" src="<c:url value='/resources/img/test/${result[mbti]["img"]}'/>" alt="관광지테스트 이미지">
		</a>

	    <p id="explain">${result[mbti]["explain"]}</p>
	    <div>
	    	<div class="sh">
		    	<p>나에게 알맞은 관광지</p>
		    	<em>공유하기</em>
	    	</div>
	    	<div class="sns">
	    		<span class="url-btn">URL</span>
	    		<!--카카오 공유하기 -->
				<a id="kakao-link-btn" href="javascript:kakaoShare()">
	    			<img src="https://developers.kakao.com/assets/img/about/logos/kakaolink/kakaolink_btn_medium.png" />
	    		</a>
	    	</div>
	    </div>
	    <div class="link">
	    	<a href="./tourlist">다른 관광지 보러가기!
	    		<span class="material-symbols-outlined">arrow_forward_ios</span>
	    	</a>
	    	<a href="./test">테스트 다시하기!
	    		<span class="material-symbols-outlined">arrow_forward_ios</span>
	    	</a>
	    </div>
	</section>
	  <input type="hidden" id="EI" value="0">
	  <input type="hidden" id="SN" value="0">
	  <input type="hidden" id="TF" value="0">
	  <input type="hidden" id="JP" value="0">
  </div>
	<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js" integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>

</body>
<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>

<script type="text/javascript">
  // SDK를 초기화 합니다. 사용할 앱의 JavaScript 키를 설정해 주세요.
  Kakao.init('4b4224e1cfd2a573f7d966db8fa479fa');

  // SDK 초기화 여부를 판단합니다.
  console.log(Kakao.isInitialized());

  function kakaoShare() {
    Kakao.Link.sendDefault({
      objectType: 'feed',
      content: {
        title: '관광지 맞춤 테스트',
        description: '재미로 보는 관광지 맞춤 테스트! 나와 가장 어울리는 서울시 관광지는?',
        imageUrl: 'http://localhost:8080/guide/resources/img/test/loding.svg',
        link: {
          mobileWebUrl: 'http://localhost:8080/guide/test',
          webUrl: 'http://localhost:8080/guide/test',
        },
      },
      buttons: [
        {
          title: '테스트 시작하기',
          link: {
            mobileWebUrl: 'http://localhost:8080/guide/test',
            webUrl: 'http://localhost:8080/guide/test',
          },
        },
      ],
      // 카카오톡 미설치 시 카카오톡 설치 경로이동
      installTalk: true,
    })
  }
  
  
  function copyUrl() {
	  var url = window.location.href;

	  var tempInput = document.createElement("input");
	  tempInput.style.position = "absolute";
	  tempInput.style.left = "-1000px";
	  tempInput.style.top = "-1000px";
	  tempInput.value = url;
	  document.body.appendChild(tempInput);

	  tempInput.select();
	  document.execCommand("copy");
	  document.body.removeChild(tempInput);

	  alert("URL이 복사되었습니다.");
	}

	var urlBtn = document.querySelector(".url-btn");
	urlBtn.addEventListener("click", copyUrl);

  
</script>
</html>