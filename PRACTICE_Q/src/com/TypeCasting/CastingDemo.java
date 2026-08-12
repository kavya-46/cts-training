package com.TypeCasting;
//two types of type casting

public class CastingDemo {
    public static void main(String[] args) {
        int x = 67;
        char y = (char)x;
//        double x = 10.9;
//        int y = (int)x;
        System.out.println(x);
        System.out.println(y);
    }
}

/*
int - double - can be changed
but double - int -cannot be changed bcoz double is greater value
//hence we use type casting
//there is data loss here- narrowing

 */