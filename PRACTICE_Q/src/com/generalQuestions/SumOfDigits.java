package com.generalQuestions;

import java.util.Scanner;

public class SumOfDigits {
    //123 = 1+2+3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a numer");
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0){
            sum = sum+(num%10);  //123%10 = fins the remainder=3=(0+3), 2(2+3=5), 1(6)
            num = num/10;  //coefficient = 123/10 = 12, 12/10= 2, 1/10 = 1

        }
        System.out.println("the sum of digits is :"+sum);
    }
}
