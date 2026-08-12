package com.DifferVariables;
class Kavya {
    int x = 22;
}
public class SuperKeyword extends Kavya {
    int x = 20;
    //int y=33;
void m1() {
    int x = 10;
    System.out.println(this.x);
    System.out.println(super.x);
    System.out.println(x);
}
    public static void main(String[] args) {
       SuperKeyword k = new SuperKeyword();
       k.m1();
    }
}
