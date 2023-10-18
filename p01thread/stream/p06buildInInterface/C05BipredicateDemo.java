package org.example.thread.p01thread.stream.p06buildInInterface;

import java.util.function.BiPredicate;

public class C05BipredicateDemo {
    public static void main(String[] args) {


//        boolean test(T t, U u);

        BiPredicate<Human, Human> predicate1 = (human, human2) -> {
            return true;
        };

        BiPredicate<String,String> predicate2=(s, s2) -> s.startsWith(s2);

        System.out.println(predicate2.test("sha", "l"));

        BiPredicate<String,String> predicate3 = String::startsWith;

        boolean test = predicate3.test("chicken", "ch");
        System.out.println(test);
    }
}
