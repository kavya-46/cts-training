package com.TypeCasting;

class Parent1 { // Changed to uppercase P to match standard Java conventions
    void show() {
        System.out.println("Parent class show");
    }
    void display() {
        System.out.println("parent class display method");
    }
}

class Child1 extends Parent1 {
    @Override
    void show() {
        System.out.println("Child class show");
    }
    void print() {
        System.out.println("child class print method"); // Fixed typo in string
    }
}

public class Downcasting {
    public static void main(String[] args) {

        // 1. Upcasting: Creating a Child object but holding it in a Parent reference
        Parent1 p = new Child1();

        // 2. Downcasting: Casting that Parent reference back into a Child reference
        Child1 c = (Child1) p;

        // 3. Calling the methods
        c.show();
        c.display();
        c.print();
    }
}