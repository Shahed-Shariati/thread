package org.example.thread.p01thread.src.p01BankAccount;

public class BankAccountService {
    //

 /*   public static void transfer(Jari acc1, Jari acc2, long amount) {
       acc1.withdraw(amount);
       acc2.deposit(amount);
    }*/


    public static <T extends BankAccount> void transfer1(T acc1, T acc2, long amount) {
        acc1.withdraw(amount);
        acc2.deposit(amount);

    }


  /*  public static void transfer(Object acc1, Object acc2, long amount) {
        ((BankAccount)acc1).withdraw(amount);
        ((BankAccount)acc2).deposit(amount);
    }*/

    public static void transfer(Object acc1, Object acc2, long amount) {

        if (acc1 instanceof BankAccount) {
            ((BankAccount) acc1).withdraw(amount);
        }
        if (acc2 instanceof BankAccount) {
            ((BankAccount) acc2).deposit(amount);
        }

    }

    public static void InterestRun(BankAccount[] bankAccounts) {
        for (BankAccount ba : bankAccounts)
            ba.addInterest();
    }


}
