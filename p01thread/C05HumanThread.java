package org.example.thread.p01thread;

public class C05HumanThread extends Thread {


    String name;


    public C05HumanThread(String name) {
        this.name = name;

    }

    void eat()
    {
        System.out.printf("%s is eating \n",this.name);
    }
    void walk()
    {
        System.out.printf("%s is walking\n",this.name);
    }
    void talk()
    {
        System.out.printf("%s is talking \n",this.name);
    }

    @Override
    public void run() {
        for (;;)
        {
            eat();
            talk();
            walk();
        }
    }
}
