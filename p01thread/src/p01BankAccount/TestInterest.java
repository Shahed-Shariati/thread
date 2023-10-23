package org.example.thread.p01thread.src.p01BankAccount;

public class TestInterest {
    public static void main(String[] args) {
        Jari jari1=new Jari(1,"mahsa",1000);
        Jari jari2=new Jari(1,"rana",1000);

        BolanModat acc3=new BolanModat(1,"mahsa",1000);
        KotahModat acc4=new KotahModat(1,"rana",1000);


        BankAccount[] bankAccount={
                new Jari(1,"mahsa",1000),
                new KotahModat(1,"mahsa",1000),
                new Jari(1,"mahsa",1000),
                new BolanModat(1,"mahsa",1000),
                new GharzolHasane(1,"mahsa",1000)
        };

        BankAccountService.InterestRun(bankAccount);

        for (BankAccount ba:bankAccount)
            System.out.println(ba.toString());
    }
}
