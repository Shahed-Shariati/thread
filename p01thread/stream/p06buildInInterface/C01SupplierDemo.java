package org.example.thread.p01thread.stream.p06buildInInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class C01SupplierDemo {
    public static void main(String[] args) {
//        T get();
//        LocalDate now()

        Supplier<String> supplier1=() ->  "Hello lamda";

        System.out.println(supplier1.get());

        Supplier<Human> supplier2=() -> new Human(12);

        Human h = supplier2.get();

        Supplier<LocalDate> supplier3=() -> LocalDate.now();

        Supplier<LocalDate> supplier4 = LocalDate::now;

        System.out.println(supplier4.get());


        Supplier<ArrayList<String>> supplier5=() -> new ArrayList<>();

        Supplier<ArrayList<String>> supplier6=ArrayList::new;

    }
}
