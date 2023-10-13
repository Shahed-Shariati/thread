package org.example.thread.p01thread;

public class C17ThreadInterrupt {
    public static void main(String[] args) {

        Thread person = new Thread() {
            @Override
            public void run() {

                int age = 1;
                while( !Thread.interrupted() ) { //  currentThread().isInterrupted(true);
                    System.out.println("I am " + age++ + " years old!");
                }
                // Clean-up code
            }
        };

        person.start();

        try { Thread.sleep(20); } catch(InterruptedException e) { }

        person.interrupt();

    }
}
