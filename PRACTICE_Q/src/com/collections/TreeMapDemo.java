package com.collections;
import java.util.*;
//values are printed in alphabetical sorted order bases on keys
public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put("name", "ABhisek");
        tm.put("dob", 3);
        tm.put("nickname", "abhi");
        tm.put("hobby","teaching");

        Set s =tm.keySet();
        Iterator i = s.iterator();
        while (i.hasNext()) {
            Object obj = i.next();
            String str = (String) obj;

            System.out.println(str + ":" + tm.get(str));
        }
    }
}


//hashmap -16 - follows HashTable
//Linkedhashmap- 16 - follows HashTable + double LinkedList
//treeMap --- red black tree
//hashTable -11 - hashTable