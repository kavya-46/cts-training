package com.StreamAPI;
import java.util.*;

public class StreamDemo {
    public static void main(String[] args) {
        System.out.println("stream Demo");
        List<Integer> numbs = List.of(1,2,34,5); //it is creating a immutable list with fixed data
        numbs.stream()
                .filter(n->n%2==0) //intermediate operation
                .forEach(System.out::println); //terminal operation

    }//.forEach(n -> System.out.println(n)); //  Valid
}
