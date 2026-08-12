package com.Enum;
//enumration - specially listed- it is a spcl class that represents with a gp of constants
//use enum keyword and separate constants by comma.
enum Level {
    //constants must be in uppercase,they are public,static and final
    LOW,
    MEDIUM,
    HIGH

}
public class EnumDemo {
    public static void main(String[] args) {
Level myvar = Level.LOW;
        System.out.println(myvar);
        for(Level x:Level.values())  {
            System.out.println(x);
        }

    }
}
