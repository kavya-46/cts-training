package com.DifferVariables;

public class AccessInstanceStatic2 {
    void m4()
    {
        AccessInstanceStatic a = new AccessInstanceStatic(); //creating object using class name
        System.out.println(AccessInstanceStatic.y);
        a.m3();
    }
    public static void main(String[] args) {
AccessInstanceStatic2 a = new AccessInstanceStatic2();
a.m4();
    }
}
