package com.collections;
//sets doesnot allow duplicate values , insertion set
//LinkedHashSet - no duplicate values , follows insertion set
//difference between hashset adn linkedhash set is , linkedhashset follows insertion order
//Treeset- values are printed in ascending order,alphabetical order
//we store the values in hashTable

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashSetDemo {
    public static void main(String[] args) {
LinkedHashSet ls = new LinkedHashSet();
ls.add(10);
ls.add(12);
ls.add(60);
ls.add(90);
ls.add(10); //duplicate value will not be printed
Iterator i =ls.iterator();
while(i.hasNext()) {
    System.out.println(i.next());
}
     }
}
