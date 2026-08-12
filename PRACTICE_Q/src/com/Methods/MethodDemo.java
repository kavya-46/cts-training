package com.Methods;

public class MethodDemo {

    //    returntype methodname(parameters) {
//        statements...
//         }
//        methodname - first word should be lowercase
//                next word should be uppercase
    static class Addition {
        //without return type - void
        void add() {  //method
            int a = 10;
            int b = 20;
            int c = a + b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
Addition ad = new Addition();
ad.add();

    }
}

