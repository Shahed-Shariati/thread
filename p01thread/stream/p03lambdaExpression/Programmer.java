package org.example.thread.p01thread.stream.p03lambdaExpression;


public interface Programmer {
   void code(String s);



    default void test(){
        System.out.println("Test");
    };
}
