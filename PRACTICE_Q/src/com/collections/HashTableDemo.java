package com.collections;
//other interfaces in map were non-synchronsied
//but hashTable is synchronised- thread safe

import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("name","kavya");
        ht.put("add","bbsr");

        Set s = ht.keySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            String str = (String) obj;

            System.out.println(str + ":" + ht.get(str));
        }
    }
}
