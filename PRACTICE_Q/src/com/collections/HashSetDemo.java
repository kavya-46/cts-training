package com.collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        //HashSet<int> h = new HashSet();
        h.add("kavya");
h.add("konduru");
h.add("kavya"); //duplicate value will not be printed

        Iterator it = h.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
      //  System.out.println(h);
    }
}



//
//                        list---------------------- Set
//follows insertion order- yes                      no
// duplicate values      - yes                      no
//    index              - yes                      no


//set interface - has 3 classes
//1)hashSet - intial capcity - 16, if we inc,it doubles
//2)LinkedHashSet
//3)TreesSet
