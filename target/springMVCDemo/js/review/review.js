debugger

//a : typeof

var aString = 'aaa';
var aNumber = 33;
var aPerson = {
    name :   "name",
    age : 5
};
var aBoolean = true;

var tString = typeof aString;       // "string"
var tNumber = typeof aNumber;       // "number"
var tPerson = typeof aPerson;       // "object"
var tBoolean = typeof aBoolean;     // "boolean"
var tUndefined = typeof aUndefined; // "undefined"

//b : type casting

var bLength = aString.length;               // 3
var bString = aBoolean.toString();          // "true"
var bString2 = aNumber.toString(2);         // "100001"
var bInt = parseInt(bString2);              // 100001
var bFloat = parseFloat("3.1415926535");    // 3.1415926535

//c : force casting

var cBoolean1 = Boolean("");        // false    ["", null, 0]
var cBoolean2 = Boolean("hello");   // true     ["hello", 50, new object()]
var cNUmber = Number("1.2");        // 1.2
var cString = String(null);         // "null"

//d : property iterator
var dArray = [];
var dArray2 = [];
for (p in aPerson) {
    dArray.push(p);
    dArray2.push(aPerson[p]);
}


var reg1 = /1/g;

var isReg = reg1 instanceof RegExp;

var car = new Car();
car.init("1.5", "A", "wl");
car.run();

debugger