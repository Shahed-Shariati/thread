package org.example.thread.p01thread.src.p01BankAccount;

public abstract sealed class Passandaz  extends BankAccount permits KotahModat, BolanModat {
    public Passandaz(int number, String owner, long balance) {
        super(number, owner, balance);
    }



}
