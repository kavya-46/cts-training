package com.ExceptionHandling;
//if we do 2 catch block while writing ulimatet Exception e, bcoz it is the ultimate exception handler
public class Ed5 {
    public static void main(String[] args) {
        try {
            int arr[] = {1,2,3};
            arr[5]= 6;

        }
//        catch(Exception e) {
//            e.printStackTrace();
//        }
        catch(ArrayIndexOutOfBoundsException a) {
            a.printStackTrace();
        }
        catch(Exception e) { //super exception handler
            e.printStackTrace();
        }
    }
}
