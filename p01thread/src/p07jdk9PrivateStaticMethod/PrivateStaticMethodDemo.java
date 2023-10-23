package org.example.thread.p01thread.src.p07jdk9PrivateStaticMethod;

public interface PrivateStaticMethodDemo {


    static void m1(){
       // m2();
        m3();
    }

    default void  m2()
    {
        m1();
        m3();
    }


    private static void m3(){

    }
}
class Test{
    public static void main(String[] args) {
        PrivateStaticMethodDemo.m1();
    }
}
