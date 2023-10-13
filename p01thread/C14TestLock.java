package org.example.thread.p01thread;

public class C14TestLock {

    static C13ResourceLock obj = new C13ResourceLock();

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                System.out.println("Thread 1 Started...");
                C14TestLock.obj.m1();
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                System.out.println("Thread 2 Started...");
                C14TestLock.obj.m1();
            }
        };


        t1.setName("Thread 1");
        t1.start();

        try { Thread.sleep(2*1000); } catch(InterruptedException e) { }

        t2.setName("Thread 2");
        t2.start();

    }

}


