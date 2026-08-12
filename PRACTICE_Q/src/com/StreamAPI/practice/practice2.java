package com.StreamAPI.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class practice2 {
    public static void main(String[] args) {
        String s = "I am learning Streams API in Java";
        String ans = Arrays.stream(s.split(" "))
                        .sorted(Comparator.comparing(String::length).reversed())
                        .skip(1).findFirst().get();

        System.out.println(ans);
    }
}
