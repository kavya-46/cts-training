package com.Methods;

public class MethodWIthParameters {
    static class Addition{
        //without return type
//        void add(int x,int y) {
//            int z=x+y;
//            System.out.println(z);
//        }

        //with return type
        int add(int x,int y) {
            int z = x+y;
            return z;
        }
        public static void main(String[] args) {
Addition ad = new Addition(); //object creation

int result = ad.add(10,20);
            System.out.println(result);
        }
    }
}
