"use strict";
//inheritence in Typecript
//class- extends
//interface- implements
class dept {
    dptname;
    constructor(dptname) {
        this.dptname = dptname;
    }
}
class employee extends dept {
    empId;
    empName;
    constructor(empId, empName, dptname) {
        super(dptname);
        this.empId = empId;
        this.empName = empName;
    }
    display_emp_details() {
        console.log(this.empId + " " + this.empName + " " + this.dptname);
    }
}
const emp = new employee(1, "kavya", "development");
emp.display_emp_details();
