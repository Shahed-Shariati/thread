package org.example.thread.p01thread.src.p04jdk8DefaultMethod;

public interface DefaultMethodDemo {
    int i=10;
    void m1();
    void m2();
    void m3();
    //concrete method
   default void m5(){
       System.out.println("default impl");
   };
}

interface  I2 extends  DefaultMethodDemo{
    void m4();
}
class MyService implements I2{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m5() {

    }
}
