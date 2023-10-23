package org.example.thread.p01thread.src.p02generics;




class ArrayWithGeneric<T>{
    T[] data= (T[]) new Object[3];
}



public class Test2ArrayObject {
    public static void main(String[] args) {
        ArrayWithGeneric<Integer> gd=new ArrayWithGeneric<>();

        gd.data[0]=10;
        gd.data[1]=10;
        gd.data[2]=10;
       Integer s= gd.data[0];
    }


}
