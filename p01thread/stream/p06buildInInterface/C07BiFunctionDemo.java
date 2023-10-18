package org.example.thread.p01thread.stream.p06buildInInterface;

import java.util.function.BiFunction;

public class C07BiFunctionDemo {
    public static void main(String[] args) {
//        R apply(T t, U u);


        BiFunction<Human, Human, Human> function1=(human, human2) -> {
            return new Human(human.getAge()+human2.getAge());
        };


        BiFunction<String,String,String> function2=(s, s2) -> s+s2;
        BiFunction<String,String,String> function3=String::concat;
        System.out.println(function3.apply("sss", "bbbb"));


    }
}
