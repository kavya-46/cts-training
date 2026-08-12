package com.Abstract;

public abstract class Animal {  //abstract class
   // abstract  void sound(); //abstract method

    void shout() {  //concrete method
        System.out.println("ooo");
    }
    Animal() {
        System.out.println("constructor");
    }
}
class Dog extends Animal{//it must override abstract class
//        void sound() {  //method overriding
//            System.out.println("chocobisci");
//        }
    public static void main(String[] args) {
Animal d = new Dog();
//Animal a = new Animal(); - cannot be instantiated
//d.sound();
d.shout();
    }
}

