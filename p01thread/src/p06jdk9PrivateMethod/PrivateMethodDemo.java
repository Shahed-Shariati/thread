package org.example.thread.p01thread.src.p06jdk9PrivateMethod;

public interface PrivateMethodDemo {

    //reuse in default method

   private void checkService()
    {

    }

    default void m(){
        checkService();
    }

    default void m2()
    {
        checkService();
    }
}
