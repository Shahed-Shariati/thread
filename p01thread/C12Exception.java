package org.example.thread.p01thread;

public class C12Exception {
    public static void main(String[] args) {
        System.out.println("main start");
        new Thread(() -> {throw  new RuntimeException();}).start();
        new Thread(() -> {throw  new RuntimeException();}).start();
        new Thread(() -> {throw  new RuntimeException();}).start();
        System.out.println("main end");
    }
}
