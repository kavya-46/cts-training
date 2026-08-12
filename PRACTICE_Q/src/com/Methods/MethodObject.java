package com.Methods;
public class MethodObject {
    static class Student { //student = object
//        int rollno = 102;
//        double marks = 92.5;
//        String name = "Kavya";
        int english=90;
        int hindi=99;
        int telugu=89;
        int math=98;
        int sst = 100;
        int sci=94;
    }
    static class ObjectDemo {
        int sum;
        public static void main(String args[]) {
            Student s2 = new Student(); //creating an obj of the first class
            ObjectDemo od = new ObjectDemo();
            int total = od.display(s2); //passing obj type of parameter
            System.out.println("Total marks: " +total);
        }
//        void display(Student s1) { //method with obj as parameter
//            System.out.println("Student name is: "+ s1.name);
//            System.out.println("Student roll no is: "+ s1.rollno);
//            System.out.println("Student marks is: "+ s1.marks);
//
//
//        }
        //void display(Student s2) {
        int display(Student s2) {
            sum = s2.telugu + s2.english + s2.math + s2.hindi + s2.sci + s2.sst;
            return sum;
        }
    }
}
