package com.StreamAPI;

import java.util.Arrays;
import java.util.List;

//from a list of city names,select the unique cities whose
//names start with the list "S". convert them to uppercase,skip
//the first one, then print the rest in the original order.
public class StreamAssess4 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Delhi","Mumbai","Ahmedabad","Srinagar","Sarvanampatti","Mumbai");
        cities.stream()
                .distinct()
                .filter(s->s.startsWith("S"))
                .map(String::toUpperCase)
                .skip(1)
                .forEach(System.out::println);

    }
}
