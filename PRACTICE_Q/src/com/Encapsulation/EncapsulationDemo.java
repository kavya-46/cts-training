package com.Encapsulation;

public class EncapsulationDemo {
   // private String name = "Kavya";
    private String name;
    public String getName() {
        System.out.println("someone is accessing");
        return name;
    }
    public void setName(String name) {
        System.out.println("some one is changing your name");
        this.name = name;

    }
}
