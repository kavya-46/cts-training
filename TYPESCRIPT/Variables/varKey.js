"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
//var localVar = 90 // if defined outside the function can be accessed anywhere
function varkey() {
    if (true) {
        var localVar = 9;
        console.log(localVar); //true
    }
    console.log(localVar);
}
varkey();
//console.log(localVar)// false
//# sourceMappingURL=varKey.js.map