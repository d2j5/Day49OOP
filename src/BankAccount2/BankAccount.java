package BankAccount2;
import java.util.Scanner;
import java.util.Random;
public class BankAccount {
    private String holderName;
    private double balance;
    private int accountNumber;

    public BankAccount(String holderName, double balance, int accountNumber) {
        this.holderName = holderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public BankAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's make a new account!");

        System.out.println("What is the name for the account?");
        this.holderName = scanner.nextLine();

        System.out.println("What is the beginning balance for the account?");
        this.balance = scanner.nextDouble();

        int lowerBound = 1;
        int upperBound = 5;
        Random random = new Random();
        this.accountNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

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

    public double deposit(double amount) {
        this.balance += amount;
        System.out.println(this.holderName + "'s account balance: " + this.balance);
        System.out.println("");
        return this.balance;
    }


    public double withdrawal(double amount) {
        this.balance -= amount;
        System.out.println(this.holderName + "'s account balance: " + this.balance);
        System.out.println("");
        return this.balance;
    }

    public void printAccountDetails() {
        System.out.println(holderName + "'s account balance: " + balance);
        System.out.println("");
    }
    public void bankTransfer(BankAccount accountTo, double amount) {
        withdrawal(amount);
        accountTo.deposit(amount);
        System.out.println("Transfer successful");
        System.out.println("");
    }

       @Override
    public String toString() {
        return "BankAccount{" +
                "holderName='" + holderName + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }
}

