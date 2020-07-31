(function ($) {
    var popupHtml = '<div class="popup"><img src=""><span></span><div class="close"></div></div>';

    $.jsdvPopup = function (options) {

        //default params
        options = $.extend({
            icon: 'checkmark.png',
            text: "Successfully added item to cart.",
            timeout: 5000
        }, options);
        //create and show message
        var $elem = $(popupHtml);
        $elem.find('img').attr("src", options.icon);
        $elem.find('span').text(options.text);
        $elem.appendTo($('body'));

        show($elem);

        //click handler
        $elem.find('.browseSubmit').on('click', function () {
            hide.call($(this).parent());
        });

        //setup timer
        setTimeout(function () {
            hide.call($elem);
        }, options.timeout);

        function show(elem) {
            elem.css({'bottom': -1 * elem.outerHeight(), "display": 'block'});
            elem.animate({'bottom': 10}, "fast");
        }

        function hide() {
            this.animate({'bottom': -1 * this.outerHeight()}, 'fast', 'swing', function () {
                $(this).remove();
            });
        }
    };
})(jQuery);
