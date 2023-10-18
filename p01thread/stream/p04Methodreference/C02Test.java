package org.example.thread.p01thread.stream.p04Methodreference;

public class C02Test {
    public static void main(String[] args) {

        C01Human ref1=new C01Human() {
            @Override
            public void speak() {
                System.out.println("hello world");
            }
        };

        ref1.speak();

        C01Human ref2=() ->System.out.println("salam donya");

        ref2.speak();

        ////


        C01NewHuman ref3= str -> "salam "+str;

        System.out.println( ref3.speak("mahsa"));;



        //method reference ::


        C01SuperHuman ref4=new C01SuperHuman();



        C01Human ref5 = ref4::harfzadan;

        C01NewHuman ref6= C01SuperHuman::harfzadan2;

        ref5.speak();
        System.out.println(ref6.speak("mahsa"));


        C01Human ref7=() -> {ref5.speak();};
        C01NewHuman ref8= str -> C01SuperHuman.harfzadan2(str);




    }
}
