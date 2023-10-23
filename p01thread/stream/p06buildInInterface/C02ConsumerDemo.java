package org.example.thread.p01thread.stream.p06buildInInterface;

import java.util.function.Consumer;

public class C02ConsumerDemo {
    public static void main(String[] args) {
//        void accept(T t);

//        void println(String x)

        Consumer<String> consumer1 = (s) -> System.out.println(s);


//        Consumer<String> consumer1=(String entity) -> repository.save(entity);

        consumer1.accept("s");


        Consumer<Human> consumer2 = human -> System.out.println(human);

//        Consumer<Human> consumer2 = human -> repository.save(human);

        consumer2.accept(new Human(12));

        Consumer<String> consumer3 = System.out::println;

        consumer3.accept("mahsa");
    }
}
