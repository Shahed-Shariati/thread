package org.example.thread.p01thread;

public class C18sleep {
    public static void main(String[] args) {

        Thread myThread = new Thread() {
            @Override
            public void run() {
                System.out.println("I want to sleep for 10 seconds.");
                try { Thread.sleep(10*1000); } catch(InterruptedException e) {
                    System.out.println("interrupt me?!!!");
                }
            }
        };

        myThread.start();

        try { Thread.sleep(3*1000); } catch(InterruptedException e) { }

        myThread.interrupt();

    }

}
