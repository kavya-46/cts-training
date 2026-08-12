package com.DifferVariables;

public class StaticAccess {
    static int y=45; //static var
    static void m1() { //static meth
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        System.out.println(y);
        m1();
    }
}
