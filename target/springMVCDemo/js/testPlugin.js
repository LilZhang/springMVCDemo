;(function($) {
    $.fn.extend({
        "color" : function(value) {
            // code here
            if (value == undefined) {
                return this.css("color");
            } else {
                return this.css("color", value);
            }
        }
    });
})(jQuery);