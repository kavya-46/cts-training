package com.collections;
import java.util.*;

import com.sun.source.tree.Tree;
//
//import java.util.Iterator;
//import java.util.TreeSet;
//tree set doesnot allow multiple data types
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(90);
        ts.add(80);
        ts.add(6);
      //  ts.add("Kavya");
      //  ts.add("sagar");
        ts.add(78);
        ts.add(102);

        System.out.println(ts.first());
        System.out.println(ts.last());

        TreeSet ts1 = (TreeSet) ts.headSet(10); //values less than 10 will be printed
        System.out.println(ts1);

        TreeSet ts2 = (TreeSet) ts.tailSet(10); //prints values more than 10
        System.out.println(ts2);

        TreeSet ts3 = (TreeSet) ts.subSet(5,15); //if we is present it will be printed, but not 15
        System.out.println(ts3);
        Iterator i = ts.descendingIterator();
        //Iterator i = ts.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
     }
}
