package org.example.thread.p01thread;

public class C11ShutDownHook {
    public static void main(String[] args) {
        System.out.println("main start");

        Thread t1 = new
                Thread(() -> {
            System.out.println("All resource closed!!!!");
        });

        Runtime.getRuntime().addShutdownHook(t1);


       // System.exit(0);
       // Runtime.getRuntime().halt(0);
        throw new RuntimeException();

      //  System.out.println("main end");
    }
}
