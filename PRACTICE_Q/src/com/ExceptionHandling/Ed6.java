package com.ExceptionHandling;
//throw keyword usage
public class Ed6 {
    static void validate(int age) {

        if(age<18) {
            throw new ArithmeticException("you are below 18");
        } else{
            System.out.println("you r eligible");
        }
    }

    public static void main(String[] args) {
        validate(21);
        System.out.println("program succesfully completed");

    }
}
