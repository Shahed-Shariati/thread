package org.example.thread.p01thread.src.p01BankAccount;

public abstract class BankAccount {
    private int number;
    private String owner;
    private  long balance;//BigDecimal
    public BankAccount(int number, String owner, long balance) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
    }


    public void deposit(long amount)
    {
        balance+=amount;
    }
    public void withdraw(long amount)
    {
        balance-=amount;
    }



    public abstract void addInterest();


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}
