package org.example.thread.p01thread;

public class C06Test {
    public static void main(String[] args) {




        C05HumanThread zahra=new C05HumanThread("zahra");
        C05HumanThread mahsa=new C05HumanThread("mahsa");
        C05HumanThread nader=new C05HumanThread("nader");




     /*  Thread t1=new Thread(zahra);
       Thread t2=new Thread(mahsa);
       Thread t3=new Thread(nader);*/

       zahra.start();
       mahsa.start();
       nader.start();
    }
}
