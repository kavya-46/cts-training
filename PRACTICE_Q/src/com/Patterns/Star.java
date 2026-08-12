package com.Patterns;

public class Star {
    public static void main(String[] args) {
        int i,j;
        for(i=5;i>=1;i--) { //for printing the columns
            for(j=1;j<=i;j++) {
            System.out.print(j);
            }
            System.out.println(); //cursor comes to nxt line
        }

    }
}
