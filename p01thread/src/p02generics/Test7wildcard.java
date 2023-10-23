package org.example.thread.p01thread.src.p02generics;

public class Test7wildcard {


    static  void show2(Test3MyArray<? super F> data){
        data.display();
    }

    public static void main(String[] args) {
        Test3MyArray<F> list1=new Test3MyArray<>();

        Test3MyArray<G> list2=new Test3MyArray<>();


        show2(list1);
      //  show2(list2);

    }
}

class E{}
class F extends  E{}
class G extends  F{}

