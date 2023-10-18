package org.example.thread.p01thread.stream.p06buildInInterface;

import java.util.function.Function;

public class C06FunctionDemo {
    public static void main(String[] args) {

//        R apply(T t);

        Function<String,String> function1=s -> "hello "+s;
        System.out.println(function1.apply("Sha"));

        Function<String,Integer> function2=s -> s.length();
        Function<String,Integer> function3=String::length;

        System.out.println(function3.apply("Hello"));
    }
}
