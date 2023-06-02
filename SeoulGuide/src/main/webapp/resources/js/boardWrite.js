

const btn = document.querySelector('.submit-btn');
const hiddenInput = document.querySelector('.form');

btn.addEventListener('click', function() {
    var edi = editor.getHTML(); // 최신 HTML 내용을 가져옴
    hiddenInput.value = edi; // input 요소의 value 속성에 edi 변수의 값을 할당
    
});


 



