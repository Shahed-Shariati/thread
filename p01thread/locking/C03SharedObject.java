package org.example.thread.p01thread.locking;


/* Shared Object */
public class C03SharedObject {

    private volatile int amount;

    public C03SharedObject(int amount) {
        this.amount = amount;
    }

    /* Critical Section WC*/
    /*synchronized*/ void change() { // at the end, makes no change to the field!

        for (int i = 0; i < 3; i++) {
            amount = amount + 1;
            delay(delay); // Delay is added to show the non-atomic behaviour of methods
            amount = amount - 1;
        }


        ///
        ///
        ///dfdf
      /*  synchronized (this){

        }*/
    }

    public int getAmount() {
        return amount;
    }

    int delay = 50;
    void delay(int d) {
        try { Thread.sleep(d); } catch(InterruptedException e) { e.printStackTrace(); }
    }

}
