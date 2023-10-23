package org.example.thread.p01thread.stream.p01basic;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {

        //int[] num=new int[10];
        //loop ===>sum
        //avg


        //todo:functional paradigm
        //syntax
        //declarative programming
        IntStream intStream=IntStream.of(1,2,3);
        OptionalDouble average = intStream.average();
    }
}
