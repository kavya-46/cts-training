package com.StreamAPI;
//you have a collection of numbers with some duplicates.
// remove the duplicates and keep only the first 4 unique
// numbers as an array.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAssess3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,9,0,9,8,8,7,6);

       Integer[] result = numbers.stream()
               .distinct()
               .limit(4)
               .toArray(Integer[]::new);

        System.out.println(Arrays.toString(result));
    }
}
