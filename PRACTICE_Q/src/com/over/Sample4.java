package com.over;
//overloading in parent and child class-INHERITENCE
public class Sample4 {
    void display() {
        System.out.println("parent class");
    }
}
class perfect extends Sample4 {
    void display(String name ) {
        System.out.println("name is" +name);
    }
public static void main(String[] args) {
    perfect p  = new perfect();
    p.display(" konduru");
}
}