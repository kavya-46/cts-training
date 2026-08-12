package com.DifferVariables;
//INSTANCE VS INSTANCE IN DIFFERENT CLASSES
public class Access1 {
    void m2() {
        Access a = new Access();
        System.out.println(a.x);
        a.m1();
    }
    public static void main(String[] args) {
        Access1 a1 = new Access1();
        a1.m2();
    }
}
