package com.practice.arrays;

public class MultiDim {
    //syntax : datatype arrname[][] = new datatype[size1][size2];
    public static void main(String[] args) {
    int arr[][] = new int[2][2];
    // int[][] arr = {{1,2}, {3,4}};
    arr[0][0] = 1;
    arr[0][1] = 2;
    arr[1][0] = 3;
    arr[1][1] = 4;
    for(int[] x : arr) {
        for(int y : x) {
            System.out.print(y+" ");
        }
        System.out.println();
    }
}
}
