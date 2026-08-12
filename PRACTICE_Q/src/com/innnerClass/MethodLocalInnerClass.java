package com.innnerClass;

class Outer1{
    void outerMethod() {
        class Inner1 { //inner class
            void innerMethod1() {
                //creating class inside method
                System.out.println("inner class method");
            }
        }
        Inner1 i = new Inner1();
        i.innerMethod1();
    }
}
public class MethodLocalInnerClass {
    public static void main(String[] args) {
Outer1 o = new Outer1();
o.outerMethod();
    }
}
