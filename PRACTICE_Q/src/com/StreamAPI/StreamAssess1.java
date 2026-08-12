package com.StreamAPI;

import java.util.Arrays;
import java.util.List;

//from a list of employees name, find those with atleast 5
// chars,convert them to upperCase and arrange them alphabetically then print them.
public class StreamAssess1 {
    public static void main(String[] args) {
        List<String> employee = Arrays.asList("Kavya","uday","bhanu","jayaram","Sagar");
        employee.stream()
                .filter(names->names.length()>=5)
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


    }

}
