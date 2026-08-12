package com.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;

/*
u r given a sentence with multiple words. find the word
with the maximum number of characters(longest word)
 */
public class StreamAssess8 {
    public static void main(String[] args) {
        String text = "hi this is the team meeting";
        String longest = Arrays.stream(text.split(" "))
                .max(Comparator.comparingInt(String::length))

                .orElse("");
        System.out.println(longest);
    }
}

