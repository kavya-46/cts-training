package com.generalQuestions.Kotha;

import java.util.Scanner;

public class Armstrong {
    static int r,temp, sum=0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        temp = num;

        while(num>0) {
            r = num%10; //153%10=3
            num=num/10; //153/10=15
            sum=sum+(r*r*r);  //0+(27)=27
        }
        if(temp ==sum) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not armstrong");
        }
    }
}
