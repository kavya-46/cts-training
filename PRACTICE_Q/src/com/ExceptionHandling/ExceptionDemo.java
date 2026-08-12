package com.ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        //for single try block mutliple catch blocks can be created
        catch(ArithmeticException ae) {
            System.out.println("you cannot divide a number with 0");
//ae.printStackTrace(); //exc name, reason,line number,method,class
         System.out.println(ae.toString()); //name,reason
            System.out.println(ae.getMessage()); //only reason
        }

        finally{
            System.out.println("lopaz");
        }
        System.out.println("welcome to programming");
    }
}
