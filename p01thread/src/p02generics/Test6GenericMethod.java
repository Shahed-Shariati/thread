package org.example.thread.p01thread.src.p02generics;

public class Test6GenericMethod {


    static <E extends Number> void show(E... data){
        for (E e: data) {
            System.out.println(e);
        }
    }

    static  void show2(Test3MyArray<? extends Number> data){
        data.display();
    }


    public static void main(String[] args) {
//        show("ali","mahsa");
        show(12,12);


        //



       /* Test3MyArray<Integer> list1=new Test3MyArray<>();
        list1.append(12);
        list1.append(122);
        Test3MyArray<String> list2=new Test3MyArray<>();
        list2.append("asas");
        list2.append("asas");

        show2(list1);
//        show2(list2);*/
    }
}
