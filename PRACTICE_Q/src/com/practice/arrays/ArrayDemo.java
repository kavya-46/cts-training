package com.practice.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int  arrayname[] = new int[3];
        arrayname[0]=1;
        arrayname[1]=5;
        arrayname[2]=10;
//
//        for(int i=0;i<arrayname.length;i++) {
//            System.out.println(arrayname[i]);
//        }
       // System.out.println(arrayname[0]);

        for(int a:arrayname) {
            System.out.println(a);
        }
    }
}
