package org.example.thread.p01thread.stream.p02sam;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

    //Single Abstract Method (SAM)
     void m1();
//     void m6();



    default void m2(){}
    default void m3(){}
    default void m4(){}
    default void m5(){}
}
