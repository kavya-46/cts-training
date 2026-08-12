package com.DifferVariables;
//INSTANCE VS STATIC IN THE SAME CLASS
public class AccessInstanceStatic {
    static int y=21;
    static void m3() {
        System.out.println("Static method");
    }
    void m4() {
        System.out.println(y);
        m3();
    }

    public static void main(String[] args) {
        AccessInstanceStatic a = new AccessInstanceStatic();
        a.m4();
    }
}
