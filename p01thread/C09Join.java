package org.example.thread.p01thread;

public class C09Join {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1");
        Thread t1 = new Thread(() -> System.out.println("2"));
        new Thread(() -> {
            for (int i = 0; i <100 ; i++) {
                System.out.println(i);
            }
        }).start();
        t1.start();

        t1.join();
        System.out.println("3");
        Thread t2 = new Thread(() -> System.out.println("4"));
        t2.start();
        t2.join();
        System.out.println("5");
    }
}
