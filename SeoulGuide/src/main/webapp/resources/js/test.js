var num =1;
var q = {
  1: {"qnum": "Q1.", "title": "문제", "type": "EI", "A": "E", "B": "I"},
  2: {"qnum": "Q2.", "title": "문제", "type": "SN", "A": "S", "B": "N"},
  3: {"qnum": "Q3.", "title": "문제", "type": "TF", "A": "T", "B": "F"},
  4: {"qnum": "Q4.", "title": "문제", "type": "JP", "A": "J", "B": "P"},
  5: {"qnum": "Q5.", "title": "문제", "type": "EI", "A": "E", "B": "I"},
  6: {"qnum": "Q6.", "title": "문제", "type": "SN", "A": "S", "B": "N"},
  7: {"qnum": "Q7.", "title": "문제", "type": "TF", "A": "T", "B": "F"},
  8: {"qnum": "Q8.", "title": "문제", "type": "JP", "A": "J", "B": "P"},
  9: {"qnum": "Q9.", "title": "문제", "type": "EI", "A": "E", "B": "I"},
  10: {"qnum": "Q10.", "title": "문제", "type": "SN", "A": "S", "B": "N"},
  11: {"qnum": "Q11.", "title": "문제", "type": "TF", "A": "T", "B": "F"},
  12: {"qnum": "Q12.", "title": "문제", "type": "JP", "A": "J", "B": "P"}
}

