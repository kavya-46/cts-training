package com.generalQuestions.ImportantPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class freqOfWordInChar {
    public static void main(String[] args) {
        String word ="springboot";
        Map<Character, Integer> charCounts = new HashMap<>();
        for(char c:word.toCharArray()) {
            charCounts.put(c,charCounts.getOrDefault(c,0)+1);
        }
        System.out.println(charCounts);
        int[] chars = new int[26];
        for(char c: word.toCharArray()){
            chars[c - 'a']++;
        }

    }
}
