package com.Strings;
public class StringDemo {
    public static void main(String[] args) {
        //ways for creating string obj
        String s1 = new String("hello kavya ");
        String s2 = "welcome to the practice";

        System.out.println(s1);//stored in heap memory
        System.out.println(s2);// stored in string constant pool
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.concat(s2)); //concatnation
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

    }
}
