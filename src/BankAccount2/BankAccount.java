package BankAccount2;

public class BankAccount {
    private String holderName;
    private double balance;

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;

    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public void printAccountDetails() {
        System.out.println(holderName + "'s account balance: " + balance);

    }
}
