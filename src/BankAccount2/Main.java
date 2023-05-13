package BankAccount2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accountList = new ArrayList<>();
        BankAccount account1 = new BankAccount("Felipe", 1000000, 1);
        BankAccount account2 = new BankAccount("Singapore", 1000000, 2);
        accountList.add(account1);
        accountList.add(account2);

        Scanner userInput = new Scanner(System.in);

        while(true){
            System.out.println("Are you an existing customer? (-1 to exit)");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int choice = userInput.nextInt();

            if (choice == 1) {
                System.out.println("Enter the account number: {Your choices are 1 or 2}");
                int accountNumber = userInput.nextInt();
                boolean accountFound = false;


                for (BankAccount account : accountList) {
                    if (account.getAccountNumber() == accountNumber) {
                        mainMenu(account, accountList);
                        accountFound = true;
                        break;
                    }
                }

                break;

            } else if (choice == 2) {
                BankAccount newAccount = new BankAccount();
                accountList.add(newAccount);
                System.out.println("");
                mainMenu(newAccount, accountList);
                break;
            } else if (choice == -1) {
                System.out.println("Have a nice day!! Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    public static void mainMenu(BankAccount account, List<BankAccount> accountList){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome " + account.getHolderName() + "!");
        while (true){
            System.out.println("Welcome to the Main Menu, what would you like to do today?");
            System.out.println("1. Account Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Make a Transfer to another account");
            System.out.println("0. Exit");
            int choice = userInput.nextInt();

            if (choice == 1) {
                account.printAccountDetails();

            } else if (choice == 2) {
                Scanner prompt = new Scanner(System.in);
                System.out.println("How much would you like to withdraw?");
                double amount = prompt.nextDouble();
                account.withdrawal(amount);

            } else if (choice == 3) {
                Scanner prompt = new Scanner(System.in);
                System.out.println("How much would you like to deposit?");
                double amount = prompt.nextDouble();
                account.deposit(amount);

            } else if (choice == 4) {
                Scanner prompt = new Scanner(System.in);
                System.out.println("Please enter the account number you would like to transfer to? {Your choices are 1 or 2}");
                int accountNumber = prompt.nextInt();


                if (accountNumber == 1 || accountNumber == 2) {
                    System.out.println("How much would you like to transfer?");
                    double amount = prompt.nextDouble();

                    boolean accountToFound = false;
                    for (BankAccount accountTo : accountList) {
                        if (accountTo.getAccountNumber() == accountNumber) {
                            account.bankTransfer(accountTo, amount);
                            accountToFound = true;
                            break;
                        }
                    }

                } else {
                    System.out.println("Invalid account number");
                }
                        } else if (choice == 0) {
                System.out.println("Have a nice day!! Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}