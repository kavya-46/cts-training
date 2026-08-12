package com.ExceptionHandling;
//single try- single finally block
public class Ed3 {
    public static void main(String[] args) {
        try {
            int arr[] = {2,5};
            arr[3]=3/1;
        }
        finally {
            System.out.println("ji");
        }
//        finally {
//            System.out.println("batayeye");
//        }
    }
}
