package org.example.thread.p01thread.stream.p08stream.p02source;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class C01FiniteSource {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.empty();

        Stream<Integer> stream2 = Stream.of(1);

        Stream<Integer> stream3 = Stream.of(1,2,3);


        //Collection
        List<Integer> list1 = List.of(1, 2, 3, 4);//findAll()
        Stream<Integer> stream4 = list1.stream();



        //Array
        Integer[] array2=new Integer[]{10,23,55};

        Stream<Integer> stream5 = Arrays.stream(array2);

        //

        stream5.filter((number) -> number > 24)
               .forEach(System.out::println);

        stream5.forEach(System.out::println);

       // stream5.forEach(System.out::println);

    }
}
