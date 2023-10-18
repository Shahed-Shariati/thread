package org.example.thread.p01thread.stream.p08stream.p01optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        //box  ==>1 empty 2 full of obj

        Optional<String> empty = Optional.empty();

        Optional<String> hello = Optional.of("hello");


        //if //loop

        if (empty.isEmpty())
            System.out.println("empty");


        empty.ifPresent(s -> System.out.println(s));


//         if() {} else {}

        empty.ifPresentOrElse(s -> System.out.println(),() -> {
            System.out.println("it is empty");
        });

        String value="12";

       Optional o= (value==null)?Optional.empty():Optional.of(value);


       o.orElse("heloo 2");

       o.orElseGet(() -> "hello");
    }
}
