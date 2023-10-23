package org.example.thread.p01thread.stream.p05compare;

import java.util.Comparator;

public class Human  {
    private int age;
    private String name;


    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    public static int compare(Human o1, Human o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}
