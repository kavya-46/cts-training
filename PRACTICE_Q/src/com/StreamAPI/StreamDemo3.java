package com.StreamAPI;

import java.nio.file.DirectoryIteratorException;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.Random;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        //java allows for stream source   int, long,double
        //single primitive data- not allowed
        //but stream source can be used to store primitve data type
        //IntStream LongStream doubleStream
        //   IntStream.of(3,4,5,2).forEach(System.out::println);
//IntStream.range(10,100).filter(n->n%2==0).forEach(System.out::println);
        //  IntStream.rangeClosed(10,100).filter(n->n%2==0).forEach(System.out::println); //100 will be included
//IntStream.iterate(1,n->n+3).limit(12).forEach(System.out::println);
//IntStream.of(5,6,7,8,7,10,21).limit(10).forEach(System.out::println); //it will print upto 10 values

//        IntStream.iterate(1, {
////fibonacci code
//        }).limit(10).forEach(System.out::println);
//    }

//        IntPredicate ip = new IntPredicate() {
//            @Override
//            public boolean test(int value) {
//                return value<=30;
//            }
//        };
      //  IntStream.iterate(1,ip,n->n+3).forEach(System.out::println);
//A Supplier is used when you want to generate or supply values without needing any input.
//Think of it as a factory that produces objects or values on demand.
//skips the first 10 values
        //IntStream.iterate(1,n->n<=50,n->n+3).limit(10).skip(2).forEach(System.out::println);
//        IntSupplier is=new IntSupplier() {
//            @Override
//            public int getAsInt() {
//              //  return 1;
//                return new Random().nextInt();
//            }
//        };
    //   long count = IntStream.generate(()->new Random().nextInt(100)).limit(100).distinct().count();


//   IntStream.generate(()->new Random().nextInt(100))
//           .limit(100)
//           .distinct()
//           .filter(n->n%2==0)
//           .forEach(System.out::println);


//        IntStream is1 = IntStream.of(5,6,71,2);
//        IntStream is2 = IntStream.rangeClosed(10,20); //prints vaues from 10 to 20
      //  IntStream.concat(is1,is2).forEach(System.out::println);


//        int[] arr = IntStream.concat(is1,is2).toArray();
//        System.out.println(Arrays.toString(arr));


//        List<Integer> list = List.of(500,1,2,3,3,45,24,123);
//        Object[] arr = list.stream().distinct().sorted().toArray();
//        System.out.println(Arrays.toString(arr));


      //  Stream.of(1,3,5,6,"hello").forEach(System.out::print); - it gives object as output, it takes mutliple datatypes, it accepts wrapper class

       //we cannot use forEach here, bcoz .count is also a terminal op-counts the no of values to be printed
        //distinct- counts the no.of values which are distinct

      //  System.out.println(count);

        String s = "idli is my favourite brkfst\n iam missing my mother's made idli\nidli";
        //1.chars, words,multilines. sentence
        //System.out.println(s);
      //  s.lines().limit(1).distinct().forEach(System.out::println);
        //s.lines().map(s1->s1.length()).forEach(System.out::println);
        //s.split(""); //it returns a string array
        //Arrays.stream(s.split(" ")).forEach(System.out::println);

        //s.chars().forEach(System.out::println); //it returns ascii codes - we cannot convert into primitve char, int ->wrapper class
        s.chars().mapToObj(i->(char)i).filter(c->"aeiou".indexOf(c)<0).forEach(System.out::println);
        //primtive data-non primietve data- mapTOObj();
    }


}
