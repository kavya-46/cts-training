package com.Methods;

public class MethodWithReturn {
    static class Addition {
        int add() {
            int a = 1;
            int b = 2;
            int c = a + b;
            //System.out.println(c);
            return c;

        }

        public static void main(String[] args) {
            Addition ad = new Addition(); //tells java to go into the memory and build a real,working version of this class.
ad.add();
            int result = ad.add();

            //System.out.println(ad.add()); - we can also use this without actually declaring the result variable.


        }
    }
}
