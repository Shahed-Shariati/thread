package org.example.thread.p01thread;

public class C02Test {
    public static void main(String[] args) {


        C01Human nika=new C01Human("nika");
        C01Human mahsa=new C01Human("mahsa");
        C01Human nader=new C01Human("nader");


        nika.eat();//block
        mahsa.walk();
        nika.walk();

        mahsa.walk();
    }
}
