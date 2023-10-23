package org.example.thread.p01thread.stream.p06buildInInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class C03BiConsumerDemo {
    public static void main(String[] args) {

//        void accept(T t, U u);




        BiConsumer<Human, Human> consumer1=(human1, human2) -> {

        };


        BiConsumer<String,String> consumer2 = (s, s2) -> {
            var map=new HashMap<String,String>();
            map.put(s,s2);

        };






        Map map2=new HashMap<String,Integer>();



        //  void accept(String t, Integer u){
        //   map2.put(s,integer);
        //  }



        //  ( t,  u) -> {
        //   map2.put(s,integer);
        //  }

        BiConsumer<String,Integer> consumer3= (s, integer) -> map2.put(s,integer);











        BiConsumer<String,Integer> consumer4= map2::put;


    }







}
