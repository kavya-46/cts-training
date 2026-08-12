package com.StreamAPI;
//given a string,extract all chars,skip the first five chars,
//takes the next 10 chars,convert each char to its unicode
// integer value,find the distinct values.then
////collect them into an integer array.
//Input-
//string sentence = ["stream operations are powerful"]
//output-
//[111,23,4,4,14,12]


import java.util.Arrays;
import java.util.List;
public class StreamAssess5 {
    public static void main(String[] args) {
        String sentence = "stream operations are powerful";
        Integer[] result = sentence.chars()
                .skip(5)
                .limit(10)
                .distinct()
                .boxed() //converts primitve int to INTEGER
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(result));

    }
}
