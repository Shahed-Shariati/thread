package org.example.thread.p01thread.stream.p05compare;

import java.util.Comparator;

public class C02CompareWithAge implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
       // return o1.getAge()-o2.getAge();
       // return o1.getAge()>o2.getAge()?1:-1;
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}
