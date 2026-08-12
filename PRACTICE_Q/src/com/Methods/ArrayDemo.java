package com.Methods;

public class ArrayDemo {
    int sum; // Instance variable, default value is 0

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44};
        ArrayDemo ad = new ArrayDemo();

        // 1. Corrected the variable name from 'add' to 'ad'
        int total = ad.displayy(arr);
        System.out.println("The final total is: " + total);

        // 2. Calling the void method that just prints the array
        ad.display(arr);
    }

    // Method to print array elements (Pass by reference)
    void display(int[] temp) {
        System.out.print("\nArray elements:");
        for(int z : temp) {
            System.out.print(" " + z);
        }
        System.out.println();
    }

    // Method to calculate sum and return it
    int displayy(int[] temp1) {
        sum = 0; // Reset sum if calling multiple times
        for(int a : temp1) {
            sum = sum + a;
            // This prints the running total at each step
            System.out.println("Running sum: " + sum);
        }
        return sum;
    }
}