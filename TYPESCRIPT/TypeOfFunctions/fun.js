"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function dis() {
    console.log("welcome to named fucntion");
}
dis();
function dis2(x, y) {
    console.log(x + y);
}
dis2(3, 4);
//anonymous function
var ann = function () {
    console.log("anony");
};
ann();
var ann1 = function (a, b) {
    return a * b;
};
console.log(ann1(2, 5));
//optional 
//optional parameter, default parameter
// function greety(name:string, name2?:string) {
//     return name+" "+name2;
// }
// console.log(greety("a"))
//default parameter
function gree(name, name2 = "helloguys") {
    return name + " " + name2;
}
console.log(gree("a"));
console.log(gree("a", "b"));
//# sourceMappingURL=fun.js.map