var result = {
  "ISTJ": {"mbtiResult" : "창덕궁과 후원", "explain": "당신은 체계적이고 조직적인 일정과 목표를 가지며 관광지에 대해서도 공부해가는 타입입니다. 유네스코 세계문화유산에 등재되어 있는 창덕궁과 후원 을 추천합니다.", "img": "imgk.png"},
  "ISTP": {"mbtiResult" : "서울식물원", "explain": "당신은 자유로운 스타일로 새로운 경험을 즐기며, 자연 경관이나 자유로움과 독립성을 중요시하는 타입입니다. 서울속에서 자연을 탐험할 수 있는 서울식물원 호수공원 을 추천합니다.", "img": "imgk.png"},
  "ISFJ": {"mbtiResult" : "서울숲", "explain": "당신은 안정적이고 따뜻한 관광을 좋아하며, 자연 속에서 휴식을 찾는 타입입니다. 따뜻한 감성을 채워줄 서울숲 을 추천합니다.", "img": "imgk.png"},
  "INFJ": {"mbtiResult" : "63빌딩 63아트", "explain": "당신은 문화적인 행사나 예술 관련 장소에 관심이 많으며, 예술, 철학, 문학 등의 영감을 얻을 수 있는 장소를 찾는 타입입니다. 다양한 장르의 미술작품을 좀 더 친숙하게 즐길 수 있는 63빌딩 63아트 을 추천합니다.", "img": "imgk.png"},
  "INTP": {"mbtiResult" : "코엑스아쿠아리움", "explain": "당신은 내적 성장과 감정적인 경험을 추구하는 관광 스타일이며, 조용하고 평화로운 자연 속에서 여유로움을 찾는 것을 좋아하는 타입입니다. 정신적인 활동을 즐길 수 있는 코엑스아쿠아리움 를 추천합니다.", "img": "imgk.png"},
  "INFJ": {"mbtiResult" : "사비나미술관", "explain": "당신은 깊은 생각과 내적인 성장을 추구하는 관광 스타일이며, 예술, 철학, 문학 등의 영감을 얻을 수 있는 장소를 찾는 타입입니다. 문화적인 면모를 탐험할 수 있는 사비나미술관 을 추천합니다.", "img": "imgk.png"},
  "ISFP": {"mbtiResult" : "서울창포원", "explain": "당신은 아름다운 자연과 예술, 문화에 대한 경험을 중요시 하며, 예술적이고 감성적인 관광 장소를 찾는 타입입니다. 여린 감성이 피어날 수 있는 서울창포원 을 추천합니다.", "img": "imgk.png"},
  "INFP": {"mbtiResult" : "푸른수목원", "explain": "당신은 감정적인 경험을 추구하는 관광 스타일이며, 자연 속에서 여유로움을 찾을 수 있는 장소를 찾는 타입입니다. 정신적인 활동을 즐길 수 있는 푸른수목원 을 추천합니다.", "img": "imgk.png"},
  "ENTJ": {"mbtiResult" : "국립중앙박물관", "explain": "당신은 목표 지향적이고 도전적인 관광 스타일을 가지며, 새로운 경험과 도전을 통해 성장하는 타입입니다. 관광과 자기계발을 동시에 즐길 수 있는 국립중앙박물관 을 추천합니다", "img": "imgk.png"},
  "ENTP": {"mbtiResult" : "금천예술공장", "explain": "당신은 호기심이 많고 창의적인 관광 스타일을 가지며, 새로운 아이디어를 탐구하는 것을 즐기는 타입입니다. 무엇을 상상하든 그 이상을 보여주는 금천예술공장 을 추천합니다.", "img": "imgk.png"},
  "ENFJ": {"mbtiResult" : "일자산허브천문공원", "explain": "당신은 아름다운 풍경을 관찰하고 경험하는 관광 스타일을 가지며, 자연 속에서 신선한 공기를 마시고, 아름다운 풍경을 감상하며 산책하는 활동을 즐기는 타입입니다. 마음을 안정시키고 새로운 영감을 불어넣을 수 있는 일자산허브천문공원 을 추천합니다.", "img": "imgk.png"},
  "ESFJ": {"mbtiResult" : "무중력지대", "explain": "당신은 사람과의 교류를 중요시 하는 관광 스타일이며, 다른 사람들과의 커뮤니케이션을 즐깁니다! 커뮤니티 활동을 즐길 수 있는 무중력지대 을 추천합니다", "img": "imgk.png"},
  "ESFP": {"mbtiResult" : "하이커그라운드", "explain": "당신은 사회적이고 활기찬 관광 스타일을 가지며, 문화, 행사, 공연, 축제 등 다양한 이벤트와 파티에 참여하는 것을 즐기는 타입입니다. 즐거움과 낙천적인 기운이 가득한 하이커그라운드 를 추천합니다.", "img": "imgk.png"},
  "ENFP": {"mbtiResult" : "광나루한강공원", "explain": "당신은 자유로운 관광 스타일을 가지며, 다양한 경험과 새로운 만남을 찾는 것을 좋아합니다. 자유로움을 추구하며 열정을 마음껏 발산할 수 있는 광나루한강공원 를 추천합니다.", "img": "imgk.png"},
  "ESTP": {"mbtiResult" : "롯데월드", "explain": "당신은 활동적이고 모험적인 관광 스타일 이며, 새로운 경험이나 자극을 찾는 타입 입니다. 활기찬 활동을 즐길 수 있는 롯데월드 을 추천합니다.", "img": "imgk.png"},
  "ESTJ": {"mbtiResult" : "고척스카이돔", "explain": "당신은 목표지향적이고 도전적인 관광 스타일이며, 실용적이고 현실적인 요소를 중요하게 생각하는 타입입니다. 콘서트나 야구 등을 직관할 수 있는 고척스카이돔 을 추천합니다", "img": "imgk.png"},
}

function start() {
  $(".start").hide();
  $(".question").show();
  next();
}

$("#A").click(function() {
  var type = $("#type").val();
  var preValue = $("#"+type).val();
  $("#"+type).val(parseInt(preValue)+1);
  next();
});

$("#B").click(function() {
  next();
});

function next() {
  if( num == 13 ) {
    $(".question").hide();
    $(".result").show();
    var mbti = "";
    ($("#EI").val() < 2) ?  mbti += "I" : mbti += "E";
    ($("#SN").val() < 2) ?  mbti += "N" : mbti += "S";
    ($("#TF").val() < 2) ?  mbti += "F" : mbti += "T";
    ($("#JP").val() < 2) ?  mbti += "P" : mbti += "J";
    $("#img").attr("src",result[mbti]["img"]);
    $('#mbtiResult').html(result[mbti]["mbtiResult"]);
    $('#explain').html(result[mbti]["explain"]);
  } else {
    $(".progress-bar").attr('style','width: calc(100/12*'+num+'%)');
    $("#qnum").html(q[num]["qnum"]);
    $("#title").html(q[num]["title"]);
    $("#type").val(q[num]["type"]);
    $("#A").html(q[num]["A"]);
    $("#B").html(q[num]["B"]);
    num++;
  }
}