package com.over;
public class Sample {
    //method overloading in static methods
    static void show(int x) {
        System.out.println("welcome to int parameter");
    }
    static void show(double x) {
        System.out.println("welcome to double float parameter");
    }
    public static void main(String[] args) {
//Sample s = new Sample(); //but for calling static method
// there is no need to create static method
        show(0);
    }
}
//the user can use one method for diff requirements.

