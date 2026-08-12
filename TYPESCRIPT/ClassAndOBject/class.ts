// function add(m:string, ...n:string[]) {
//     return m+n;
// }

//object and class
//class is the collection of similar type of objects
//object is the blueprint of class

//class has constructors, methods and properties
// 

class Student {
    sID: number;
    sname: string;
    nameClass: string;

    // The constructor initializes the properties
    constructor(sID: number, sname: string, nameClass: string) {
        this.sID = sID;
        this.sname = sname;
        this.nameClass = nameClass;
    }

    display(): void {
        console.log(this.sID + " " + this.sname + " " + this.nameClass);
    }
}

// SetData(sID:number, sname:string,nameClass:string) {
// this.sID=sID ;
// this.sname= sname ;
// this.nameClass=nameClass;

// }
// How to use it:
var stu = new Student(1, "kavya", "mtech");

stu.display();