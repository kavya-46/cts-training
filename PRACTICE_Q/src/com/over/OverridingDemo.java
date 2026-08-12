package com.over;

public class OverridingDemo {
    void msg() {
        System.out.println("parent method");
    }
}
class Demo extends OverridingDemo{
    void msg() {
        System.out.println("child method");
    }
    public static void main(String[] args) {
        OverridingDemo d = new Demo();
        d.msg();
    }
}