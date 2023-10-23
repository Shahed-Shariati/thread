package org.example.thread.p01thread.src.p02generics;

public class Test3MyArray<T> {
    T[] data= (T[]) new Object[3];
    int length=0;
    public void append(T v)
    {
        data[length++]=v;
    }
    public void display()
    {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}

class Test2{
    public static void main(String[] args) {
        Test3MyArray<Integer> list1=new Test3MyArray<>();
        list1.append(10);
        list1.append(20);
        list1.append(30);
        list1.display();

        Test3MyArray<String> list2=new Test3MyArray<>();
        list2.append("10");
        list2.append("20");
        list2.append("30");
        list2.display();

        Test3MyArray<Object> list3=new Test3MyArray<>();
        list3.append("10");
        list3.append(20);
        list3.append("30");
        list3.display();
    }
}
