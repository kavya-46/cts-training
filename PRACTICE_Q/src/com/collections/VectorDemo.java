package com.collections;
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(90);
      v.add(89);
        v.add("kavya");
        v.add("konduru");
        v.add("pradeep");
        v.add("ramu");
        v.add("bhanu");
        v.add("konduru");
        v.add("pradeep");
        v.add("ramu");
        v.add("konduru");
        v.add("pradeep");
        v.add("ramu");

        System.out.println(v.capacity());
        System.out.println(v);
        System.out.println(v.size());
    }
}
