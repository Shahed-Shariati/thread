package org.example.thread.p01thread;

public class C07NewFormOfCreateThread {
    public static void main(String[] args) {

        //anonymous
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("A");
            }
        }).start();

        //lambda
        new Thread(()-> {
                System.out.println("B");

        }).start();

        //method reference
        new Thread(C07NewFormOfCreateThread::threadName).start();
    }

    static  void  threadName()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
