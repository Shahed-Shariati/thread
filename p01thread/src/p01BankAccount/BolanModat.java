package org.example.thread.p01thread.src.p01BankAccount;

public final class BolanModat  extends Passandaz {
    public BolanModat(int number, String owner, long balance) {
        super(number, owner, balance);
    }

    @Override
    public void addInterest() {
        float interestRate=1.24f;
        setBalance((long) (getBalance()*interestRate));
    }
}
