package org.example.thread.p01thread.stream.p05compare;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Human[] humans={
                new Human(23,"nahid"),
                new Human(5,"ashkan"),
                new Human(56,"reza"),
                new Human(34,"mahsa"),
                new Human(2,"zahra")
        };



        Arrays.sort(humans,(o1, o2) ->  o1.getName().compareTo(o2.getName()));
        Arrays.sort(humans,Human::compare);


        Arrays.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                // return o1.getAge()-o2.getAge();
                // return o1.getAge()>o2.getAge()?1:-1;
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        });

        for (Human h:humans)
            System.out.println(h);
    }
}
