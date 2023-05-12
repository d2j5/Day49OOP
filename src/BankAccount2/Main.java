package BankAccount2;

import ClassObjectConstructors.BankAccount;
import ClassObjectConstructors.Product;

public class Main {
    public static void main(String[] args) {
        ClassObjectConstructors.BankAccount bankAccount = new ClassObjectConstructors.BankAccount("Mark", 500);

        //
        System.out.println("The balance is: "+bankAccount.getBalance());
        bankAccount.deposit(200);
        System.out.println("The new balance after your deposit is: "+bankAccount.getBalance());
        bankAccount.withdrawal(100);
        System.out.println("My account balance is: "+bankAccount.getBalance());
        bankAccount.printAccountDetails();

        ClassObjectConstructors.BankAccount bankAccount2 = new ClassObjectConstructors.BankAccount("Peter", 5000);
        ClassObjectConstructors.BankAccount bankAccount3 = new BankAccount("Maria", 300);
        bankAccount2.withdrawal(100);
        bankAccount3.deposit(100);
        bankAccount2.printAccountDetails();
        bankAccount3.printAccountDetails();

        Product gold = new Product("gold",80,20);
        gold.printProduct();
        gold.totalCost();
    }
}
