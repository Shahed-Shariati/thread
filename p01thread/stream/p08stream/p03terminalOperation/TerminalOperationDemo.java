package org.example.thread.p01thread.stream.p08stream.p03terminalOperation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationDemo {
    public static void main(String[] args) {
        Stream<String> cars = Stream.of("BMW", "Benz", "Renault");
        Stream<String> cars2 = Stream.generate(() -> "BMW");


//        System.out.println(cars.count());
//
//        Optional<String> min = cars.min((o1, o2) -> o1.length() - o2.length());
//        min.ifPresent(System.out::println);


//        cars.findAny().ifPresent(System.out::println);
//        cars.findFirst().ifPresent(System.out::println);

//        cars2.findAny().ifPresent(System.out::println);

       /* boolean b = cars.anyMatch(s -> s.startsWith("B"));
        System.out.println(b);*/

        boolean b = cars.allMatch(s -> s.startsWith("B"));
        System.out.println(b);

       /* boolean b = cars.noneMatch(s -> s.startsWith("B"));
        System.out.println(b);*/


        //cars.forEach(System.out::println);

        //reduce
        //
//         cars.reduce((s, s2) -> s+s2).ifPresent(System.out::println);
        /* cars.map(s -> s.length())
                 .reduce((integer, integer2) -> integer+integer2)
                 .ifPresent(System.out::println);*/

        List<String> collect = cars.collect(Collectors.toList());

    }
}
