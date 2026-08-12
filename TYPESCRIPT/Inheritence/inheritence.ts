//inheritence in Typecript
//class- extends
//interface- implements

class dept {
    dptname:string;
    constructor(dptname:string) {
        this.dptname=dptname;
    }
}

class employee extends dept {
empId:number;
empName:string;
constructor(empId:number,empName:string,dptname:string) {
  super(dptname);
  this.empId = empId;
  this.empName=empName;
}
display_emp_details() {
    console.log(this.empId+" "+this.empName+" "+this.dptname)
}
}
const emp = new employee(1,"kavya","development");
emp.display_emp_details()