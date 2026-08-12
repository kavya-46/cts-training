package com.Methods;

import java.util.LinkedHashMap;
import java.util.Map;
public class NameEntry {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
//demonstartion of linked hash map code
        map.put(1, "kavya");
        map.put(2, "Jayaram");
        map.put(3, "Sagar");
        map.put(4, "Bhanu");
        System.out.println("intial map:" + map);
        map.put(5,"konduru");
        System.out.println("\nafter adding key 5" +map);
        System.out.println("\nfinal Order:");
        for(Map.Entry<Integer,String> entry : map.entrySet()) { // for going through each element
            System.out.println(entry.getKey() + "->" +entry.getValue());
        }
    }
}
