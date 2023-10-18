package org.example.thread.p01thread.stream.p06buildInInterface;

import java.util.function.BinaryOperator;

public class C09BinaryDemo {
    public static void main(String[] args) {

//        BiFunction<Human,Human,Human> function1

        BinaryOperator<Human> operator1=(human, human2) -> {
            return new Human(12);
        };

        BinaryOperator<String> operator2=(s, s2) -> s.concat(s2);

        BinaryOperator<String> operator3=String::concat;
    }
}
