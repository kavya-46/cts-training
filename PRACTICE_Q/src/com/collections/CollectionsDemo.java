package com.collections;

import java.lang.module.FindException;
import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        List<String> al = new ArrayList<>();
        // List al = new ArrayList();
        al.add("Jayaram");
        al.add("Bhanu");
        al.add("sagar");
        al.add("kavyaa");
        al.add(1,"Konduru");

        List<String> al2 = new ArrayList<>();
        al2.add("Jayaramayya");
        al2.add("BhanuPriya");
        al2.add("sagaruu");
        al2.add("kavyaa");
        //al2.clear()- the above 4 values will be removed
        al2.add(1,"Konduru");
//al2.clear();- all the elements in the list will be removed
al2.addAll(al);
        System.out.println(al.equals(al2)); //it will print true/false
        //if we change the order of the elements in the list- false will be printed
        System.out.println(al.get(1));
        System.out.println(al.isEmpty()); //tell whether the list is empty or not
        System.out.println(al.lastIndexOf("sagar"));
     //   System.out.println(al.indexOf("sagar")); //if the same name is present multiple times then it will print the index where it is present for the first
        System.out.println(al.contains("kavyaaaa")); //checks whether an element is present in the list or not
        System.out.println(al.indexOf("sagar"));
        System.out.println(al.remove(4));
        System.out.println(al2.removeAll(al));
        System.out.println(al.set(1,"daddy"));
        al.sort(String.CASE_INSENSITIVE_ORDER);  //comes in alphabetical order
        al.sort(Comparator.naturalOrder());
        System.out.println(al.subList(1,3));

        al2.addAll(3,al);
        for (String x : al2) {
            System.out.println(x);
            // System.out.println(hasNext(al));

        }

        System.out.println("for each loop");
        for (String x : al) {
            System.out.println(x);
            // System.out.println(hasNext(al));

        }
        System.out.println("for loop");
        for(int i=0;i<al.size();i++) { //for loop
            System.out.println(al.get(i));
        }

        System.out.println("lambda expression");
        al.forEach(a-> {  //lambda expression
            System.out.println(a);
        });

        System.out.println("For each remaining");
        Iterator<String> itr = al.iterator(); //for each remaining
           itr.forEachRemaining(a->{
               System.out.println(a);
           });

        ListIterator<String> itr2 = al.listIterator();
//we can print the output in both forward and backward dirn
        System.out.println("In forward direction");
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        System.out.println("In reverse direction");
        while(itr2.hasPrevious()) {
            System.out.println(itr2.previous());
        }
        System.out.println("using java 8 streams api ");
        al.stream()
                .filter(name ->name.startsWith("J"))
                .forEach(System.out::println);
    }
}