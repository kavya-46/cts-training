package com.DifferVariables;

public class SuperKeyword3 {
SuperKeyword3() {  //constructor
    System.out.println("i am parent");
}
}
class Jayaram extends SuperKeyword3{
    Jayaram() {
        super(); //it must be in the 1st line only in constructor
        System.out.println("kdakf");
    }
    void m1() {
        System.out.println("hello from ramu");
    }

    public static void main(String[] args) {
Jayaram j = new Jayaram();
j.m1();
    }
}