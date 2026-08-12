package com.innnerClass;
class Parent {
    void msg() {
        System.out.println("hi frnds");
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.msg();

        Parent p1 = new Parent() {
           // anonymous inner class
            void msg() {  //this method must be overriden
                System.out.println("this is display");
            }
        };
        p1.msg();
    }
}

//anonymous class - no class name