package org.example.thread.p01thread;

public class C10DaemonThread {
    public static void main(String[] args) {
        Thread t1=new Thread(() -> {

            for (int i = 0; i < 100; i++) {
                System.out.printf("t1 : %s of 100 \n",i);
                delay(10);
            }
        });

        Thread t2=new Thread(() -> {

            for (int i = 0; i < 400; i++) {
                System.out.printf("t2 : %s of 400 \n",i);
                delay(10);
            }
        });
//        t2.setDaemon(true);


        Thread t3=new Thread(() -> {

            for (int i = 0; i < 200; i++) {
                System.out.printf("t3 : %s of 200 \n",i);
                delay(10);
            }
        });

        t1.start();
        t2.start();
        t3.start();


    }

    static void  delay(int sec)
    {
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
