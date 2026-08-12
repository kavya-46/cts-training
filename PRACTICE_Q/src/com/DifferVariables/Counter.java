package com.DifferVariables;

public class Counter {
static int count =0;
Counter() {
    count++; //increment by 1
    System.out.println(count);
}
    public static void main(String[] args) {
Counter c1 = new Counter();
Counter c2 = new Counter();
Counter c3 = new Counter();

    }
}
