package com.over;
//overloading in constructor
public class Sample3 {
    Sample3() {
        System.out.println("whatever");
    }
Sample3(String name) {
     //   name ="kavya";
    System.out.println("My name is : "+name);
}
    public static void main(String[] args) {
Sample3 s = new Sample3("uday"); //calling the constructor using object
    }
}
