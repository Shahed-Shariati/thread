package org.example.thread.p01thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class C22ThreadPool3 {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);
       // ExecutorService executor = Executors.newSingleThreadExecutor();
        Collection tasks = new ArrayList();

        tasks.add(new Callable() {
            public Object call() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("1111");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return 0;
            }
        });

        tasks.add(new Callable() {
            public Object call() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("2222");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return 0;
            }
        });

        tasks.add(new Callable() {
            public Object call() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("3333");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return 0;
            }
        });

        tasks.add(new Callable() {
            public Object call() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("4444");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return 0;
            }
        });

        try {
            executor.invokeAll(tasks);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdown();

    }

}
