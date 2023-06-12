$(document).ready(function () {
	load('#js-load', 6, '#js-btn-wrap');

	$("#js-btn-wrap").on("click", function () {
		load('#js-load', 6, '#js-btn-wrap');
	});
});


function load(id, cnt, btn) {
	var girls_list = id + " .js-load:not(.active)";
	var girls_length = $(girls_list).length;
	var girls_total_cnt;
	if (cnt < girls_length) {
		girls_total_cnt = cnt;
	} else {
		girls_total_cnt = girls_length;
		$(btn).hide();
	}
	$(girls_list + ":lt(" + girls_total_cnt + ")").addClass("active");
}


$(document).ready(function() {
    $('#search-input').on('keydown', function(e) {
        if (e.which == 13) {  // 13 is the keycode for the enter key
            e.preventDefault();  // prevent the default action (form submission)
            var searchInput = $('#search-input').val();
            if (searchInput) {
                window.location.href = '/guide/storyreview?search=' + encodeURIComponent(searchInput);
            } else {
                alert('검색어를 입력해주세요');
            }
        }
    });

    $('#search-button').click(function() {
        var searchInput = $('#search-input').val();
        if (searchInput) {
            window.location.href = '/guide/storyreview?search=' + encodeURIComponent(searchInput);
        } else {
            alert('검색어를 입력해주세요');
        }
    });
});

// 인기순 최신순
const popularButton = document.querySelector('.filter a[href="javascript:void(0);"]');
const latestButton = document.querySelector('.filter a[href="javascript:void(0);"].on');

popularButton.addEventListener('click', function() {
  popularButton.classList.add('on');
  latestButton.classList.remove('on');
});

latestButton.addEventListener('click', function() {
  latestButton.classList.add('on');
  popularButton.classList.remove('on');
});
