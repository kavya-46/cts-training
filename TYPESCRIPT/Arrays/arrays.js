"use strict";
//ARRAYS
Object.defineProperty(exports, "__esModule", { value: true });
//type1:
var fruit = ["apple", "banana", "mango"];
//type2:
var fruit1;
fruit1 = ["kiwi", "avacado", "litchi"];
console.log(fruit);
console.log(fruit1);
//mutliple data type values storing
var fruit2 = ["apple", "khichdi", "brinjalfry", 5, 7];
console.log(fruit2);
//access a particular element
console.log(fruit[2]);
///using for loop
for (var i = 0; i < fruit.length; i++) {
    console.log(fruit[i]);
}
//for-each loop 
for (var j in fruit) {
    console.log(fruit[j]);
}
//2-Dimensional Array
var arr = [[2, 3, 4, 5, 2, 1], [1, 1, 2, 2, 1, 3, 1]];
console.log(arr);
var arr2 = [['a', 2], [3, 4], [4, 5, 2], ["akkas", "dlsaf", "dsa", "google", 50]];
console.log(arr2);
//for access
console.log(arr2[0][0]);
//accessing using for-loop
for (var k = 0; k < arr.length; k++) {
    for (var l = 0; l < arr[k].length; l++) {
        console.log(arr[k][l]);
    }
}
//using for-each loop
for (var m in arr) {
    for (var n in arr[m]) {
        console.log(arr[m][n]);
    }
}
//# sourceMappingURL=arrays.js.map