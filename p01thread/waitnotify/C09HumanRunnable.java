package org.example.thread.p01thread.waitnotify;

public class C09HumanRunnable implements Runnable {
    String name;
    public C09HumanRunnable(String name) {
        this.name = name;
    }
    void eat()
    {
        delay(30);
        System.out.println(name+" is eating!!!!");
    }
    void walk()
    {
        delay(40);
        System.out.println(name+" is walking!!!!");
    }

    @Override
    public void run() {
        for (;;){
            eat();
            walk();
        }
    }

    void delay(int duration)
    {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
