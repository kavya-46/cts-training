package com.FunctionalInterface;

public class User {
    public static void main(String[] args) {
        Car c = new Car() {
            public void drive() {
            System.out.println("Drive is called");
        }
        };
        c.drive();
    }
}
