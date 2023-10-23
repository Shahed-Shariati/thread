package org.example.thread.p01thread.stream.p03lambdaExpression;

import java.util.*;

public class Project {
    public static void main(String[] args) {
/*//        Programmer programmer=ProgrammerFactory.getProgrammer("php");
        Programmer programmer = ProgrammerFactory3.getProgrammer("java");
        programmer.code();
        */






        Programmer aa = new Programmer() {
            @Override
            public void code(String s) {
                System.out.println("sss");
            }
        };




        Programmer abbas = (s) -> System.out.println( s +"Abbas is coding");


        List<String> ss = new ArrayList<>();

        Programmer abbas1 = new Abbas();



        abbas1.code("");





        Programmer abbas3 = (s) -> System.out.println( s +"Abbas is coding");
        abbas3.code("Hello");






    }
}
