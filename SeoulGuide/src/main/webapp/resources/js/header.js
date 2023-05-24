
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

menuBtn.addEventListener('click', function() {
  if(menuBtn.classList.contains('close')) {
    menuBtn.classList.remove('close')
    menu.classList.remove('open')
  }else {
    menuBtn.classList.add('close')
    
    menu.classList.add('open')
  }
})


