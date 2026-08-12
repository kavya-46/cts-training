interface inter {
    a:number;
    b:number;
    sum():number;
}
interface inter1 extends inter {
    x:number;
    y:number;
    sub():number;
}

class amp implements inter1 {
    a:number=0;
    b:number=0;
    x:number=0;
    y:number=0;

    sum(): number {
        return this.a+this.b; 
    }
    sub(): number {
        return this.x-this.y; // Note: You might want '-' here instead of '+' for subtraction!
    }
}

// Renamed variable from 'a' to 'obj' to fix the naming conflict
const obj = new amp()
obj.a=10;
obj.b=12;
obj.x=50;
obj.y=10;
console.log(obj.sub()) // Added console.log to see the output
console.log(obj.sum()) // Added console.log to see the output