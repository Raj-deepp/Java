import java.util.Scanner;

abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance=balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance+=amount;
    }

    public void withdraw(double amount) {
        if (balance-amount>=0) {
            balance-=amount;
        } else {
            System.out.println("Insufficient funds in Savings Account");
        }
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    public void deposit(double amount) {
        balance+=amount;
    }

    public void withdraw(double amount) {
        if (balance-amount>=0) {
            balance-=amount;
        } else {
            System.out.println("Insufficient funds in Checking Account");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter initial balance for Savings Account: ");
        double savingsBalance=sc.nextDouble();
        BankAccount savingsAccount=new SavingsAccount(savingsBalance);
        
        System.out.print("Enter deposit amount for Savings Account: ");
        double savingsDeposit=sc.nextDouble();
        savingsAccount.deposit(savingsDeposit);
        
        System.out.print("Enter withdrawal amount for Savings Account: ");
        double savingsWithdrawal=sc.nextDouble();
        savingsAccount.withdraw(savingsWithdrawal);



        System.out.print("Enter initial balance for Checking Account: ");
        double checkingBalance=sc.nextDouble();
        BankAccount checkingAccount = new CheckingAccount(checkingBalance);

        System.out.print("Enter deposit amount for Checking Account: ");
        double checkingDeposit=sc.nextDouble();
        checkingAccount.deposit(checkingDeposit);

        System.out.print("Enter withdrawal amount for Checking Account: ");
        double checkingWithdrawal=sc.nextDouble();
        checkingAccount.withdraw(checkingWithdrawal);


        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());

    }
}
