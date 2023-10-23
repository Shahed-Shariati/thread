package org.example.thread.p01thread.src.p02generics;

public class Test4SubType <T>{
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

class MyArray2<T> extends  Test4SubType<T>{

}
class Test3{
    public static void main(String[] args) {
        MyArray2<Integer> list1=new MyArray2();
        list1.append(12);

    }
}
