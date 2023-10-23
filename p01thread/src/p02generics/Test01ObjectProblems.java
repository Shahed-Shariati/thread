package org.example.thread.p01thread.src.p02generics;

public class Test01ObjectProblems {
    public static void main(String[] args) {

        String str1 = new String("Hi");
        Object obj = new String("Hi");

        String str = (String) obj;//reference casting //down casting //problem 1


        obj = 12;
        String str2 = (String) obj;//problem 2























    }
}
