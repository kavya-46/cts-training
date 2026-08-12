package com.DifferVariables;

public class SuperKeyword2 {
    void m1() {
        System.out.println("Hello from parent");
    }
}
class Sagar extends SuperKeyword2 {
    void m1() {
        super.m1();  //for printing the parent class
        System.out.println("hello from child");
    }

    public static void main(String[] args) {
        //SuperKeyword2 su = new SuperKeyword2();
        Sagar s = new Sagar();
        s.m1();
        //su.m1();
    }
}