package com.java.lambda;
import java.util.Arrays;
import java.util.List;

    public class Lambda {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

            System.out.println("Even numbers:");
            numbers.stream() //converts list into stream for easy processing
                    .filter(n -> n % 2 == 0)   // Lambda expression
                    .forEach(n -> System.out.println(n));

            System.out.println("\nSquares:");
            numbers.stream()
                    .map(n -> n * n)          // Lambda expression
                    .forEach(n -> System.out.println(n));
        }
    }


