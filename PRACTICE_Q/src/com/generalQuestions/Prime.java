package com.generalQuestions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if(num<=1) {
           isPrime = false;
        } else {
        for(int i = 2;i<=num;i++) {
            if (num % 2 == 0) {
                isPrime = false;
                break;
            }
        }
}
if(isPrime) {
        System.out.println(num+"is a prime number");
} else {
        System.out.println(num+"is not a prime number");
    }
}
}
/*
for(i=1;i<=num;i++){
num%i==0
c++
}
if(C==2)
prime number
if(c>=2)
not a prime number
 */