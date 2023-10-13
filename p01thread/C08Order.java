package org.example.thread.p01thread;

public class C08Order {
    public static void main(String[] args) {

        System.out.println("1");
        new Thread(() -> System.out.println("2")).start();
        System.out.println("3");
        new Thread(() -> System.out.println("4")).start();
        System.out.println("5");

    }
}
