package org.example.thread.p01thread.stream.p06buildInInterface;

import java.util.function.UnaryOperator;

public class C08UnaryFunctionDemo {
    public static void main(String[] args) {

//     Function<Human,Human> function

        UnaryOperator<Human> operator1= human -> {
            return new Human(human.getAge()-5);
        };



        UnaryOperator<String> operator2=s -> s.toUpperCase();
        UnaryOperator<String> operator3=String::toUpperCase;

        System.out.println(operator3.apply("java"));
    }
}
