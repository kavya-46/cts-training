package com.ExceptionHandling;
//for more than 1 exception to print- nested try block
public class Ed4 {
    public static void main(String[] args) {


        try {
            int arr[] = {2, 3};

            try {
                arr[2] = 3 / 0; //divided by 0 exception
            }
            catch (ArithmeticException ae) {
                ae.printStackTrace();
            }
            arr[3] = 7;
        }catch(ArrayIndexOutOfBoundsException a) {
                a.printStackTrace();
            }
        }
}
