package com.StreamAPI;

import java.util.Arrays;

/*
you r given a setence that contains several numbers separated
by spaces extract all the numbers and find the smallest one
 */
public class StreamAssess7 {
    public static void main(String[] args) {
        String text = "hi sdfhshf 1 hajkhfk jkfjk 2 4 5 3 4 2 bjsn";
        //get intStream of chars
int smallest = Arrays.stream(text.split(" "))
        .filter(s -> s.matches("\\d+"))
        .mapToInt(Integer::parseInt)
        .min()
        .orElseThrow();
        System.out.println(smallest);

    }
}
