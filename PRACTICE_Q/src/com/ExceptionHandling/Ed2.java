package com.ExceptionHandling;
//one try- multiple catch block
public class Ed2 {
    public static void main(String[] args) {
        try{
            int arr[] = {2,5}; //first excepetion printed first
            arr[2] = 5/0; //1st exception-arrayout of index-
            //first catch box is only executed
            arr[3]=6;
        }
        catch(ArrayIndexOutOfBoundsException ae) {
        ae.printStackTrace();
        }
        catch(ArithmeticException e) {
   e.printStackTrace();
        }
        System.out.println("hi");
    }
}

//the exception occuring first is printed first