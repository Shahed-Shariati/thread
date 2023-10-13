package org.example.thread.p01thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class C21ThreadPool2 {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(4);

        executor.submit(new Runnable() {
            public void run() {
                for (int i=0; i<50; i++) {
                    System.out.println("1111");
                    try { Thread.sleep(100); } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        executor.submit(new Runnable() {
            public void run() {
                for (int i=0; i<50; i++) {
                    System.out.println("22222");
                    try { Thread.sleep(100); } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        executor.submit(new Runnable() {
            public void run() {
                for (int i=0; i<50; i++) {
                    System.out.println("333333");
                    try { Thread.sleep(100); } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        executor.submit(new Runnable() {
            public void run() {
                for (int i=0; i<50; i++) {
                    System.out.println("444444");
                    try { Thread.sleep(100); } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        executor.shutdown();

    }


}
