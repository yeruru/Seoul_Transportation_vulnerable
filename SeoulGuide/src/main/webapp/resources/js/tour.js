$(document).ready(function () {
	load('#js-load',6, '#js-btn-wrap');

	$("#js-btn-wrap").on("click", function () {
		load('#js-load',4, '#js-btn-wrap');
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


$(document).ready(function(){
	$("#login").click(function(){
		$(".shadow-bg").addClass("show");
		$(".login-popup-content").addClass("show");
	});
	
	$("#commenttext").click(function(){
		$(".shadow-bg").addClass("show");
		$(".login-popup-content").addClass("show");
	});
	
	$(".material-symbols-outlined").click(function(){
		$(".shadow-bg").removeClass("show");
		$(".login-popup-content").removeClass("show");
	});
	$("#shadow-bg").click(function(){
		$(".shadow-bg").removeClass("show");
		$(".login-popup-content").removeClass("show");
	});
	
});