package org.example.thread.p01thread.src.p03interface;

public abstract  interface I {
   // int i;
   //void m(){};
   abstract void am();

   // final void m2(){};
   final static int i2=12;//generalization 100





}

abstract class AbstractClass{
    int i;
    void m(){};
   abstract void am();

    final void m2(){};
    final static int i2=12;
}


class ConcreteClass{
    int i;
    void m(){};
   final void m2(){};

   final static int i2=12;
}


