package org.example.thread.p01thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class C20ThreadPool {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newSingleThreadExecutor();
        executor.submit(new C03HumanRunnable("mohammad"));
    }
}
