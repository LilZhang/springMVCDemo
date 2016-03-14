function Car() {
    var _output;
    var _size;
    var _factor;
}

Car.prototype.init = function(output, size, factor) {
    this._output = output;
    this._size = size;
    this._factor = factor;
}

Car.prototype.run = function() {
    var str = "";
    for (p in this) {
        //console.log(typeof this[p]);
        if (typeof this[p] != 'function') {
            str += this[p];
            str += " ";
        }
    }
    alert(str);
}