

const btn = document.querySelector('.submit-btn');
const hiddenInput = document.querySelector('.form');

btn.addEventListener('click', function() {
    var edi = editor.getHTML(); // 최신 HTML 내용을 가져옴
    hiddenInput.value = edi; // input 요소의 value 속성에 edi 변수의 값을 할당
    
});


 function openFileInput() {
        document.getElementById('fileInput').click();
    }

    function handleFileInput(event) {
        const fileInput = event.target;
        const file = fileInput.files[0];

        if (file) {
            const reader = new FileReader();
            reader.readAsDataURL(file);
            reader.onloadend = function() {
                const imageSrc = reader.result;
                document.getElementById('imageBox').src = imageSrc;
                document.getElementById('noImageText').style.display = 'none';
                document.getElementById('plusIcon').style.display = 'none';
            };
        } else {
            document.getElementById('imageBox').src = '';
            document.getElementById('noImageText').style.display = 'block';
            document.getElementById('plusIcon').style.display = 'block';
        }
    }

    function handleSubmit() {
        const imageSrc = document.getElementById('imageBox').src;
        if (!imageSrc) {
            alert('이미지를 추가해주세요!');
            return false; // 폼의 submit 동작을 막기 위해 false를 반환합니다.
        } else {
            // 이미지가 추가되었을 때의 처리 로직을 여기에 작성합니다.
            // 예: 서버에 이미지 업로드, 데이터 저장 등
            alert('이미지 등록이 완료되었습니다!');
            return true; // 폼을 정상적으로 submit합니다.
        }
    }




