package com.DesignPatterns.singleton;

public class Singleton {
    private static Singleton singleton;
    public Singleton() //private constructor
    {

    }
    //create a static method to get instance
    // it returns singleton object
    //getInstance() is the method name
    public static Singleton getInstance()
    {
        if(singleton == null)
        {
            singleton = new Singleton();
        }
        return singleton;
    }
    public void displayMessage()
    {
        System.out.println("I have called using singleton object");
    }
}
