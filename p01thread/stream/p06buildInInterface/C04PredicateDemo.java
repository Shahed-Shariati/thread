package org.example.thread.p01thread.stream.p06buildInInterface;

import java.util.function.Predicate;

public class C04PredicateDemo {
    public static void main(String[] args) {

//        boolean test(T t);
//        boolean isEmpty(T t)

        Predicate<Human> predicate1= human -> {
            if (human.getAge()>19)
                return true;
            return false;
        };

        boolean test = predicate1.test(new Human(20));

        System.out.println(test);

        Predicate<String> predicate2= s -> s.isEmpty();

        String test1 = "sss";

        test1.isEmpty();

        Predicate<String> predicate3 = String::isEmpty;

    }
}
