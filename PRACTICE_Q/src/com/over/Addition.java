package com.over;

public class Addition {
    void add() {
       // int z=x+y;
int x=9;
int y=8;

        System.out.println("Result1:"+(x+y));
    }
    void add(int x, int y,int z) {
        // int z=x+y;
        System.out.println("Result2:"+(x+y+z));
    }

    public static void main(String[] args) {
Addition ad = new Addition();
ad.add();
ad.add(5,6,9);
    }
}
