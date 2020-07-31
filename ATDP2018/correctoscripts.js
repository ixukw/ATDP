$(document).ready(() => {
	// ACTUAL ASSIGNMENT SECTION
	$("div#longsongs ul, div#deadmovies ul").removeClass("oldclassfrom1997");
	$("div#irrationalsongs, div#longsongs").addClass("songerrors");
	$("div#futuremovies h4").remove();
	$("div#futuremovies").append($("div#futuremovies p"));
	$("h2:first-of-type").before($($("header")));
	/*
	The difference between .before() and .prepend() is that .before() adds
	it before the element specified, while .prepend() adds it as the first child of each element.
	*/
	$("div#irrationalsongs ul li:last-of-type").addClass("metaIrony");
	$("form#submission input[type=text]").prop("required", true);

	// EXTRA PRACTICE SECTION
	$("div#deadmovies, div#futuremovies").removeAttr("style");
	$("div#deadmovies h4.repeat").remove();
	$("div#deadmovies, div#futuremovies").addClass("movieerrors");
	$("div#longsongs ul").empty();
	$("div#dogs li").eq(4).css("transform", "scale(0.5)");
});
