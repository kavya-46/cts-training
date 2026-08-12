package com.collections;
import java.util.*;

public class MapMethods {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(34);
        al.add(89);
        al.add(78);

        System.out.println(al);
        Collections.sort(al);
        Collections.reverse(al);
        Collections.swap(al,1,2);
        System.out.println(Collections.min(al));
        System.out.println(Collections.max(al));
        System.out.println(al);
        //    we can directly call them using class name without creating object
    }
}
