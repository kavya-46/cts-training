package com.StreamAPI;

import java.util.Arrays;
import java.util.List;

/*
from a list of names,find any name that starts with the letter
"S". the search should be case-insensitive.
 */
public class StreamAssess9 {
    public static void main(String[] args) {
        List<String> namesS = Arrays.asList("kavya","uday","jayaramayya","swekruti","sampangi");
        namesS.stream()
                .map(String::toLowerCase)
                .filter(names ->names.startsWith("s"))
                .findAny()
                .ifPresent(System.out::println);

    }
}
