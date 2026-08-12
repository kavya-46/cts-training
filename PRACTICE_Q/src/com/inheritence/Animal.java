package com.inheritence;
//multi-level inheritence
public class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void bark() {
        System.out.println("barking");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Eating");
    }
}

class Inhertence1{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
     Dog d = new Dog();
     d.bark();
     d.eat();

    }
}