package com.Methods;

import java.util.Arrays;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 8, 4, 1, 6);

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }
        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("No valid second highest number found.");
        } else {
            System.out.println("The second highest number is: " + secondHighest);
        }
    }
}