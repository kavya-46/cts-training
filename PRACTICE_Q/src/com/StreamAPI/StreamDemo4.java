package com.StreamAPI;

import java.util.stream.Stream;

import static java.util.stream.DoubleStream.builder;

/*
Stream sources
-stream builders
Stream operations
min()
max()
findFrist()
findAny()
reduce()
-all these are terminal operations
 */

/*
We use build() because the Stream builder is like a
container that collects elements until you’re ready
to “seal” it into an actual Stream.
 */
public class StreamDemo4 {
    public static void main(String[] args) {
        //Why use builder?
        //Dynamic construction: You can add elements conditionally or in different parts of your code, then finalize it later.
       // Stream.<Integer>builder().add(2).add(4).add(9).build().filter(n->n%2==0).forEach(System.out::println);
        //builder() - Creates a Stream.Builder<T> object, which is a mutable builder for constructing a stream step by step.
        // build Finalizes the builder and returns a Stream<T> containing all the elements you added.

        Stream<Integer> ss = Stream.<Integer>builder()
                .add(2)
                .add(3)
                .add(6)
                .build();

                ss.filter(n->n%2==0)
                        .forEach(System.out::println);
    }
}
