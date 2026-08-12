//method overloading
/*
class a
add(a,b)
class b extends a
add(a,b)
*/

class bank{
    rate:number=0;
    roi():number{
        return this.rate;
}
}    
class sbi extends bank{
    roi():number {
        return 9.5;
    }
}
class hdfc extends bank {
    roi():number {
        return 9;
    }
}

var sb= new sbi()
console.log(sb.roi())

var hd = new hdfc()
console.log(hd.roi())