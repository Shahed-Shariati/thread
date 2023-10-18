package org.example.thread.p01thread.stream.p08stream.p04intermediateOperation;

import java.util.stream.Stream;

public class IntermediateOperationDemo {
    public static void main(String[] args) {
        Stream<String> cars = Stream.of("BMW","BMW", "Benz", "Renault","Honda");
        Stream<String> cars2 = Stream.generate(() -> "BMW");

      /*  cars.filter(s -> s.startsWith("B"))
                .forEach(System.out::println);*/

        /*cars.distinct()
                .forEach(System.out::println);*/

//        cars.limit(2).forEach(System.out::println);
//        cars.skip(2).limit(2).forEach(System.out::println);

//        cars.map(s -> s.length()).forEach(System.out::println);

      //  cars.sorted(Comparator.reverseOrder()).forEach(System.out::println);

       /*  long count = cars.filter(s -> s.startsWith("B"))
                          .peek(System.out::println)
                          .count();
        System.out.println(count);*/

    }
}
