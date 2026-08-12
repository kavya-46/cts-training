package com.collections;



import java.util.Collections;
import java.util.TreeSet;

public class ReverseTreeSetDemo {
    public static void main(String[] args) {
        // Passing Collections.reverseOrder() forces the tree to sort backwards
        TreeSet<String> ts = new TreeSet<>(Collections.reverseOrder());

        ts.add("Zebra");
        ts.add("Apple");
        ts.add("Mango");
        ts.add("Kavya");
        ts.add("Sagar");

        // A standard print or standard loop will now automatically be in reverse order
        System.out.println(ts);
    }
}