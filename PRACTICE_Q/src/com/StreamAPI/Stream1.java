package com.StreamAPI;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> number = List.of(1, 2, 6, 45, 5);

        //Function<Integer,Integer> fun t->t*t;
        //.map(t->t*t)
        Function<Integer,Integer> fun = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer t) {
                return t*t;
            }
        };
        //consumer- functional interface- that takes values
        //   Predicate - funcitonal interface
        //here the predicate gives result the boolena value
//        Predicate<Integer> pred = new Predicate<Integer>() { //start of ananymous class
//            @Override
//            public boolean test(Integer i) {
////                if(integer % 2==0)
////                    return true;
////                else
////                return false;
//                return i%2==0;
//            }
        // };
       // Predicate<Integer> pred =integer -> integer%2 == 0;



         //end of anonymous class
        //long count - used for stream interface
    //   long count =  number.stream().filter(pred).count(); //intermediate opr
    //    System.out.println("total no of even number is "+count);


        //if we want to print only numbers
        //peek- allows vewing element wihtout modifying stream
     long count = (int)  number.stream().sorted().filter(t->t%2==0).map(fun).peek(System.out::println).count(); //passing the lambda function into the code
        number.stream().filter(t->t%2==0).sorted(Comparator.reverseOrder()).forEach(System.out::println);  //both will give the same value

        /*
        //transforming int data to char
        int count = (int) numbers.stream()
        .filter(t->t%2==0)
        .sorted()
        .map(t -> {
        String s = "*"
        for(int i=1;i<=t;i++)
        s += "*";
        return s;})

         */
    }
}


/*
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t); // The single abstract method
}


Predicate<Integer> pred = new Predicate<Integer>() {
    @Override
    public boolean test(Integer i) {
        return i % 2 == 0;
    }
};


Predicate<Integer> pred = i -> i % 2 == 0;
 */