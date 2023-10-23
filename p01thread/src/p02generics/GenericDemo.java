package org.example.thread.p01thread.src.p02generics;

public class GenericDemo<T,S> {

    T i; //Integer i //String i....
    S j;
}

class Test{
    public static void main(String[] args) {
        GenericDemo<Integer,Integer> obj1=new GenericDemo<>();
        GenericDemo<String,Integer> obj2=new GenericDemo<>();
        obj2.i="";
    }
}
