package com.StreamAPI.practice;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//given a sentence ,find the occurence of each word
//i.p: String s = "i am learning streams api in java java"
//o.p:{java=2,in=1,API=1,learning=1,am=1,streams=1}
public class practice4 {
    public static void main(String[] args) {
        String s="i am learning streams api in java java";
        String arr = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .toString();
        System.out.println(arr);
    }
}

