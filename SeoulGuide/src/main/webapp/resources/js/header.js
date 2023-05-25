
bodyEl = document.querySelector('.body')
btn = document.querySelector('.btn')

btn.addEventListener('click', function() {
  if(bodyEl.classList.contains('dark')) {
    bodyEl.classList.remove('dark')
  }else {
    bodyEl.classList.add('dark')
  }
})

// 접근성팝업
showEL = document.querySelector('.background');

document.querySelector("#show").addEventListener("click", show);
document.querySelector("#close").addEventListener("click", close);
function show() {
  showEL.className = "show";
  console.log("hello");
}
function close() {
  showEL.className = "background";
}



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


