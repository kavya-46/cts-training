package com.StreamAPI.practice;

import java.util.Arrays;
import java.util.Comparator;

//find the 2nd highest length word in the given sentence
public class practice3 {
    public static void main(String[] args) {
        String s = "today there is good weather";
        String ans = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
        System.out.println(ans);
    }
}
