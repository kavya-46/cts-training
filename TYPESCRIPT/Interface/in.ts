//interface in typescript
//typescript compiler doesnot convert interface to javascript

//an interface is defined with the keyword interface and it can include properties and methods declarations using function or arrow
//an interface can extends another interface

interface emp1 {
    empId:number;
    empName:string;
    deptName:string;

    display:()=>void; //arrow function-returns void
}

const empp :emp1={
    empId: 1,         // Fixed typo 'empIdd' and changed ';' to ','
    empName: "kavya", // Fixed typo 'empNamee' and changed ';' to ','
    deptName: "IT",   // Added missing comma
    display() {       // Removed explicit ':void' return type here to match valid object method syntax
        console.log(this.empId+" "+this.empName+" "+this.deptName)
    }
}
empp.display();
console.log(empp.empId)
console.log(empp.deptName)
console.log(empp.empName)

