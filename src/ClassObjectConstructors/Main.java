package ClassObjectConstructors;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Mark", 500);

        //
         System.out.println("The balance is: "+bankAccount.getBalance());
         bankAccount.deposit(200);
        System.out.println("The new balance after your deposit is: "+bankAccount.getBalance());
        bankAccount.withdrawal(100);
        System.out.println("My account balance is: "+bankAccount.getBalance());
        bankAccount.printAccountDetails();

        BankAccount bankAccount2 = new BankAccount("Peter", 5000);
        BankAccount bankAccount3 = new BankAccount("Maria", 300);
        bankAccount2.withdrawal(100);
        bankAccount3.deposit(100);
        bankAccount2.printAccountDetails();
        bankAccount3.printAccountDetails();


    }

}
