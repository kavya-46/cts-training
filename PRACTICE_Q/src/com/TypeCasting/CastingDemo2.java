package com.TypeCasting;

class Parent {
    void show() {
        System.out.println("Parent class show");
    }
    void display() {
        System.out.println("parent class display method");
    }
}

class Child extends Parent { // Capitalized 'Child' to follow Java conventions
    @Override
    void show() {
        System.out.println("Child class show");
    }
    void print() {
        System.out.println("Child class print method");
    }
}

public class CastingDemo2 {
    public static void main(String[] args) {

        // 1. UPCASTING
        // Reference variable = Parent, Object = Child
        Parent p = new Child();  // Explicit (Parent) cast is optional here

        p.display(); // Works: display() belongs to Parent
        p.show();    // Works: Prints "Child class show" due to Overriding/Polymorphism

        // p.print(); // ERROR! Parent reference cannot see Child-specific methods.

        // 2. DOWNCASTING (Inline / Temporary)
        ((Child) p).print(); // Works! You temporarily cast 'p' to a Child to access print().

        System.out.println("---");

        // 3. WHY DIRECT DOWNCASTING FAILS:
        // Child c = new Parent(); // COMPILE ERROR!

        // 4. THE CORRECT WAY TO DOWNCAST:
        Child c = (Child) p; // Works! Because 'p' is secretly pointing to a Child object.
        c.print();
    }
}