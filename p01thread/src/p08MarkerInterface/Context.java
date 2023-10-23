package org.example.thread.p01thread.src.p08MarkerInterface;

public class Context {//container
    public static void main(String[] args) {

        MyClass obj=new MyClass();

        if (obj instanceof Good)
            System.out.println("to khobi");
        if (obj instanceof Bad)
            System.out.println("to badi");

    }
}
