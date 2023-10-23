package org.example.thread.p01thread.src.p02generics;

public class Test5BoundedType <T extends A >{

    T[] data= (T[]) new Object[3];
    int length=0;
    public void append(T v)
    {
        data[length++]=v;
    }
    public void display()
    {
      /*  for (T x:data)
            System.out.println(x);*/
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
class Test4{
    public static void main(String[] args) {
        Test5BoundedType<B> list1=new Test5BoundedType<>();
        Test5BoundedType<C> list2=new Test5BoundedType<>();
        Test5BoundedType<A> list3=new Test5BoundedType<>();

    }
}

class A{}
class B extends A{}
class C extends B{}
