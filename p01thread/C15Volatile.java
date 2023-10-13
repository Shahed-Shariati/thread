package org.example.thread.p01thread;

public class C15Volatile {
    public static void main(String[] args) {
        My my=new My();
        my.start();
        System.out.println("befor sleep");

        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("after sleep");
        my.b=false;


    }
}

class My extends Thread
{

    public volatile  boolean b=true;
    @Override
    public void run() {
        while (b);
    }
}
