package org.example.thread.p01thread.stream.p08stream.p05test;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        Stream.generate(() -> "Rana")
                .filter(s -> s.length()==4)
                .limit(4)
                .sorted()


                .forEach(System.out::println);


    }
}
