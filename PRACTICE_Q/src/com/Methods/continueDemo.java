package com.Methods;

public class continueDemo {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++) {
            if(i==5|i==10|i==15)
                continue;
            System.out.println(i);
        }
    }
}
