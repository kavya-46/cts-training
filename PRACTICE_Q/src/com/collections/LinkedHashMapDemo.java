package com.collections;
import java.util.*;
import java.util.prefs.AbstractPreferences;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
LinkedHashMap lhm = new LinkedHashMap();
lhm.put("name","ABhisek");
lhm.put("dob",2003);
lhm.put("nickname","abhi");

Set s = lhm.keySet();
Iterator i = s.iterator();
while(i.hasNext()) {
Object obj= i.next();
String str = (String)obj;

    System.out.println(str+":"+lhm.get(str));
}
}
}