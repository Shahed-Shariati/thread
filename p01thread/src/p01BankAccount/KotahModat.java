package org.example.thread.p01thread.src.p01BankAccount;

public final class KotahModat  extends Passandaz {
    public KotahModat(int number, String owner, long balance) {
        super(number, owner, balance);
    }

    @Override
    public void addInterest() {
        float interestRate=1.18f;
        setBalance((long) (getBalance()*interestRate));
    }
}
