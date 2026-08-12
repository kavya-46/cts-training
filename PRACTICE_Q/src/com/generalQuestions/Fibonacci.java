package com.generalQuestions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many Fibonacci numbers to print: ");
        // 1. Read the input value first and evaluate it directly in the loop condition
        int totalToPrint = scanner.nextInt();

        int f = 0;
        int s = 1;

        // 2. Only print if the user requested at least 1 or 2 numbers
        if (totalToPrint >= 1) System.out.print(f);
        if (totalToPrint >= 2) System.out.print(", " + s);

        // 3. Run the loop matching the target size
        for (int i = 2; i < totalToPrint; i++) {
            int next = f + s;
            System.out.print(", " + next);
            f = s;
            s = next;
        }
        System.out.println();

        scanner.close();
    }
}