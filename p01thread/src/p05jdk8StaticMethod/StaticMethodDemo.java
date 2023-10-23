package org.example.thread.p01thread.src.p05jdk8StaticMethod;


interface I{
     default void  m1(){
        System.out.println("default method");
        m2();
    }

    static  void  m2(){
        System.out.println("sattic method");
    }


}

class  M2 implements I{

}
public class StaticMethodDemo {
    public static void main(String[] args) {

        I.m2();


    }
}
