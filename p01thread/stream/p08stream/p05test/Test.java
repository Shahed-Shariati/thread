package org.example.thread.p01thread.stream.p08stream.p05test;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
       // void print(String str)
        
        // def print(self,String str)

        Stream.generate(() -> "Rana") // Rana Rana Rana Rana Rana .......
                .filter(s -> s.length()==4) // length()==4
//                .limit(4)
                .sorted()
                .mapToInt((s) -> s.length())
                .forEach(System.out::println);


    }
}
