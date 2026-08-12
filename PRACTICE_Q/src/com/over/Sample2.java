package com.over;
//overloading to the main method
public class Sample2 {
    public static void main(String[] args) {
        main(new int[] {4,5,67,7});
    }
    public static void main(int[] args) {
        System.out.println("Int array");
    }
    public static void main(int  args) {
        System.out.println("int parameter");
    }
}
