"use strict";
//method overloading
/*
class a
add(a,b)
class b extends a
add(a,b)
*/
class bank {
    rate = 0;
    roi() {
        return this.rate;
    }
}
class sbi extends bank {
    roi() {
        return 9.5;
    }
}
class hdfc extends bank {
    roi() {
        return 9;
    }
}
var sb = new sbi();
console.log(sb.roi());
var hd = new hdfc();
console.log(hd.roi());
