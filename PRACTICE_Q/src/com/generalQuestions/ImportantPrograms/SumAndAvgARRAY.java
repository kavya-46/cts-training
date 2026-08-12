package com.generalQuestions.ImportantPrograms;

import java.util.Scanner;

public class SumAndAvgARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many values do u want to add");
        int size = sc.nextInt();
        int sum = 0;
        int sumavg[] = new int[size];

        System.out.println("Enter you numbers ");
        for(int i=0;i<size;i++) {
         sumavg[i]=   sc.nextInt();
         sum = sum+sumavg[i];
        }
        System.out.println("sum is:"+sum);
        System.out.println("Avg is"+(sum/size));
        sc.close();
    }
}
