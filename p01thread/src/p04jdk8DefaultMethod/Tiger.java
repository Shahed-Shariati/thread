package org.example.thread.p01thread.src.p04jdk8DefaultMethod;

interface Walk{
    default int speed(){
        return 5;
    }
}

interface Run{
    default int speed(){
        return 25;
    }
}





public class Tiger implements Walk,Run{

    @Override
    public int speed() {
        return Run.super.speed();
    }
}

class Test{
    public static void main(String[] args) {
        Tiger tiger=new Tiger();
        int speed = tiger.speed();
        System.out.println(speed);
    }
}
