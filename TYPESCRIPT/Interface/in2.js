"use strict";
class amp {
    a = 0;
    b = 0;
    x = 0;
    y = 0;
    sum() {
        return this.a + this.b;
    }
    sub() {
        return this.x - this.y; // Note: You might want '-' here instead of '+' for subtraction!
    }
}
// Renamed variable from 'a' to 'obj' to fix the naming conflict
const obj = new amp();
obj.a = 10;
obj.b = 12;
obj.x = 50;
obj.y = 10;
console.log(obj.sub()); // Added console.log to see the output
console.log(obj.sum()); // Added console.log to see the output
