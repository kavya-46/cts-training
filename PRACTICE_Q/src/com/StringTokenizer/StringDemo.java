package com.StringTokenizer;

import java.util.StringTokenizer;

public class StringDemo {
    public static void main(String[] args) {
        String str = "I am learning java";
        StringTokenizer t1= new StringTokenizer(str,"va",true);
        //true- the char passed will also be printed
        System.out.println(t1.countTokens());
        //String arr[] = str.split(" ");
        String arr[] = str.split("va");
        System.out.println(arr.length);
        for(String x : arr) {
            System.out.println(x);
        }
        while(t1.hasMoreTokens()) {
            System.out.println(t1.nextToken());
        }
        System.out.println(t1.countTokens()); //it prints the number of tokens left after printing
    }
}
