package com.StreamAPI;

import java.util.Arrays;
import java.util.List;

/*
u r given a list of integers.from this list,filter out
all even numbers that r greater than 5, and then multiply all
of them together and print the result
 */
public class StreamAssess10 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 22, 312, 121, 34, 545, 5, 6, 8);
        int product = nums.stream()
                .filter(n -> n % 2 == 0 && n > 5)
                .reduce(1, (a, b) -> a * b);
        System.out.println("product:" + product);
    }
}