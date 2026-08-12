package com.constructors;

public class Display {
    public static void main(String[] args) {
Display d1 = new Display();  //object creation
Display d2 = new Display();
Display d3 = new Display();
        System.out.println();
    }
    //zero parameterized constructor
Display() { //constructor-it is like a method with name same as class name
    System.out.println("displaying program");
}
Display(int i,String name) {
    System.out.println("hello kavya");
}
}
