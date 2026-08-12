"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var str = "typescript";
var str1 = "welcome to typescript";
console.log(str.charAt(0));
console.log(str.charAt(5));
//concat method - used to add two strings
var str2 = "learing";
var str3 = "typescript";
console.log(str2 + " " + str3);
//replace method- to replace a word or value
var str4 = "welcome to development";
console.log(str4.replace("l", "L"));
console.log(str4.replace("welcome", "ready"));
//split
var str5 = "hi this is kavya";
console.log(str5.split(" "));
console.log(str5.split(' ', 2)); //only 2 values will be printed
console.log(str5.split(' ', 1));
//substring
var str6 = "welcome everyone to CTS";
console.log(str6.substring(4, 8));
//toUpperCase
console.log(str4.toLowerCase());
//toLowerCase
console.log(str4.toUpperCase());
//trim 
var str7 = "    str   ";
console.log(str7.trim());
//# sourceMappingURL=string.js.map