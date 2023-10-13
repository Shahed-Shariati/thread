package org.example.thread.p01thread;

public class C16Priority {
    public static void main(String args[]) {

        System.out.println("Wait for 1 minute");

       // Thread.currentThread().setPriority(Thread.MAX_PRIORITY);


        Counter high = new Counter(Thread.MAX_PRIORITY);
        Counter low = new Counter(Thread.MIN_PRIORITY);
        low.start();//counter
        high.start();//counter

        // Wait for 1 minute
        try {
            Thread.sleep(1*15*1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        low.stop();
        high.stop();

        // Wait for high/low threads to terminate.
        try {
            high.t.join();
            low.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //System.out.printf("High Priority Thread had %2.2f times more CPU time than low priority thread.\n", (double)high.count / low.count);
        System.out.print((double)high.count / low.count);
    }
}

class Counter implements Runnable {

    long count = 0;
    Thread t;
    private volatile boolean running = true;

    public Counter(int p) {
        t = new Thread(this);
        t.setPriority(p);
    }

    @Override
    public void run() {
        while (running) {
            count++;
        }
    }

    public void stop() {
        running = false;
    }

    public void start() {
        t.start();
    }

}
