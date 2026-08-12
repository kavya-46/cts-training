package com.collections;

//stores keys and values pairs
//there are 4 implementation clasess-
//hashMap, LinkedHashMap, TreeMap,HashTable
//keys must be unique,but values can be duplicate
//they are not synchroised,hence not threadSafe
//there is no insertion order in hashmap
//key+value is called "Entry"

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
//HashMap<String,Integer> hm = new HashMap();
        HashMap hm = new HashMap();

hm.put("name","Kavya");
hm.put("dob",2004);
hm.put("dob",3443); //duplicate key-here first key is completely deleted
hm.put("address","bbsr");
hm.put("collegename","CVRAMAN");
        hm.remove("name");
        System.out.println(  hm.size());
        System.out.println(hm.isEmpty());
      //  hm.clear();


       Set s = hm.keySet(); //to retriece all the keys in hashMap

       Iterator it = s.iterator(); //printing all these keys using iterator

       while(it.hasNext()) {
          Object obj =it.next();
          String str = (String)obj; //object is converted into string
           System.out.println(str+" "+hm.get(str));
       }



        System.out.println(hm.get("dob"));
        System.out.println(hm);
    }
}
