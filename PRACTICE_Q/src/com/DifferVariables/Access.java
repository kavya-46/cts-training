package com.DifferVariables;
//INSTANCE VS INSTANCE IN SAME CLASS
public class Access {
    int x = 12; //instance var
    void m1() { //instance method1
        System.out.println("Instance method m1");
    }
    void m2() { //instance method2
        System.out.println(x);
        m1();
    }
    public static void main(String[] args) {
Access a = new Access();
a.m2();
    }
}

