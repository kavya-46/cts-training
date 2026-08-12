"use strict";
//interface in typescript
//typescript compiler doesnot convert interface to javascript
const emp6 = {
    empId: 1, // Fixed typo 'empIdd' and changed ';' to ','
    empName: "kavya", // Fixed typo 'empNamee' and changed ';' to ','
    deptName: "IT", // Added missing comma
    display() {
        console.log(this.empId + " " + this.empName + " " + this.deptName);
    }
};
emp6.display();
