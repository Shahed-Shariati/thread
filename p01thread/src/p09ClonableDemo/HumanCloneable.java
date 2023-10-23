package org.example.thread.p01thread.src.p09ClonableDemo;

public class HumanCloneable implements Cloneable{
    
    char d;
    char n;
    char a;

    {
        System.out.println("Running Initialization Block...");
    }

    public HumanCloneable() {
        System.out.println("Running Human Constructor()...");
    }

    @Override
    protected HumanCloneable clone() throws CloneNotSupportedException {
        return (HumanCloneable) super.clone();
    }

//    public Human myClone() throws CloneNotSupportedException {
//        return (Human) super.clone();
//    }

}
