package com.DifferVariables;
//
public class StaticInstance {

    void display1() {  //instance method
        int a=1;
        System.out.println(a);
    }
    static void display() {  //static method
        System.out.println("Instance method");
       StaticInstance d = new StaticInstance(); //accessing the instance var through object
        d.display1();
    }
    public static void main(String[] args) {
        display();

    }
}
