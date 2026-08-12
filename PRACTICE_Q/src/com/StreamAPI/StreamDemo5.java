package com.StreamAPI;
import java.util.*;
import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;
import java.util.Optional;

//stream opr - min(),max(),findFirst(),findAny(),reduce()
//these are giving single value as o/p thats why these are terminal ops

public class StreamDemo5 {
    public static void main(String[] args) {
        BinaryOperator<Integer> bo = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a+b;
            }
        };
Integer[] arr = {1,2,3,56,45,6,7};
//int sum=0;
//Optional<Integer> min = Arrays.stream(arr).filter(n->n%2==0).reduce(null);
//min(Integer::compareTo).
        //.findFirst();
        //.findAny(); - will give any number
        //.reduce()
     //   System.out.println(min.orElse(null));
        Optional<Integer> sum = Arrays.stream(arr).reduce(bo);
      //  Integer sum = Arrays.stream(arr).reduce(0,bo);
        System.out.println(sum.orElse(-1));
    }
}
