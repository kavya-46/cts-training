package com.generalQuestions.Kotha;

import java.sql.SQLOutput;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

//        int temp=num1;
//        num1 = num2;
//        num2 = temp;

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

//        num1 = num1^num2;
//        num2 = num1^num2;
//        num1 = num1^num2;

        System.out.println("first num is "+num1+" second num is " +num2);
    }
}
