package com.generalQuestions.Kotha;
import java.util.Scanner;
public class Palindrome { //121=121(num = reverse)
    static int r,sum=0,temp;
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
       temp = num;
        while(num>0) {
            r = num%10;  //55%10 = 5   5%10=5
            sum=(sum*10)+r; //0+5=5    50+5 = 55
            num =num/10; //55/10 = 5   5/10 = 5
        }
        if(sum == temp){
            System.out.println("it is palindrome");
        } else {
            System.out.println("it is not palindrome");
        }

    }
}
