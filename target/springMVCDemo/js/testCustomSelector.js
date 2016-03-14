;(function($) {
    $.extend($.expr[':'], {
        /*a : 当前遍历到的DOM元素
        i : 当前遍历到的DOM元素的索引值
        m : {
            若选择器为 $('div:gt(1)')
            m[0] = ':gt(1)'
            m[1] = ':'
            m[2] = 'gt'
            m[3] = '1'

            通用 $('div:l(ss(dd))')
            m[0] = ':l(ss(dd))'
            m[1] = ':'
            m[2] = 'l'
            m[3] = 'ss(dd)'
            m[4] = '(dd)'
        }*/

        between : function(a, i, m) {
            var tmp = m[3].split(',');
            return tmp[0]-0 < i && tmp[1]-0 > i;
        }
    });
})(jQuery);