package com.StreamAPI.practice;

import java.util.Arrays;
import java.util.Comparator;

public class practice1 {
    //given a sentence, find the word that has the highest length
    public static void main(String[] args) {
        String s = "I am learning java and springboot";
        String ans = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(ans);
    }
}
