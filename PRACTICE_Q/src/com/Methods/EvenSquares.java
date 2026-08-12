package com.Methods;

import java.util.Arrays;
import java.util.List;
//demonstration of lambda function
public class EvenSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("Even numbers:");
        numbers.stream() //converts list into stream for easy processing
                .filter(n -> n % 2 == 0)   // Lambda expression
                .forEach(n -> System.out.println(n));

        System.out.println("\nSquares:");
        numbers.stream() //for easy processing of elements
                .map(n -> n * n)          // Lambda expression
                .forEach(n -> System.out.println(n));
    }
}

