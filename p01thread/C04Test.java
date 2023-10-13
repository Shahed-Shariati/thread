package org.example.thread.p01thread;

public class C04Test {
    public static void main(String[] args) {




        C03HumanRunnable zahra=new C03HumanRunnable("zahra");
        C03HumanRunnable mahsa=new C03HumanRunnable("mahsa");
        C03HumanRunnable nader=new C03HumanRunnable("nader");




       Thread t1=new Thread(zahra);
       Thread t2=new Thread(mahsa);
       Thread t3=new Thread(nader);

       t1.start();
       t2.start();
       t3.start();
    }
}
