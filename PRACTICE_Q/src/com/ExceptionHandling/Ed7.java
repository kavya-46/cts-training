package com.ExceptionHandling;
//throws keyword- used in the signature of the method
//we have to use try-catch block
public class Ed7 {
    static void display() throws ArithmeticException {
int a = 3/0;
        System.out.println(a);
    }
    public static void main(String[] args) {
        try {
            display(); //while calling this use try-catch block
        }
        catch(ArithmeticException ae)  {
            ae.printStackTrace();
        }
        System.out.println("successfully printed");
    }
}
