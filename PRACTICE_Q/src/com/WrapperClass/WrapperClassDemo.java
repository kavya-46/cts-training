package com.WrapperClass;
//primitve datatype - object
//for making java 100% object orietned
//used in collections and generics
//ArrayList<Integer>
public class WrapperClassDemo {
    public static void main(String[] args) {
        //int x = 20;
        //autoboxing

        //Integer y = x; //converting the 20 to object through wrapper class
        //Integer y = Integer.valueOf(x);
Integer x= new Integer(30);
int y = x;
        System.out.println(y);
       // System.out.println(y);
    }
}
