package org.example.thread.p01thread.stream.p03lambdaExpression;

@FunctionalInterface
public interface Programmer {
    void code();
    default void test(){
        System.out.println("Test");
    };
}
