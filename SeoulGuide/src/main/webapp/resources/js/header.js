
bodyEl = document.querySelector('.body')
btn = document.querySelector('.btn')

btn.addEventListener('click', function() {
  if(bodyEl.classList.contains('dark')) {
    bodyEl.classList.remove('dark')
  }else {
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

  if(accEl.classList.contains('show')) {
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

//화면확대축소
let nowZoom = 100;
const zoomBtn = document.querySelector('.zoom-text > a');

const zoomControl = {
  zoomOut: function() {
    nowZoom = nowZoom - 5;
    if (nowZoom <= 90) nowZoom = 90;
    zoomControl.zooms();
    zoomBtn.textContent = nowZoom + '%';
  },
  zoomIn: function() {
    nowZoom = nowZoom + 5;
    if (nowZoom >= 120) nowZoom = 120;
    zoomControl.zooms();
    zoomBtn.textContent = nowZoom + '%';
  },
  zoomReset: function() {
    nowZoom = 100;
    zoomControl.zooms();
    zoomBtn.textContent = nowZoom + '%';
  },
  zooms: function() {
    const aUserAgent = navigator.userAgent.toLowerCase();

    if (aUserAgent.indexOf('firefox') >= 0) {
      document.body.style.MozTransform = 'scale(' + nowZoom / 100 + ')';
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
  if(menuBtn.classList.contains('close')) {
    menuShow()
  }else {
    menuClose()
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


