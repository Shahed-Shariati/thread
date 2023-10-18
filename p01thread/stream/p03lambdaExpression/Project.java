package org.example.thread.p01thread.stream.p03lambdaExpression;

public class Project {
    public static void main(String[] args) {
//        Programmer programmer=ProgrammerFactory.getProgrammer("php");
        Programmer programmer = ProgrammerFactory3.getProgrammer("java");
        programmer.code();

    }
}
