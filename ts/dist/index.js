"use strict";
let a = 1 + 2;
let b = a + 3;
let c = {
    apple: a,
    banana: b
};
let d = c.apple * 4;
console.log(d);
// objects
let an = {
    b: 4
};
const mb = {
    c: 5
};
const nbv = 9;
console.log(an.b);
let ta = {
    name: 'dfdfd',
    age: 4
};
let ar = [1, 2, 3, 4, 5];
var Language;
(function (Language) {
    Language[Language["Spanish"] = 0] = "Spanish";
    Language[Language["Italain"] = 1] = "Italain";
})(Language || (Language = {}));
console.log(Language.Spanish);
console.log(Language.Italain);
const someFuction = (aString, aPersonType = { name: 'dvd', age: 9 }) => {
    console.log(aString);
    console.log(aPersonType.name);
};
someFuction('personName');
//# sourceMappingURL=index.js.map