package org.example.thread.p01thread;

public class C01Human {


    String name;


    public C01Human(String name) {
        this.name = name;

    }

    void eat()
    {
        System.out.printf("%s is eating",this.name);
    }
    void walk()
    {
        System.out.printf("%s is walking",this.name);
    }
    void talk()
    {
        System.out.printf("%s is talking",this.name);
    }
}
