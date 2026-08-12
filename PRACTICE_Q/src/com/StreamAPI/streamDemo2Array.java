package com.StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.Arrays;
public class streamDemo2Array {

    public static void main(String[] args) {
            Integer[] arr = {1, 2, 6, 45, 5};
//Int[] arr= {1,2,3,4,5}; - it is not allowed

            //transforming int data to char
            //there is no stream method to be used on array
            int count = (int) Arrays.stream(arr)
                    .filter(t -> t % 2 == 0)
                    .sorted()
                    .map(t -> {
                        String s = "";
                        for (int i = 1; i <= t; i++)
                            s += "*";
                        return s;
                    })
                    .peek(System.out::println)
                    .count();
            System.out.println("total number of even number is " + count);
        }
    }


