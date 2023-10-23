package org.example.thread.p01thread.src.p01BankAccount;

public class TestTransfer {
    public static void main(String[] args) {
        Jari jari1=new Jari(1,"mahsa",1000);
        Jari jari2=new Jari(2,"raha",1000);


        BankAccountService.transfer(jari1,jari2,100);

//        BankAccountService.transfer1(jari1,jari2,100);

       /* System.out.println(jari1.getBalance());
        System.out.println(jari2.getBalance());*/



        BolanModat acc3=new BolanModat(1,"mahsa",1000);
        KotahModat acc4=new KotahModat(2,"raha",1000);

        BankAccountService.transfer1(acc3,acc4,100);



        System.out.println(acc3.getBalance());
        System.out.println(acc4.getBalance());


        //General
//        BankAccountService.transfer("asasa","sdsdsd",1000);
    }
}
