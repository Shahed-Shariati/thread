package org.example.thread.p01thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class C19FutureDemo {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        System.out.println("Before submit...");

        Future<Integer> f = executor.submit(new Callable() {

            public Object call() throws Exception {

                int sum =0;
                for (int i=0; i<10; i++) {
                    sum += i;
                    try {
                        Thread.sleep(500);
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return sum;

            }

        });

        System.out.println("After submit...");

        System.out.println("before get...");

        if (!f.isDone())
            System.out.println("Still working...");

        try {
            Integer value = f.get();//block!=asynchronous
            System.out.println(value);
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("End of main...");

        executor.shutdown();

    }

}
