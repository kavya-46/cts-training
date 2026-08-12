package com.ExceptionHandling;
//USER-DEFINED EXCEPTIONS
public class Ed8 extends Exception { //we can also use RuntimeException
public Ed8(String str) {
    super(str);  //super keyword
}
    public static void main(String[] args) throws ArithmeticException{
      //  System.out.println("enter ur age");
try {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("enter ur age");
   int  age = sc.nextInt();
   if (age<18) {
       throw new Ed8("you r not eligible for vote");
   }
   else {
       System.out.println("you r eligible for vote");
   }
}
catch(Ed8 ed) {
    ed.printStackTrace();

        }
finally {
    System.out.println("hi yaaro");
}
    }
}
