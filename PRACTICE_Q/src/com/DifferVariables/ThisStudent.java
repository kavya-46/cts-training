package com.DifferVariables;
//this keyword
public class ThisStudent {
    int x; //instance variable
    ThisStudent(int x) { //parameter
        this.x=x;
    }
        void display() {
            System.out.println(x);
        }
    public static void main(String[] args) {
        ThisStudent stu = new ThisStudent(5);
        stu.display();
    }
}


//SIMPLE EXAMPLE:
//class Student {
//    int x = 10;
//    void display() {
//        int x = 20;
//        sout(this.x);
//    }
//    psvm(s) {
//        Student stu = new Student();
//        stu.display();
//    }
//}
//o/p - 10