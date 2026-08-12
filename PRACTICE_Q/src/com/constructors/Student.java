package com.constructors;

public class Student {
    float a;//intance method- created outisde the main method
    public static void main(String[] args) {
        Student s1= new Student(); //creating the object
        //System.out.println(s1.a);
        //s1.display(); //calling the method using the object
    }
    Student() { //instance variable
    a = 10;
        System.out.println(a);
    }
    void display() {
        System.out.println(a);
    }
}
//through method --> to print instance var-->create obj
// const-->to print inst --> we can directly print the var