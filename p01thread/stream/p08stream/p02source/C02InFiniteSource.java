package org.example.thread.p01thread.stream.p08stream.p02source;

import java.util.stream.Stream;

public class C02InFiniteSource {
    public static void main(String[] args) {
        Stream<Double> generate = Stream.generate(Math::random);
        generate.forEach(System.out::println);

       /* Stream<Integer> iterate = Stream.iterate(1, integer -> integer + 2);
        iterate.forEach(System.out::println);*/

       /* Stream<Integer> iterate = Stream.iterate(1, integer -> integer < 100, integer -> integer + 2);
        iterate.forEach(System.out::println);*/
    }
}
